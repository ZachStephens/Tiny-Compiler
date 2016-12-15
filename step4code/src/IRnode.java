import java.io.*;
import java.util.*;


public class IRnode{
    public String opcode;
    public String op1;
    public String op2;
    public String result;
    
    public IRnode(String opcode,String op1,String op2,String result)
    {
	this.opcode = opcode;
	this.op1 = op1;
	this.op2 = op2;
	this.result = result;
    }

    public void printNode()
    {
	System.out.println(";"+opcode+" "+op1+" "+op2+" "+result);
    }
 
}
