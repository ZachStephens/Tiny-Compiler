import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import java.io.*;

public class CustomErrorStrategy extends DefaultErrorStrategy{
    @Override
     public void reportError(Parser recognizer, RecognitionException e){
		if (inErrorRecoveryMode(recognizer)) {
//			System.err.print("[SPURIOUS] ");
			return; // don't report spurious errors
		}
		throw e;
		//beginErrorCondition(recognizer);/
/*
		if ( e instanceof NoViableAltException ) {
		    throw e;
		}
		else if ( e instanceof InputMismatchException ) {
		    //reportInputMismatch(recognizer, (InputMismatchException)e);
		}
		else if ( e instanceof FailedPredicateException ) {
		    reportFailedPredicate(recognizer, (FailedPredicateException)e);
		}
		else {
		    throw e;
		    //System.err.println("unknown recognition error type: "+e.getClass().getName());
		    //recognizer.notifyErrorListeners(e.getOffendingToken(), e.getMessage(), e);
		}	*/
    }

}
