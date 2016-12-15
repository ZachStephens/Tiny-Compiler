import java.io.*;
import java.util.*;


public class TinyGenerator{
    public static ArrayList<String> TinyList = new ArrayList<String>();
    private static  ArrayList<String> TinyRL= new ArrayList<String>();

    public static String addTinyRegister(String name){
	TinyRL.add(name);
	//System.out.println("Added: "+name);
	return "r"+Integer.toString(TinyRL.size()-1);
    }

    public static boolean isReg(String name){
	int i = 0;
	for(i=0;i<TinyRL.size();i++)
	    {
		if(TinyRL.get(i).equals(name))
		    return true;
	    }
	//System.out.println("not reg: "+name);
	return false;
    }

    public static String getRegNum(String name){
	int i = 0;
	for(i=0;i<TinyRL.size();i++)
	    {
		if(TinyRL.get(i).equals(name))
		    return "r"+Integer.toString(i);
	    }
	return "";
    }

    public static void generateTiny(){
	System.out.println(";tiny code");
	symboltable.tinySymbols();

	int i = 0;
	
	for(i=0;i<IRnodelist.nodeList.size();i++){
	    parseIR(IRnodelist.nodeList.get(i));
	}
	System.out.println("sys halt");
	
    }

    public static void parseIR(IRnode node1){
	String opcode = node1.opcode;
	String op1 = node1.op1;
	String op2 =node1.op2;
	String result = node1.result;
	String optype = "";

	//	node1.printNode();
	//	System.out.println(opcode);

	if(opcode.startsWith("STORE")){
	    String intermediate = grabOp(op1);;
	    if(!op1.startsWith("$") && !result.startsWith("$")){
		 intermediate = addTinyRegister(op1);
		 TinyList.add("move "+op1+" "+intermediate);
		 System.out.println(TinyList.get(TinyList.size()-1));
	    }
	    result = grabOp(result);
	    TinyList.add("move "+intermediate+" "+result);


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
	   result = grabOp(result);
	    TinyList.add("sys writer "+result);
	}

	else if(opcode.startsWith("WRITEI")){
	    result = grabOp(result);
	    TinyList.add("sys writei "+result);
	}

	else if(opcode.startsWith("READF")){
	    result = grabOp(result);
	    TinyList.add("sys readr "+result);
	}

	else if(opcode.startsWith("READI")){
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("sys readi "+result);
	}

	else if (opcode.startsWith("JUMP")){
	    TinyList.add("jmp "+result.toLowerCase());
	}
	
	else if (opcode.startsWith("LABEL")){
	    TinyList.add("label "+result.toLowerCase());
	}



	else if (opcode.equals("GT")||opcode.equals("GE")||opcode.equals("EQ")||
		 opcode.equals("LT")||opcode.equals("LE")||opcode.equals("NE")){

	    String type = "";
	    if(op1.startsWith("$")){
		type = RegManager.getType(op1);
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
		type = symboltable.getType(op1).substring(0,1);
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
	if(op.startsWith("$")){
		if(isReg(op))
		    return getRegNum(op);
		else
		    return addTinyRegister(op);
	    }
	return op;
    }
}

