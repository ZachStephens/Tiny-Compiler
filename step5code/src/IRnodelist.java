import java.io.*;
import java.util.*;


public class IRnodelist{
    public static ArrayList<IRnode> nodeList = new ArrayList<IRnode>();

    public static void Addnode(IRnode newNode){
	nodeList.add(newNode);
    }

    public static void printList(){
	int i = 0;
	System.out.println(";IR code");
	for( i=0;i< nodeList.size();i++){
	    nodeList.get(i).printNode();
	}
    }
}
