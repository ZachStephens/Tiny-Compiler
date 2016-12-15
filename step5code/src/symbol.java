import java.io.*;
import java.util.*;


public class symbol{
    private String id;
    private String value;
    private String type;
    public static String sameType;

    public symbol(String id,String type){
	this.id = id;
	this.type = type;
	this.value = "";
    }
    public symbol(String id, String type, String value){
	this.id = id;
	this.value = value;
	this.type = type;
    }
    
    public String getid(){return this.id;}
    public String getvalue(){return this.value;}
    public String gettype(){return this.type;}
    public void setvalue(String newvalue){this.value = newvalue;}

    public void symbolPrint(){
	System.out.print("name "+id+" type "+type);
	if(!value.equals(""))
	    System.out.print(" value "+value);
	System.out.println();
    }

}