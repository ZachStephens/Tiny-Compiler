import java.io.*;
import java.util.*;



public class Function{
    public ArrayList<symbol> ParamList = new ArrayList<symbol>();
    public ArrayList<symbol> LocalList = new ArrayList<symbol>();
    public ArrayList<IRnode> nodeList = new ArrayList<IRnode>();
    public ArrayList<String> tempList = new ArrayList<String>();
    public LinkedHashMap<String,symbol> scopeMap;
    public  LinkedHashMap<String,String> regMap  = new LinkedHashMap<String,String>();

    public String sameType = "";
    public Integer local_num = 0;
    public Integer param_num = 0;
    public Integer tempcount = 0;
    public String name;
    public String returntype;

    public Function(String name, String type){
	this.name = name;
      	this.scopeMap = new LinkedHashMap<String,symbol>();
	this.returntype = type.substring(0,1);
    }

    public String addReg(String type){
	tempList.add(type);
	//	System.out.println( "$T"+Integer.toString(tempList.size())+"is added to "+name);
	
	NodeManager.FStack(name).tempList.add(type);
	return "$T"+Integer.toString(tempList.size());
    }

    public String getregtype(String regname){
	//System.out.println(regname);
	return tempList.get(Integer.parseInt(regname.substring(2))-1);
    }


    public void addParam(String id,String type){
	param_num++;	
	ParamList.add(new symbol(id,type));
	regMap.put("$P"+Integer.toString(param_num),id);
	//NodeManager.FStack(name).regMap.put("$P"+(Integer.toString(param_num)),id);
	//NodeManager.FStack(name).param_num++;
	//	System.out.println(id+"-----------"+NodeManager.FStack(name).param_num);
    }

    public void addLocal(String id, String type){
	if(symboltable.is_AddBlock)
	    return;


	String type2 = type;
	
	if(type.equals("SAME"))
	    type2 = sameType;
	else
	    sameType = type;

	if(type2.equals("STRING")){
	    //System.out.println("adding local blocked: "+id);
	    return;
	}
	local_num++;	
	LocalList.add(new symbol(id,type2));
	//System.out.println(id+" "+type2+" adding to fstack");
	NodeManager.FStack(name).LocalList.add(new symbol(id,type2));
	NodeManager.FStack(name).local_num++;
	regMap.put("$L"+Integer.toString(local_num),id);
	NodeManager.FStack(name).regMap.put("$L"+Integer.toString(local_num),id);
    }

    public String getNamefromReg(String reg){
	//	System.out.println("fromreg: "+reg);
	return regMap.get(reg);   
    }

    public String getType(String regname){
	//	System.out.println(regname);
	if(regname.startsWith("$T"))
	    return getregtype(regname);

	symbol sym = getSymbol(regname);
	//System.out.println(sym.getid()+":"+sym.gettype());
	return sym.gettype().substring(0,1);	
    }


    String getReg(String id){
	if(symboltable.isGlobalString(id)){ 
		return id;
	    }

	Iterator<String> iter = regMap.keySet().iterator();
	while(iter.hasNext()){
	    String result = iter.next(); 
	    if(regMap.get(result).equals(id)){
		return result;
	    }
	}
	return id;
    }

    

    public symbol getSymbol(String name){
	int i;
	String name2 = name;
	//	System.out.println(name+"getS");
	if(name.startsWith("$"))
	    name2 = getNamefromReg(name);
	//	System.out.println(name2+":name2");
	for(i=0;i<param_num;i++){
	    if(ParamList.get(i).getid().equals(name2)){
		return ParamList.get(i);
	    }
	}
	//	System.out.println("after param");
	for(i=0;i<local_num;i++){
	    if(LocalList.get(i).getid().equals(name2)){
		//System.out.println("got "+name2+" from locallist with type: "+LocalList.get(i).gettype());
		return LocalList.get(i);
	    }
	}
	//System.out.println("after local");
	return scopeMap.get(name);
    }

    public int getlocalNum(){
	int i;
	for(i=0;i<local_num;i++){
	    //System.out.println(LocalList.get(i).getid());	 
	}
	return local_num;
    }

}
