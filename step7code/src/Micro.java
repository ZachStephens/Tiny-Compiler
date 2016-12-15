import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import java.io.IOException;
import java.lang.Exception;


public class Micro {
    public static void main(String[] args) throws IOException{
	try{
	    ANTLRFileStream ANTLR_input = new ANTLRFileStream(args[0]);	
	    MicroLexer lexer = new MicroLexer(ANTLR_input);
	    /*
	    Token token = lexer.nextToken();
	    
	    while(token.getType() != Token.EOF){
 
	    System.out.println("\nToken Type: "+lexer.getVocabulary().getSymbolicName(lexer.getType()));
	    System.out.print("Value: "+token.getText());		    
	    token = lexer.nextToken();
	    }	   
	    */	    
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	   
	    try{
		MicroParser parser = new MicroParser(tokens);
		parser.setErrorHandler(new CustomErrorStrategy());
		parser.program();
	    }catch(RecognitionException e){
	      	System.out.println("Not Accepted");
		return;
	    }
		// System.out.println("Accepted");
	    
	    
	}catch(IOException e){
	    System.out.println("Invalid argument");
	}
    
    }
}



