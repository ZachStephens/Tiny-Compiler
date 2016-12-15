import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class symboltable{
    private static ArrayList<symbolScope> scopeAlist;
    private static int block_count = 0;
    private static boolean isError = false;
    public static boolean is_AddBlock = false;
    public symboltable(){
	scopeAlist = new ArrayList <symbolScope>();
	block_count = 0;
    }

    public static void addsymbolScope(String newscope){
	if(isError){ return;}
	//System.out.println(">>"+newscope);
	if(newscope.equals("GLOBAL")){
	    scopeAlist = new ArrayList<symbolScope>();
	}

	if(newscope.equals("BLOCK")){
	    block_count++;
	    scopeAlist.add(new symbolScope("BLOCK "+Integer.toString(block_count)));
	}
	else{
	    scopeAlist.add(new symbolScope(newscope));
	}
    }
    
    public static void popsymbolScope(){
	if(isError){ return;}
	return;/*delete if needed------------------------------
	symbolScope topscope;
	if(!scopeAlist.isEmpty()){
	    topscope = scopeAlist.remove(scopeAlist.size()-1);
	    topscope.printSymbols();
	    }*/
    }

    public static void addsymbol(String id,String type,String value){
	if(isError | is_AddBlock){ return;}

	symbolScope topscope = scopeAlist.remove(scopeAlist.size()-1);
	String s2 = type;
	
	if(topscope.scopeMap.get(id) != null){
	    System.out.println("DECLARATION ERROR "+id);
	    isError = true;
	    return;
		}

	if(value.equals("")){
	    if(type.equals("SAME")){
		s2 = symbol.sameType;
	    }else{
		symbol.sameType = s2;
	    }
	    topscope.addSymbol(id,new symbol(id,s2));
	}else {
	    
	    topscope.addSymbol(id,new symbol(id,type,value));
	   
	}
	//System.out.println(id+" "+type+" "+topscope.getscopeName());
	scopeAlist.add(topscope);
    }

    public static void printTable(){
	if(isError){ return;}
	int i=0;
	for(i=0;i<scopeAlist.size();i++){
	    if(!scopeAlist.get(i).getscopeName().equals("GLOBAL")){
		System.out.println();
	    }
	    System.out.println("Symbol table "+scopeAlist.get(i).getscopeName());
	    scopeAlist.get(i).printSymbols();
	    //System.out.println();
	}
    }

}