import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Micro {
    public static void main(String[] args) throws IOException{
	try{
	    ANTLRFileStream ANTLR_input = new ANTLRFileStream(args[0]);	
	    MicroLexer lexer = new MicroLexer(ANTLR_input);
	    int[] op_nums = {1,3,4,6,8,10,11,19,20,23,24,26,28,30,32};
	    int[] key_nums = {2,5,7,9,12,13,14,15,16,17,18,21,22,25,27,29,31,33};

	    int op_index = 0;
	    //handle last new line character by inserting new line before each loop 
	    //omit new line before first iteration
	    Token token = lexer.nextToken();
	    if(token.getType() != Token.EOF){
		//lexer build doesn't identify individual operator token type as OPERATOR; replace token type with token type for OPERATOR
		for(op_index = 0; op_index<15;op_index++){
		    if(lexer.getType() == op_nums[op_index]){lexer.setType(35);}
		}
		//replace individual keyword token types to the token type for KEYWORD
		for(op_index = 0; op_index<18;op_index++){
		    if(lexer.getType() == key_nums[op_index]){lexer.setType(34);}
		}

		System.out.println("Token Type: "+lexer.getTokenNames()[lexer.getType()]);
		System.out.print("Value: "+token.getText());
		token = lexer.nextToken();
	    }
	    //iterate through 2nd to N tokens with new lines before each line
	    while(token.getType() != Token.EOF){

		for(op_index = 0; op_index<15;op_index++){
		    if(lexer.getType() == op_nums[op_index]){lexer.setType(35);}
		}
		for(op_index = 0; op_index<18;op_index++){
		    if(lexer.getType() == key_nums[op_index]){lexer.setType(34);}
		}

		System.out.println("\nToken Type: "+lexer.getTokenNames()[lexer.getType()]);
		System.out.print("Value: "+token.getText());		    
		token = lexer.nextToken();
	    }	    
	    
	}catch(IOException e){
	    System.out.println("Invalid argument");
	}
    
    }
}
