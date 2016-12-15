import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class FlowNode extends IRnode{

    private int orderNum;
    public ArrayList<FlowNode> nextList = new ArrayList<FlowNode>();
    public ArrayList<FlowNode> fromList = new ArrayList<FlowNode>();

    public ArrayList<String> liveList = new ArrayList<String>();

    public ArrayList<String> useList = new ArrayList<String>();

    public ArrayList<String> defineList = new ArrayList<String>();

    public FlowNode(IRnode node){
	super(node);
    }
    
    public void setorderNum(int i){orderNum = i;}
    public int getorderNum(){return orderNum;}
    
    public int nextSize(){return nextList.size();}
    public int fromSize(){return fromList.size();}

    public void addNext(FlowNode F){nextList.add(F);}
    public void addFrom(FlowNode F){fromList.add(F);}


    public boolean isLeader(){
	return ((nextList.size()>1) || (fromList.size()>1));
    }


    public boolean doesUse(String name){
	int i;
	for(i=0;i<defineList.size();i++){
	    if(defineList.get(i).equals(name))
		return true;
	}
	for(i=0;i<useList.size();i++){
	    if(useList.get(i).equals(name))
		return true;
	}
	return false;
    }

    public void computeLiveness(){
	int i = 0;
	int j=0;
	FlowNode F1;
	//
	for(i = 0;i<nextList.size();i++){
	    F1 = nextList.get(i);
	    for(j=0;j<F1.liveList.size();j++){
		if(!liveContains(F1.liveList.get(j))){
		    liveList.add(F1.liveList.get(j));
		}
	    }
	}
	//remove defines
	for(i=0;i<defineList.size();i++){
	    for(j=0;j<liveList.size();j++){
		if(liveList.get(j).equals(defineList.get(i))){
		    liveList.remove(j);
		}
	    }
	}
	
	// add what is used
	for(i=0;i<useList.size();i++){
	    if(!liveContains(useList.get(i))){
		liveList.add(useList.get(i));
	    }  
	}

	
    }

    public boolean liveContains(String key){
	for(int i=0;i<liveList.size();i++)
	    {
		if(liveList.get(i).equals(key))
		    return true;
	    }
	return false;
    }

    public void liveInit(){
	if(opcode.equals("JUMP") | opcode.equals("LABEL")| opcode.equals("RET") 
	   | opcode.equals("LINK")){
	    
	}else{
	    if(opcode.startsWith("READ")){
		defineList.add(result);
	    }else if(opcode.equals("PUSH")){
		useList.add(op1);  
	    }else if(opcode.startsWith("STORE")){ 
		if(op1.startsWith("$")){
		    useList.add(op1);
		}
		if(!result.equals("$R")){
		    defineList.add(result);
		}
	    }else if(opcode.equals("POP")){	
		defineList.add(op1);
	    }else if(opcode.startsWith("WRITE")){	
		useList.add(result);
	    }else if(opcode.equals("JSR")){
		//globals
	    }else if(opcode.equals("GT")||opcode.equals("GE")||opcode.equals("EQ")||
		     opcode.equals("LT")||opcode.equals("LE")||opcode.equals("NE")){
		useList.add(op1);
		useList.add(op2);
	    }else{
		useList.add(op1);
		useList.add(op2);
		defineList.add(result);
	    }
	    
	}
	    int i = 0;
	    /*
	      System.out.print("Used: ");
	      for(i=0;i<useList.size();i++){
	      System.out.print(useList.get(i));
	      }
	      System.out.print(" Defined: ");
	      for(i=0;i<defineList.size();i++){
	      System.out.print(defineList.get(i));
	      }
	      System.out.println();
	    */
	    return;
    }

    
    public void printFlow(){
	int i;
	//System.out.print(orderNum+":");
	printNode();
	System.out.print("    liveList: ");
	for(i=0;i<liveList.size();i++){
	    System.out.print(liveList.get(i)+" ");
	}
	System.out.println();
	
    }

	
}