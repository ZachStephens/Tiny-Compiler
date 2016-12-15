import java.io.*;
import java.util.*;


public class NodeManager{
    private static Stack<String> opStack = new Stack<String>(); 


    public static void addExpressions(String op){
	String first = opStack.pop();
	String second = opStack.pop();
	String opcode = "";
	String result = "";
	String optype = "";

	if(op.equals("/"))
	    opcode = "DIV";
	else if(op.equals("*"))
	    opcode = "MULT";	
	else if(op.equals("+"))
	    opcode = "ADD";	
	else if (op.equals("-"))
	    opcode = "SUB";
	
	if(first.contains(".")){
	    optype = "F";
	}
	else if(first.matches("\\d+")){
	    optype="I";

	}else if(first.startsWith("$"))
	    optype = RegManager.getType(first);

	else{
	    optype = symboltable.getType(first).substring(0,1);
	}

	opcode.concat(optype);
	
	//	System.out.println("test: "+optype+" "+opcode+" "+first);

	result = RegManager.addRegister(optype);
	opStack.push(result);

	IRnode node1 = new IRnode(opcode+optype,second,first,result);
	IRnodelist.Addnode(node1);
	
    }
    

    public static void newAssignment(){

	String leftside = opStack.pop();
	String first = opStack.pop();
	String optype = "";

	if(first.contains(".")){
	    optype = "F";
	}
	else if(first.matches("\\d+")){
	    optype="I";

	}else if(first.startsWith("$")){
	    optype = RegManager.getType(first);	    
	}
	else{
	    optype = symboltable.getType(first);
	    optype.substring(0,1);
	}
	
	IRnodelist.Addnode(new IRnode("STORE"+optype,first,"",leftside));
    }
    
    public static void pushID(String id){
	// result for assignment
	opStack.push(id);
    }

    public static void pushLiteral(String literal){
	String optype = "";
	String result = "";
	if(literal.contains("."))
	    optype = "F";
	else
	    optype="I";
	
	result = RegManager.addRegister(optype);
	IRnodelist.Addnode(new IRnode("STORE"+optype,literal,"",result));
	opStack.push(result);
    }

    public static void addREAD(String idlist){
	String[] idarray = idlist.split("");
	int i = 0;
	String optype = "";
	for(i=0;i<idarray.length;i++){
	    optype = symboltable.getType(idarray[i]);
	    IRnodelist.Addnode(new IRnode("READ"+optype.substring(0,1),"","",idarray[i]));
	}
    }
    public static void addWRITE(String idlist){
	String[] idarray = idlist.split(",");
	int i = 0;
	String optype = "";
	for(i=0;i<idarray.length;i++){
	    optype = symboltable.getType(idarray[i]);
	    IRnodelist.Addnode(new IRnode("WRITE"+optype.substring(0,1),"","",idarray[i]));
	}
    }


    public static void addJump(){
	//	IRnodelist.Addnode(new IRnode("JUMP","","","Label"+Integer.toString(labelNum)));
    }

    public static void incLabel(){
	//labelNum++;
    }
    
    public static void decLabel(){
	//	labelNum--;
    }

    public static void addLabel(){
	//	IRnodelist.nodeList.Addnode(new IRnode("LABEL","","","Label"+Integer.toString(labelNum)));
    }
    
    public static void addCondition(String op){
    }


    

}
