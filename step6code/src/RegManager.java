import java.io.*;
import java.util.*;


public class RegManager{
    private static  ArrayList<String> reglist= new ArrayList<String>();

    public static String addRegister(String type){
	//	System.out.println(NodeManager.topFunction().name);
	return NodeManager.topFunction().addReg(type);
    }




    public static String getType(String regname){
	//	System.out.println(NodeManager.topFunction().name);
	return NodeManager.topFunction().getregtype(regname);
    }

    public static void clearRegList(){
	reglist.clear();
    }

}