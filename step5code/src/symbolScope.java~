import java.io.*;
import java.util.*;



public  class symbolScope{
    private String scopeName;
    public LinkedHashMap<String,symbol> scopeMap;

    public symbolScope(String name){
	this.scopeName = name;
	this.scopeMap = new LinkedHashMap<String,symbol>();
    }
    
    public String getscopeName(){return this.scopeName;}
   

    public void tinyPrint(){
	Iterator<String> iter = scopeMap.keySet().iterator();
	while(iter.hasNext()){
	    String s1 = iter.next();
	    symbol sym =  scopeMap.get(s1) ;
	    if(sym.gettype().equals("STRING"))
		System.out.println("str "+sym.getid());
	    else
		System.out.println("var "+sym.getid());	    
	}
	    
	
    }

    public void addSymbol(String symName,symbol S1){
	//System.out.println(symName);
	//if(scopeMap.get(symName) != null){
	    //System.out.println("DECLARATION ERROR"+symName);
	    
	//}
	//else{    
	this.scopeMap.put(symName,S1);
	//}
    }
    
    public void printSymbols(){
	//	System.out.println("\nSymbol table "+scopeName);
	Iterator<String> iter = scopeMap.keySet().iterator();
	while(iter.hasNext()){
	    String currentSymbol = iter.next();
	    
	    //scopeMap.get(currentSymbol).symbolPrint();
	}
    }
       
}