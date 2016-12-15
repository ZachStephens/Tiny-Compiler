import java.io.*;
import java.util.*;


public class TinyGenerator{
    public static ArrayList<String> TinyList = new ArrayList<String>();
    private static  ArrayList<TinyReg> TinyRL= new ArrayList<TinyReg>();
    public static Function currentFun;
    public static Integer spillnum = 0;
    public static FlowNode currentFlow;



    public static String addTinyRegister(String name){
    	//TinyRL.add(name);
	//System.out.println("Added: "+name);
	String selectedReg = "";
	String id = "";
	int i;
	if(isReg(name)){
	    for(i=0;i<TinyRL.size();i++)
	    {
		if(TinyRL.get(i).contents.equals(name) && TinyRL.get(i).isOccupied()){	       
		    return "r"+Integer.toString(i);
		}
	    }
	}
	
	
	
	id = getRegNum(name);
	if(id.equals("")){
	    id = name;
	}

	if(name.startsWith("$R")){
	    return id;
	}
	if(!TinyRL.get(3).isOccupied()){
	    TinyRL.get(3).contents = name;
	    TinyRL.get(3).occupied = true;
	    TinyRL.get(3).dirty = false;
	    selectedReg = "r3";
	}else if(!TinyRL.get(2).isOccupied()){
	    TinyRL.get(2).contents = name;
	    TinyRL.get(2).occupied = true;
	    TinyRL.get(2).dirty = false;
	    selectedReg = "r2";
	}else if(!TinyRL.get(1).isOccupied()){
	    TinyRL.get(1).contents = name;
	    TinyRL.get(1).occupied = true;
	    TinyRL.get(1).dirty = false;
	    selectedReg =  "r1";
	}else if(!TinyRL.get(0).isOccupied()){
	    TinyRL.get(0).contents = name;
	    TinyRL.get(0).occupied = true;
	    TinyRL.get(0).dirty = false;
	    selectedReg =  "r0";
	}else{
	    for(i=TinyRL.size()-1;i>=0;i--){
		if(!currentFlow.doesUse(TinyRL.get(i).contents))
		    {
			spillReg(i);
			TinyRL.get(i).dirty = false;
			TinyRL.get(i).occupied = true;
			TinyRL.get(i).contents = name;
			selectedReg = "r"+Integer.toString(i);
			break;
		    }
	    }
	    //spill some reg
	}
	System.out.println(";putting "+name+" in "+selectedReg);
    	
	if((!name.startsWith("$T")) && (!name.startsWith("r"))){
	    TinyList.add("move "+id+" "+selectedReg);
	    System.out.println(TinyList.get(TinyList.size()-1));
	}else if(name.startsWith("$T")){
	    TinyList.add("move "+translate(name)+" "+selectedReg);
	    System.out.println(TinyList.get(TinyList.size()-1));
	}

	return selectedReg;
     }

    public static void spillAll(){
	int i = 0;
	System.out.println(";spilling all");
	for(i=0;i<TinyRL.size();i++)
	    {
		System.out.println(";checking if occupied: r"+i+":"+TinyRL.get(i).contents);
		if(TinyRL.get(i).isOccupied()){
		    spillReg(i);
		    TinyRL.get(i).dirty = false;
		}
	    }
    }

    public static boolean isReg(String name){
	int i = 0;
	for(i=0;i<TinyRL.size();i++)
	    {
		if(TinyRL.get(i).contents.equals(name) && TinyRL.get(i).isOccupied())
		    return true;
	    }
	//System.out.println("not reg: "+name);
	return false;
    }

    public static String getRegNum(String name){
	int i = 0;
	for(i=0;i<TinyRL.size();i++)
	    {
		if(TinyRL.get(i).contents.equals(name) && TinyRL.get(i).isOccupied())
		    return "r"+Integer.toString(i);
	    }

	


	if(name.startsWith("$L"))
	    return "$-"+name.substring(2);

	if(name.startsWith("$P"))
	    return "$"+Integer.toString(5+Integer.parseInt(name.substring(2)));


	if(name.startsWith("$R"))
	    return "$"+Integer.toString(currentFun.param_num+6);

	
	return name;
    }

    public static void Ensure(FlowNode flow){
	int i;
	currentFlow = flow;
	for(i=0;i<flow.useList.size();i++){
	    if(flow.opcode.equals("WRITES")){
		continue;
	    }
	    if(flow.useList.get(i).equals("")){
		continue;
	    }
	    addTinyRegister(flow.useList.get(i));
	}
	for(i=0;i<flow.defineList.size();i++){
	    if(flow.defineList.get(i).equals("")){
		continue;
	    }else{
	    assignReg(flow.defineList.get(i));
	    }
	}
    }

