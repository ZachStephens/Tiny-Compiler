import java.io.*;
import java.util.*;


public class TinyNode{
    private String opcode;
    private String op1;
    private String reg;
    
    public TinyNode(String opcode,String op1,String reg)
    {
	this.opcode = opcode;
	this.op1 = op1;
	this.reg = reg;
    }

    public void printNode()
    {
	System.out.println(opcode+" "+op1+" "+reg);
    }
 
}
