import java.io.*;
import java.util.*;


public class NodeManager{
    private static Stack<String> opStack = new Stack<String>(); 
    private static Stack<String> labelStack = new Stack<String>();
    public static Integer labelNum = 0;
    
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
	String[] idarray = idlist.split(",");
	int i = 0;
	String optype = "";
	for(i=0;i<idarray.length;i++){
	    //symboltable.printTable();
	    //System.out.println("idlist: "+idlist+" \n"+idarray[i]);
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


    public static void addConditional(String operator){
	String opcode = "";
	String op1 = opStack.pop();
	String op2 = opStack.pop();
	String label = topLabel();
	if(operator.matches("<")){
	    opcode = "GE";
	}else if(operator.matches(">")){
	    opcode = "LE";
	}else if(operator.matches("=")){
	    opcode = "NE";
	}else if(operator.matches("!=")){
	    opcode = "EQ";
	}else if(operator.matches("<=")){
	    opcode = "GT";
	}else if(operator.matches(">=")){
	    opcode = "LT";
	}else if(operator.matches(">")){
	    opcode = "LE";
	}

	IRnode node1 = new IRnode(opcode,op2,op1,label);
	IRnodelist.Addnode(node1);
    }

    public static void handleTrue(){
	String temp1 = RegManager.addRegister("I");
	String temp2 = RegManager.addRegister("I");
	IRnodelist.Addnode(new IRnode("STOREI","1","",temp1));
	IRnodelist.Addnode(new IRnode("STOREI","1","",temp2));	
	IRnode node1 = new IRnode("NE",temp1,temp2,topLabel());
	IRnodelist.Addnode(node1);
    }

    public static void handleFalse(){
	String temp1 = RegManager.addRegister("I");
	String temp2 = RegManager.addRegister("I");
	IRnodelist.Addnode(new IRnode("STOREI","1","",temp1));
	IRnodelist.Addnode(new IRnode("STOREI","0","",temp2));	
	IRnode node1 = new IRnode("NE",temp1,temp2,topLabel());
	IRnodelist.Addnode(node1);
    }

    public static void addJump(String label){
	IRnodelist.Addnode(new IRnode("JUMP","","",label));
    }

    public static void pushLabel(){
	labelNum++;
	labelStack.push("label"+Integer.toString(labelNum));
    }
    
    public static String popLabel(){
	return labelStack.pop();
	
    }

    public static String topLabel(){
	return labelStack.peek();

    }

    public static String SecondLabel(){
	String s1 = labelStack.pop();
	String s2 = labelStack.peek();
	labelStack.push(s1);
	return s2;

    }


    public static void addLabel(String label){
	IRnodelist.Addnode(new IRnode("LABEL","","",label));
    }
    


    

}