    public static String translate(String name){
	int i = currentFun.local_num;

	if(name.startsWith("$L"))
	    return "$-"+name.substring(2);

	if(name.startsWith("$T")){
	    return "$-"+Integer.toString(i+Integer.parseInt(name.substring(2)));
	}

	if(name.startsWith("$P"))
	    return "$"+Integer.toString(5+Integer.parseInt(name.substring(2)));


	if(name.startsWith("$R"))
	    return "$"+Integer.toString(currentFun.param_num+6);

	return name;
    }

    public static void spillReg(int reg){
	String name = TinyRL.get(reg).contents;
	String dest = "did not grab dest";
	dest = translate(name);
	System.out.println(";spilling r"+reg+" to "+name);
	TinyList.add("move r"+reg+" "+dest);
	TinyRL.get(reg).dirty = false;
	TinyRL.get(reg).occupied = false;
	System.out.println(TinyList.get(TinyList.size()-1));
    }


    public static void freeUnused(FlowNode flow){
	//check if any occupied registers are not live
	int i,j;
	TinyReg tr;
	//selectedReg = "";
	for(i=0;i<TinyRL.size();i++){
	    tr = TinyRL.get(i);
	    if(!flow.liveContains(tr.contents) && (tr.isOccupied())){
		if(tr.isDirty()){
		    spillReg(i);
		}
		System.out.println(";Freeing "+tr.contents+" from "+i);
		tr.contents = "";
		tr.occupied = false;
		tr.dirty = false;
	    }
	    
	}

	//if occupied register is no longer live move reg to $-(++spillnum)
    }

    public static String assignReg(String name){
	String selectedReg = "spilled---------------------------------------";
	if(isReg(name)){
	    selectedReg = getRegNum(name);
	    //System.out.println(selectedReg+"-----"+name);
	    TinyRL.get(Integer.parseInt(selectedReg.substring(1))).dirty = true;
	    
	    return selectedReg;
	}
	int i;
	if(!TinyRL.get(3).isOccupied()){
	    TinyRL.get(3).contents = name;
	    TinyRL.get(3).occupied = true;
	    TinyRL.get(3).dirty = true;
	    selectedReg = "r3";
	}else if(!TinyRL.get(2).isOccupied()){
	    TinyRL.get(2).contents = name;
	    TinyRL.get(2).occupied = true;
	    TinyRL.get(2).dirty = true;
	    selectedReg = "r2";
	}else if(!TinyRL.get(1).isOccupied()){
	    TinyRL.get(1).contents = name;
	    TinyRL.get(1).occupied = true;
	    TinyRL.get(1).dirty = true;
	    selectedReg =  "r1";
	}else if(!TinyRL.get(0).isOccupied()){
	    TinyRL.get(0).contents = name;
	    TinyRL.get(0).occupied = true;
	    TinyRL.get(0).dirty = true;
	    selectedReg =  "r0";
	}else{
	    for(i=TinyRL.size()-1;i>=0;i--){
		System.out.println(";contents: "+i+": "+TinyRL.get(i).contents);
		if(!currentFlow.doesUse(TinyRL.get(i).contents))
		    {
		
			spillReg(i);
			TinyRL.get(i).dirty = true;
			TinyRL.get(i).occupied = true;
			TinyRL.get(i).contents = name;
			selectedReg = "r"+Integer.toString(i);
			break;
		    }
	    }
	}
	System.out.println(";assigned "+name+" to "+selectedReg);
	return selectedReg;
    }


    public static void clearRegs(){
	int i;
	TinyReg tr;
	for(i=0;i<TinyRL.size();i++){
	    tr = TinyRL.get(i);
	    tr.contents = "";
	    tr.dirty = false;
	    tr.occupied = false;
	}
    }

