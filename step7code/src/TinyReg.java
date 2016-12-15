import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class TinyReg{

    public String contents;
    public boolean dirty;
    // public String name;
    public boolean occupied;


    public TinyReg(){
	//name = "r"+Integer.toString(name);
	contents = "";
	dirty = false;
	occupied = false;
    }
    
    public boolean isDirty(){return dirty;}
    public boolean isOccupied(){return occupied;}

}