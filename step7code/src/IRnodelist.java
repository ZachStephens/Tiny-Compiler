import java.io.*;
import java.util.*;


public class IRnodelist{
    public static ArrayList<IRnode> masterList = new ArrayList<IRnode>();
    public static ArrayList<FlowNode> ControlGraph = new ArrayList<FlowNode>();



    public static void Addnode(IRnode newNode){
	int i = NodeManager.FunctionStack.size();;
	NodeManager.FunctionStack.get(i-1).nodeList.add(newNode);
    }

    public static void printList(){
	int i = 0;
	int j = 0;
	Function F1;
	ArrayList<FlowNode> graph1;
	System.out.println(";IR code");
	for( i=0;i< NodeManager.FunctionStack.size();i++){
	    F1 = NodeManager.FunctionStack.get(i);
	    
	    graph1 = buildGraph(F1.nodeList);
	    
	    for(j=(graph1.size()-1);j>=0;j--){
		//graph1.get(i).printNode();
	    	graph1.get(j).computeLiveness();
	    }
	    for(j=0;j<(graph1.size()-1);j++){
		//graph1.get(i).printNode();
	    	graph1.get(j).liveList = graph1.get(j+1).liveList;
	    }
	    
	    F1.FlowList = graph1;

	    for(j = 0;j<graph1.size();j++){
		//System.out.println(j+" < "+graph1.size());
		//graph1.get(j).printFlow();
	    }
	    
	    //System.out.println(" "+NodeManager.FunctionStack.size());
	}
    }


    public static ArrayList<FlowNode> buildGraph(ArrayList<IRnode> Alist){
	ArrayList<FlowNode> graph1 = new ArrayList<FlowNode>();
	FlowNode FN;
	int i = 0;

	for(i=0;i<Alist.size();i++){
	    FN = new FlowNode(Alist.get(i));
	    FN.setorderNum(i);
	    graph1.add(FN);
	    // finish this method  needs to add to and from
	}

	//add straight line nexts and prevs
	for(i=0;i<(Alist.size()-1);i++){
	    FN = graph1.get(i);
	    if(!FN.opcode.equals("JUMP")){
		FN.addNext(graph1.get(i+1));	
		graph1.get(i+1).addFrom(FN);
		
	
		if(FN.isConditional()){
		    FN.addNext(graph1.get(findLabel(graph1,FN.result)));
		    graph1.get(findLabel(graph1,FN.result)).addFrom(FN);
		}
	    }
	    else{
		FN.addNext(graph1.get(findLabel(graph1,FN.result)));
		graph1.get(findLabel(graph1,FN.result)).addFrom(FN);
	    }	  
	    FN.liveInit();
	}

	return graph1;
    }



    public static int findLabel(ArrayList<FlowNode> graph,String label){
	//return order num of flownode with Label label
	int i = 0;
	for(i=0;i<graph.size();i++){
		if(graph.get(i).opcode.equals("LABEL")){
		    if(graph.get(i).result.equals(label))
			return i;
		}
		
		//CHECK result
	}
	System.out.println("Did not find label for "+label);
	return -1;

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