    public static void generateTiny(){
	
	int j = 0;
	Function F1;
	int i = 0;

	TinyRL.add(new TinyReg());
	TinyRL.add(new TinyReg());
	TinyRL.add(new TinyReg());
	TinyRL.add(new TinyReg());
	//System.out.println("Tiny size is :"+TinyRL.size());



	IRnodelist.buildMaster();
	IRnodelist.printList();
	System.out.println(";tiny code");
	symboltable.tinySymbols();
	

	//System.out.println(";IR code");
		TinyList.add("push");
	System.out.println(TinyList.get(TinyList.size()-1));
	TinyList.add("push r0");
	System.out.println(TinyList.get(TinyList.size()-1));
	TinyList.add("push r1");
	System.out.println(TinyList.get(TinyList.size()-1));
	TinyList.add("push r2");
	System.out.println(TinyList.get(TinyList.size()-1));
	TinyList.add("push r3");
	System.out.println(TinyList.get(TinyList.size()-1));
	TinyList.add("jsr main");
	System.out.println(TinyList.get(TinyList.size()-1));
	TinyList.add("sys halt");
	System.out.println(TinyList.get(TinyList.size()-1));

	for( i=0;i< NodeManager.FunctionStack.size();i++){
	    F1 = NodeManager.FunctionStack.get(i);
	    currentFun = F1;
	    for(j = 0;j<F1.FlowList.size();j++){
	       	F1.FlowList.get(j).printFlow();
		if(F1.FlowList.get(j).isLeader()){ spillAll();}
		Ensure(F1.FlowList.get(j));
	       	
		parseIR(F1.FlowList.get(j));
		freeUnused(F1.FlowList.get(j));
		
		
	    }
	    clearRegs();
	    //System.out.println();
	    
	}
	TinyList.add("end");
	System.out.println(TinyList.get(TinyList.size()-1));

	
    }

