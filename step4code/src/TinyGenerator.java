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
       
	symboltable.tinySymbols();

	int i = 0;
	for(i=0;i<IRnodelist.nodeList.size();i++){
	    parseIR(IRnodelist.nodeList.get(i));
	}
    
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
	    optype = opcode.substring(0,1);
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    //  System.out.println(TinyList.get(TinyList.size()-1));

	}

	//binary ops
	if(opcode.startsWith("ADDI")){
	    //store first op to reg
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	   if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("addi "+op2+" "+result);
	    //    System.out.println(TinyList.get(TinyList.size()-1));
	    
	}

	if(opcode.startsWith("ADDF")){
	    //store first op to reg
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	   if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("addr "+op2+" "+result);
	    //  System.out.println(TinyList.get(TinyList.size()-1));
	    
	}

	//do some
	else if(opcode.startsWith("SUBI")){
	    //store first op to reg
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	   if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    // System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("subi "+op2+" "+result);
	    //  System.out.println(TinyList.get(TinyList.size()-1));
	    
	
	}

	else if(opcode.startsWith("SUBF")){
	    //store first op to reg
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	   if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    // System.out.println(TinyList.get(TinyList.size()-1));
		//add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("subr "+op2+" "+result);
	    //   System.out.println(TinyList.get(TinyList.size()-1));
	    
	
	}




	else if(opcode.startsWith("MULTI")){

	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    //   System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("muli "+op2+" "+result);
	    //    System.out.println(TinyList.get(TinyList.size()-1));

	}

	else if(opcode.startsWith("MULTF")){

	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    //  System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("mulr "+op2+" "+result);
	    //System.out.println(TinyList.get(TinyList.size()-1));

	}


	else if(opcode.startsWith("DIVI")){
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    //System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("divi "+op2+" "+result);
	    //System.out.println(TinyList.get(TinyList.size()-1));
	}

	else if(opcode.startsWith("DIVF")){
	    if(op1.startsWith("$")){
		if(isReg(op1))
		    op1 = getRegNum(op1);
		else
		    op1 =  addTinyRegister(op1);
	    }
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("move "+op1+" "+result);
	    System.out.println(TinyList.get(TinyList.size()-1));
	    //add second op to reg
	    if(op2.startsWith("$")){
		if(isReg(op2))
		    op2 = getRegNum(op2);
		else
		    op2 =  addTinyRegister(op2);
	    }
	    
	    TinyList.add("divr "+op2+" "+result);
	    // System.out.println(TinyList.get(TinyList.size()-1));
	}
	else if(opcode.startsWith("WRITEF")){
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("sys writer "+result);
	}
	else if(opcode.startsWith("WRITEI")){
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
	    TinyList.add("sys writei "+result);
	}
	else if(opcode.startsWith("READF")){
	    if(result.startsWith("$")){
		if(isReg(result))
		    result = getRegNum(result);
		else
		    result =  addTinyRegister(result);
	    }
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
	System.out.println(TinyList.get(TinyList.size()-1));   
    }
}