import java.io.*;
import java.util.*;


public class IRnodelist{
    public static ArrayList<IRnode> masterList = new ArrayList<IRnode>();

    public static void Addnode(IRnode newNode){
	int i = NodeManager.FunctionStack.size();;
	NodeManager.FunctionStack.get(i-1).nodeList.add(newNode);
    }

    public static void printList(){
	int i = 0;
	int j = 0;
	Function F1;
	System.out.println(";IR code");
	for( i=0;i< NodeManager.FunctionStack.size();i++){
	    F1 = NodeManager.FunctionStack.get(i);
	    for(j = 0;j<F1.nodeList.size();j++){
		F1.nodeList.get(j).printNode();
	    }
	    
	    System.out.println("");
	}
    }

    public static void buildMaster(){
	int i = 0;
	int j = 0;
	Function F1;
	//System.out.println(";IR code");
	for( i=0;i< NodeManager.FunctionStack.size();i++){
	    F1 = NodeManager.FunctionStack.get(i);
	    for(j = 0;j<F1.nodeList.size();j++){
		masterList.add(F1.nodeList.get(j));
		//F1.nodeList.get(j).printNode();
	    }
	    masterList.add(new IRnode("FEND","","",""));
	}
    }

}