    public static void parseIR(FlowNode node1){
	String opcode = node1.opcode;
	String op1 = node1.op1;
	String op2 =node1.op2;
	String result = node1.result;
	String optype = "";

	//	node1.printNode();
	//	System.out.println(opcode);


	if(opcode.startsWith("STORE")){
	    String second = "";
	    String intermediate = grabOp(op1);
	    //  System.out.println(intermediate+" "+op1);
	    if(!op1.startsWith("$") && !result.startsWith("$")){
		if(isReg(op1)){
		    intermediate = getRegNum(op1);
		}
		else{ 
		    intermediate = addTinyRegister(op1);
		}
		
	    }
	    // System.out.println("sda");
	    //second = grabOp(intermediate);
	    //System.out.println("second is in "+second);
	    if(result.startsWith("$R")){
	        second = addTinyRegister("$R");
		TinyList.add("move "+intermediate+" "+second);
		//	System.out.println(TinyList.get(TinyList.size()-1));
	    }
	    else{
		if(isVar(result)){
		    if(isReg(result)){
			result = getRegNum(result);
		    }
		    else{
			result = assignReg(result);
		    }
		}else
		    {
		    result = grabOp(result);
		}
		//System.out.println("here");
		TinyList.add("move "+intermediate+" "+result);
	    }

	}

	if(opcode.startsWith("SPILL")){
	    spillAll();
	    return;
	}


	//binary ops
	if(opcode.startsWith("ADDI")){
	    //store first op to reg
	    op1 = grabOp(op1);
	    result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    op2 = grabOp(op2);	    
	    TinyList.add("addi "+op2+" "+result);
	    //    System.out.println(TinyList.get(TinyList.size()-1));	    
	}
	if(opcode.startsWith("ADDF")){
	    //store first op to reg
	    op1 = grabOp(op1);
	   result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("addr "+op2+" "+result);
	    //  System.out.println(TinyList.get(TinyList.size()-1));	    
	}
	//do some

	else if(opcode.startsWith("SUBI")){
	    //store first op to reg
	    op1 = grabOp(op1);
	    result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("subi "+op2+" "+result);
	    //  System.out.println(TinyList.get(TinyList.size()-1));	  	
	}

	else if(opcode.startsWith("SUBF")){
	    //store first op to reg
	    op1 = grabOp(op1);
	   result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("subr "+op2+" "+result);
	    //   System.out.println(TinyList.get(TinyList.size()-1));	    	
	}
	else if(opcode.startsWith("MULTI")){
	    op1 = grabOp(op1);
	   result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("muli "+op2+" "+result);
	    //    System.out.println(TinyList.get(TinyList.size()-1));
	}

	else if(opcode.startsWith("MULTF")){
	    op1 = grabOp(op1);
	    result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("mulr "+op2+" "+result);
	    //System.out.println(TinyList.get(TinyList.size()-1));

	}


	else if(opcode.startsWith("DIVI")){
	    op1 = grabOp(op1);
	   result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("divi "+op2+" "+result);
	    //System.out.println(TinyList.get(TinyList.size()-1));
	}

	else if(opcode.startsWith("JSR")){
	    spillAll();
	    TinyList.add("push r0");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("push r1");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("push r2");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("push r3");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("jsr "+result.toLowerCase());
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("pop r3");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("pop r2");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("pop r1");
	    System.out.println(TinyList.get(TinyList.size()-1));
	    TinyList.add("pop r0");
	    
	}

	else if(opcode.startsWith("PUSH")){
	    op1 = grabOp(op1);
	    TinyList.add("push "+op1);
	    //System.out.println(TinyList.get(TinyList.size()-1));
	}

	else if(opcode.startsWith("POP")){
	    op1 = grabOp(op1);
	    TinyList.add("pop "+op1);
	    //System.out.println(TinyList.get(TinyList.size()-1));
	}

	else if(opcode.startsWith("LINK")){
	    TinyList.add("link "+currentFun.getlinkNum());//num of parameters
	}


	else if(opcode.startsWith("DIVF")){
	    op1 = grabOp(op1);
	    result = grabOp(result);
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    op2 = grabOp(op2);
	    
	    TinyList.add("divr "+op2+" "+result);
	    // System.out.println(TinyList.get(TinyList.size()-1));
	}

	else if(opcode.startsWith("WRITEF")){
	   result = getRegNum(result);
	    TinyList.add("sys writer "+result);
	}

	else if(opcode.startsWith("WRITEI")){
	    result = getRegNum(result);
	    TinyList.add("sys writei "+result);
	}

	else if(opcode.startsWith("WRITES")){
	    result = grabOp(result);
	    TinyList.add("sys writes "+result);
	}

	else if(opcode.startsWith("READF")){
	    if(result.startsWith("$")){
		//	System.out.println(result);//---------------------------------
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  getRegNum(result);
	    } result = grabOp(result);
	    TinyList.add("sys readr "+result);
	}

	else if(opcode.startsWith("READI")){
	    //   if(result.startsWith("$")){
	    //System.out.println(+result);//---------------------
	    
	    result =  getRegNum(result);
	    //}
	    TinyList.add("sys readi "+result);
	}

	else if (opcode.startsWith("JUMP")){
	    TinyList.add("jmp "+result.toLowerCase());
	}
	
	else if (opcode.startsWith("LABEL")){
	    TinyList.add("label "+result.toLowerCase());
	}
	else if (opcode.startsWith("RET")){
	     TinyList.add("unlnk");
	     System.out.println(TinyList.get(TinyList.size()-1)); 
	     TinyList.add("ret");
	}


	else if (opcode.equals("GT")||opcode.equals("GE")||opcode.equals("EQ")||
		 opcode.equals("LT")||opcode.equals("LE")||opcode.equals("NE")){

	    String type = "";
	    if(op1.startsWith("$")){
		//System.out.println(op1+"in"+currentFun.name);//------------------------
		type = currentFun.getType(op1);
		if(type.matches("F"))
		    type = "r";
		else if(type.matches("I"))
		    type = "i";
	    }
	    else if(op1.contains(".")){
		type = "r";
	    }else if(op1.matches("[0-9]+")){
		type = "i";
	    }else{
		type = currentFun.getType(op1).substring(0,1);
		if(type.matches("F"))
		    type = "r";
		else if(type.matches("I"))
		    type = "i";
	    }

	   
	    String intermediate = grabOp(op2);
	    if(!op1.startsWith("$") && !op2.startsWith("$")){
		intermediate = addTinyRegister(op2);
		TinyList.add("move "+op2+" "+intermediate);
		System.out.println(TinyList.get(TinyList.size()-1));
	    }

	    op1 = grabOp(op1);
	    //op2 = grabOp(op2);
   
	    TinyList.add("cmp"+type+" "+op1+" "+intermediate);
	    System.out.println(TinyList.get(TinyList.size()-1)); 
	    
	    TinyList.add("j"+opcode.toLowerCase()+" "+result);

	}


	System.out.println(TinyList.get(TinyList.size()-1));   
    }


    private static String grabOp(String op){	
	if(op.startsWith("$T")){
	    if(isReg(op))
		return getRegNum(op);
	    else
		return addTinyRegister(op);
	}
	
	if(op.startsWith("$")){
	    return getRegNum(op);
	}

	if(isVar(op)){
	    return getRegNum(op);
	}

	return op;
    }

    private static boolean isVar(String id){

	if(id.contains(".")){
	    return false;
	}
	else if(id.matches("\\d+")){
	    return false;

	}else if(id.startsWith("$"))
	    return false;

	return true;
    }
}

