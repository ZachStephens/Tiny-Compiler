// Generated from Micro.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM_KEYWORD=1, BEGIN_KEYWORD=2, END_KEYWORD=3, FUNCTION_KEYWORD=4, 
		READ_KEYWORD=5, WRITE_KEYWORD=6, IF_KEYWORD=7, ELSIF_KEYWORD=8, ENDIF_KEYWORD=9, 
		DO_KEYWORD=10, WHILE_KEYWORD=11, CONTINUE_KEYWORD=12, BREAK_KEYWORD=13, 
		RETURN_KEYWORD=14, INT_KEYWORD=15, VOID_KEYWORD=16, STRING_KEYWORD=17, 
		FLOAT_KEYWORD=18, TRUE_KEYWORD=19, FALSE_KEYWORD=20, ASSIGN_OP=21, ADD_OP=22, 
		SUB_OP=23, DIV_OP=24, EQ_OP=25, MUL_OP=26, NEQ_OP=27, LT_OP=28, GT_OP=29, 
		PAREN_OP=30, CPAREN_OP=31, SEMI_OP=32, COM_OP=33, LTE_OP=34, GTE_OP=35, 
		WHITESPACE=36, IDENTIFIER=37, INTLITERAL=38, FLOATLITERAL=39, STRINGLITERAL=40, 
		COMMENT=41;
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl = 4, 
		RULE_str = 5, RULE_var_decl = 6, RULE_any_type = 7, RULE_var_type = 8, 
		RULE_id_list = 9, RULE_id_tail = 10, RULE_param_decl_list = 11, RULE_param_decl = 12, 
		RULE_param_decl_tail = 13, RULE_func_declarations = 14, RULE_func_decl = 15, 
		RULE_func_body = 16, RULE_stmt_list = 17, RULE_stmt = 18, RULE_base_stmt = 19, 
		RULE_assign_stmt = 20, RULE_assign_expr = 21, RULE_read_stmt = 22, RULE_write_stmt = 23, 
		RULE_return_stmt = 24, RULE_expr = 25, RULE_expr_suffix = 26, RULE_factor = 27, 
		RULE_factor_suffix = 28, RULE_postfix_expr = 29, RULE_call_expr = 30, 
		RULE_expr_list = 31, RULE_expr_list_tail = 32, RULE_primary = 33, RULE_addop = 34, 
		RULE_mulop = 35, RULE_if_stmt = 36, RULE_else_part = 37, RULE_cond = 38, 
		RULE_compop = 39, RULE_do_while_stmt = 40;
	public static final String[] ruleNames = {
		"program", "id", "pgm_body", "decl", "string_decl", "str", "var_decl", 
		"any_type", "var_type", "id_list", "id_tail", "param_decl_list", "param_decl", 
		"param_decl_tail", "func_declarations", "func_decl", "func_body", "stmt_list", 
		"stmt", "base_stmt", "assign_stmt", "assign_expr", "read_stmt", "write_stmt", 
		"return_stmt", "expr", "expr_suffix", "factor", "factor_suffix", "postfix_expr", 
		"call_expr", "expr_list", "expr_list_tail", "primary", "addop", "mulop", 
		"if_stmt", "else_part", "cond", "compop", "do_while_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", "'READ'", "'WRITE'", 
		"'IF'", "'ELSIF'", "'ENDIF'", "'DO'", "'WHILE'", "'CONTINUE'", "'BREAK'", 
		"'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'", "'TRUE'", "'FALSE'", 
		"':='", "'+'", "'-'", "'/'", "'='", "'*'", "'!='", "'<'", "'>'", "'('", 
		"')'", "';'", "','", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM_KEYWORD", "BEGIN_KEYWORD", "END_KEYWORD", "FUNCTION_KEYWORD", 
		"READ_KEYWORD", "WRITE_KEYWORD", "IF_KEYWORD", "ELSIF_KEYWORD", "ENDIF_KEYWORD", 
		"DO_KEYWORD", "WHILE_KEYWORD", "CONTINUE_KEYWORD", "BREAK_KEYWORD", "RETURN_KEYWORD", 
		"INT_KEYWORD", "VOID_KEYWORD", "STRING_KEYWORD", "FLOAT_KEYWORD", "TRUE_KEYWORD", 
		"FALSE_KEYWORD", "ASSIGN_OP", "ADD_OP", "SUB_OP", "DIV_OP", "EQ_OP", "MUL_OP", 
		"NEQ_OP", "LT_OP", "GT_OP", "PAREN_OP", "CPAREN_OP", "SEMI_OP", "COM_OP", 
		"LTE_OP", "GTE_OP", "WHITESPACE", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM_KEYWORD() { return getToken(MicroParser.PROGRAM_KEYWORD, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BEGIN_KEYWORD() { return getToken(MicroParser.BEGIN_KEYWORD, 0); }
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public TerminalNode END_KEYWORD() { return getToken(MicroParser.END_KEYWORD, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(PROGRAM_KEYWORD);
			setState(83);
			id();
			setState(84);
			match(BEGIN_KEYWORD);
			setState(85);
			pgm_body();
			setState(86);
			match(END_KEYWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MicroParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPgm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPgm_body(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			symboltable.addsymbolScope("GLOBAL");
			setState(91);
			decl();
			setState(92);
			func_declarations();
			TinyGenerator.generateTiny();
			symboltable.popsymbolScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case STRING_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				string_decl();
				setState(97);
				decl();
				}
				break;
			case INT_KEYWORD:
			case FLOAT_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				var_decl();
				setState(100);
				decl();
				}
				break;
			case END_KEYWORD:
			case FUNCTION_KEYWORD:
			case READ_KEYWORD:
			case WRITE_KEYWORD:
			case IF_KEYWORD:
			case ELSIF_KEYWORD:
			case ENDIF_KEYWORD:
			case DO_KEYWORD:
			case WHILE_KEYWORD:
			case RETURN_KEYWORD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_declContext extends ParserRuleContext {
		public IdContext id;
		public StrContext str;
		public TerminalNode STRING_KEYWORD() { return getToken(MicroParser.STRING_KEYWORD, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitString_decl(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(STRING_KEYWORD);
			setState(106);
			((String_declContext)_localctx).id = id();
			setState(107);
			match(ASSIGN_OP);
			setState(108);
			((String_declContext)_localctx).str = str();
			symboltable.addsymbol((((String_declContext)_localctx).id!=null?_input.getText(((String_declContext)_localctx).id.start,((String_declContext)_localctx).id.stop):null),"STRING",(((String_declContext)_localctx).str!=null?_input.getText(((String_declContext)_localctx).str.start,((String_declContext)_localctx).str.stop):null));
			setState(110);
			match(SEMI_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(MicroParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((Var_declContext)_localctx).var_type = var_type();
			symbol.sameType = (((Var_declContext)_localctx).var_type!=null?_input.getText(((Var_declContext)_localctx).var_type.start,((Var_declContext)_localctx).var_type.stop):null);

					if(NodeManager.FList.size()>0){
					NodeManager.topFunction().sameType = (((Var_declContext)_localctx).var_type!=null?_input.getText(((Var_declContext)_localctx).var_type.start,((Var_declContext)_localctx).var_type.stop):null);}
				
				
			setState(117);
			id_list();
			setState(118);
			match(SEMI_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode VOID_KEYWORD() { return getToken(MicroParser.VOID_KEYWORD, 0); }
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_any_type);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case INT_KEYWORD:
			case FLOAT_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				var_type();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(VOID_KEYWORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT_KEYWORD() { return getToken(MicroParser.FLOAT_KEYWORD, 0); }
		public TerminalNode INT_KEYWORD() { return getToken(MicroParser.INT_KEYWORD, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==INT_KEYWORD || _la==FLOAT_KEYWORD) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((Id_listContext)_localctx).id = id();
			symboltable.addsymbol((((Id_listContext)_localctx).id!=null?_input.getText(((Id_listContext)_localctx).id.start,((Id_listContext)_localctx).id.stop):null),"SAME","");
			if(NodeManager.FList.size()>0){NodeManager.addLocal((((Id_listContext)_localctx).id!=null?_input.getText(((Id_listContext)_localctx).id.start,((Id_listContext)_localctx).id.stop):null),"SAME");}
			setState(129);
			id_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_tailContext extends ParserRuleContext {
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterId_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitId_tail(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_tail);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case COM_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(COM_OP);
				setState(132);
				((Id_tailContext)_localctx).id = id();
				symboltable.addsymbol((((Id_tailContext)_localctx).id!=null?_input.getText(((Id_tailContext)_localctx).id.start,((Id_tailContext)_localctx).id.stop):null),"SAME","");
				if(NodeManager.FList.size()>0){NodeManager.addLocal((((Id_tailContext)_localctx).id!=null?_input.getText(((Id_tailContext)_localctx).id.start,((Id_tailContext)_localctx).id.stop):null),"SAME");}
				setState(135);
				id_tail();
				}
				break;
			case CPAREN_OP:
			case SEMI_OP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl_list(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param_decl_list);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case INT_KEYWORD:
			case FLOAT_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				param_decl();
				setState(141);
				param_decl_tail();
				}
				break;
			case CPAREN_OP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public IdContext id;
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((Param_declContext)_localctx).var_type = var_type();
			setState(147);
			((Param_declContext)_localctx).id = id();
			NodeManager.addParam((((Param_declContext)_localctx).id!=null?_input.getText(((Param_declContext)_localctx).id.start,((Param_declContext)_localctx).id.stop):null), (((Param_declContext)_localctx).var_type!=null?_input.getText(((Param_declContext)_localctx).var_type.start,((Param_declContext)_localctx).var_type.stop):null));
			symboltable.addsymbol((((Param_declContext)_localctx).id!=null?_input.getText(((Param_declContext)_localctx).id.start,((Param_declContext)_localctx).id.stop):null),(((Param_declContext)_localctx).var_type!=null?_input.getText(((Param_declContext)_localctx).var_type.start,((Param_declContext)_localctx).var_type.stop):null),"");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterParam_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitParam_decl_tail(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_tail);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case COM_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(COM_OP);
				setState(152);
				param_decl();
				setState(153);
				param_decl_tail();
				}
				break;
			case CPAREN_OP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_declarations(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_declarations);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case FUNCTION_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				func_decl();
				setState(159);
				func_declarations();
				}
				break;
			case END_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declContext extends ParserRuleContext {
		public Any_typeContext any_type;
		public IdContext id;
		public TerminalNode FUNCTION_KEYWORD() { return getToken(MicroParser.FUNCTION_KEYWORD, 0); }
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public TerminalNode BEGIN_KEYWORD() { return getToken(MicroParser.BEGIN_KEYWORD, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode END_KEYWORD() { return getToken(MicroParser.END_KEYWORD, 0); }
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FUNCTION_KEYWORD);
			setState(165);
			((Func_declContext)_localctx).any_type = any_type();
			setState(166);
			((Func_declContext)_localctx).id = id();
			NodeManager.declareFunction((((Func_declContext)_localctx).id!=null?_input.getText(((Func_declContext)_localctx).id.start,((Func_declContext)_localctx).id.stop):null),(((Func_declContext)_localctx).any_type!=null?_input.getText(((Func_declContext)_localctx).any_type.start,((Func_declContext)_localctx).any_type.stop):null));
			symboltable.addsymbolScope((((Func_declContext)_localctx).id!=null?_input.getText(((Func_declContext)_localctx).id.start,((Func_declContext)_localctx).id.stop):null));
			setState(169);
			match(PAREN_OP);
			setState(170);
			param_decl_list();
			setState(171);
			match(CPAREN_OP);
			NodeManager.addLabel((((Func_declContext)_localctx).id!=null?_input.getText(((Func_declContext)_localctx).id.start,((Func_declContext)_localctx).id.stop):null));NodeManager.addLink();
			setState(173);
			match(BEGIN_KEYWORD);
			setState(174);
			func_body();
			symboltable.popsymbolScope();
			RegManager.clearRegList();
			setState(177);
			match(END_KEYWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			decl();
			setState(180);
			stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_list);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case READ_KEYWORD:
			case WRITE_KEYWORD:
			case IF_KEYWORD:
			case DO_KEYWORD:
			case RETURN_KEYWORD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				stmt();
				setState(183);
				stmt_list();
				}
				break;
			case END_KEYWORD:
			case ELSIF_KEYWORD:
			case ENDIF_KEYWORD:
			case WHILE_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case READ_KEYWORD:
			case WRITE_KEYWORD:
			case RETURN_KEYWORD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				base_stmt();
				}
				break;
			case IF_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				if_stmt();
				}
				break;
			case DO_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				do_while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterBase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitBase_stmt(this);
		}
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_base_stmt);
		try {
			setState(197);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				assign_stmt();
				}
				break;
			case READ_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				read_stmt();
				}
				break;
			case WRITE_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				write_stmt();
				}
				break;
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			assign_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI_OP() { return getToken(MicroParser.SEMI_OP, 0); }
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((Assign_exprContext)_localctx).id = id();
			setState(202);
			match(ASSIGN_OP);
			setState(203);
			expr();
			NodeManager.pushID((((Assign_exprContext)_localctx).id!=null?_input.getText(((Assign_exprContext)_localctx).id.start,((Assign_exprContext)_localctx).id.stop):null));
				NodeManager.newAssignment();
			setState(205);
			match(SEMI_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			symboltable.is_AddBlock = true;
			setState(208);
			match(READ_KEYWORD);
			setState(209);
			match(PAREN_OP);
			setState(210);
			((Read_stmtContext)_localctx).id_list = id_list();
			setState(211);
			match(CPAREN_OP);
			symboltable.is_AddBlock = false;
			setState(213);
			match(SEMI_OP);
			NodeManager.addREAD((((Read_stmtContext)_localctx).id_list!=null?_input.getText(((Read_stmtContext)_localctx).id_list.start,((Read_stmtContext)_localctx).id_list.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list;
		public TerminalNode WRITE_KEYWORD() { return getToken(MicroParser.WRITE_KEYWORD, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitWrite_stmt(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			symboltable.is_AddBlock = true;
			setState(217);
			match(WRITE_KEYWORD);
			setState(218);
			match(PAREN_OP);
			setState(219);
			((Write_stmtContext)_localctx).id_list = id_list();
			setState(220);
			match(CPAREN_OP);
			symboltable.is_AddBlock = false;
			setState(222);
			match(SEMI_OP);
			NodeManager.addWRITE((((Write_stmtContext)_localctx).id_list!=null?_input.getText(((Write_stmtContext)_localctx).id_list.start,((Write_stmtContext)_localctx).id_list.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(MicroParser.RETURN_KEYWORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(RETURN_KEYWORD);
			setState(226);
			expr();
			NodeManager.addReturn();
			setState(228);
			match(SEMI_OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Expr_suffixContext expr_suffix() {
			return getRuleContext(Expr_suffixContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			factor();
			setState(231);
			expr_suffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_suffixContext extends ParserRuleContext {
		public AddopContext addop;
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public Expr_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_suffix(this);
		}
	}

	public final Expr_suffixContext expr_suffix() throws RecognitionException {
		Expr_suffixContext _localctx = new Expr_suffixContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_suffix);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD_OP || _la==SUB_OP) {
					{
					{
					setState(233);
					((Expr_suffixContext)_localctx).addop = addop();
					setState(234);
					factor();
					NodeManager.addExpressions((((Expr_suffixContext)_localctx).addop!=null?_input.getText(((Expr_suffixContext)_localctx).addop.start,((Expr_suffixContext)_localctx).addop.stop):null));
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Factor_suffixContext factor_suffix() {
			return getRuleContext(Factor_suffixContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case PAREN_OP:
			case IDENTIFIER:
			case INTLITERAL:
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				postfix_expr();
				setState(246);
				factor_suffix();
				}
				break;
			case ADD_OP:
			case SUB_OP:
			case EQ_OP:
			case NEQ_OP:
			case LT_OP:
			case GT_OP:
			case CPAREN_OP:
			case SEMI_OP:
			case COM_OP:
			case LTE_OP:
			case GTE_OP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor_suffixContext extends ParserRuleContext {
		public MulopContext mulop;
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public List<Postfix_exprContext> postfix_expr() {
			return getRuleContexts(Postfix_exprContext.class);
		}
		public Postfix_exprContext postfix_expr(int i) {
			return getRuleContext(Postfix_exprContext.class,i);
		}
		public Factor_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterFactor_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitFactor_suffix(this);
		}
	}

	public final Factor_suffixContext factor_suffix() throws RecognitionException {
		Factor_suffixContext _localctx = new Factor_suffixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor_suffix);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV_OP || _la==MUL_OP) {
					{
					{
					setState(251);
					((Factor_suffixContext)_localctx).mulop = mulop();
					setState(252);
					postfix_expr();
					NodeManager.addExpressions((((Factor_suffixContext)_localctx).mulop!=null?_input.getText(((Factor_suffixContext)_localctx).mulop.start,((Factor_suffixContext)_localctx).mulop.stop):null));
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_exprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPostfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPostfix_expr(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_postfix_expr);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				call_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_exprContext extends ParserRuleContext {
		public IdContext id;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((Call_exprContext)_localctx).id = id();
			IRnodelist.Addnode(new IRnode("PUSH","","",""));
			NodeManager.callName = (((Call_exprContext)_localctx).id!=null?_input.getText(((Call_exprContext)_localctx).id.start,((Call_exprContext)_localctx).id.stop):null);
			setState(270);
			match(PAREN_OP);
			setState(271);
			expr_list();
			setState(272);
			match(CPAREN_OP);
			NodeManager.addCall((((Call_exprContext)_localctx).id!=null?_input.getText(((Call_exprContext)_localctx).id.start,((Call_exprContext)_localctx).id.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_list);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				expr();
				NodeManager.addTopParam();
				setState(277);
				expr_list_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list_tailContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_list_tail);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case COM_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(COM_OP);
				setState(283);
				expr();
				NodeManager.addTopParam();
				setState(285);
				expr_list_tail();
				}
				break;
			case CPAREN_OP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public IdContext id;
		public Token INTLITERAL;
		public Token FLOATLITERAL;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(MicroParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(MicroParser.FLOATLITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case PAREN_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(PAREN_OP);
				setState(291);
				expr();
				setState(292);
				match(CPAREN_OP);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((PrimaryContext)_localctx).id = id();
				NodeManager.pushID((((PrimaryContext)_localctx).id!=null?_input.getText(((PrimaryContext)_localctx).id.start,((PrimaryContext)_localctx).id.stop):null));
				}
				break;
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				((PrimaryContext)_localctx).INTLITERAL = match(INTLITERAL);
				NodeManager.pushLiteral((((PrimaryContext)_localctx).INTLITERAL!=null?((PrimaryContext)_localctx).INTLITERAL.getText():null));
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				((PrimaryContext)_localctx).FLOATLITERAL = match(FLOATLITERAL);
				NodeManager.pushLiteral((((PrimaryContext)_localctx).FLOATLITERAL!=null?((PrimaryContext)_localctx).FLOATLITERAL.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==DIV_OP || _la==MUL_OP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(MicroParser.IF_KEYWORD, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public TerminalNode ENDIF_KEYWORD() { return getToken(MicroParser.ENDIF_KEYWORD, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			symboltable.addsymbolScope("BLOCK");
			NodeManager.pushLabel();//
				NodeManager.pushLabel();
			setState(309);
			match(IF_KEYWORD);
			setState(310);
			match(PAREN_OP);
			setState(311);
			cond();
			setState(312);
			match(CPAREN_OP);
			setState(313);
			decl();
			setState(314);
			stmt_list();
			symboltable.popsymbolScope();
			NodeManager.addJump(NodeManager.SecondLabel());
				 NodeManager.addLabel(NodeManager.popLabel());	
				
			setState(317);
			else_part();
			setState(318);
			match(ENDIF_KEYWORD);
			NodeManager.addLabel(NodeManager.popLabel());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSIF_KEYWORD() { return getToken(MicroParser.ELSIF_KEYWORD, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_else_part);
		try {
			setState(334);
			switch (_input.LA(1)) {
			case ELSIF_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				symboltable.addsymbolScope("BLOCK");
				setState(322);
				match(ELSIF_KEYWORD);
				NodeManager.pushLabel();
				setState(324);
				match(PAREN_OP);
				setState(325);
				cond();
				setState(326);
				match(CPAREN_OP);
				setState(327);
				decl();
				setState(328);
				stmt_list();
				symboltable.popsymbolScope();

					NodeManager.addJump(NodeManager.SecondLabel());
					NodeManager.addLabel(NodeManager.popLabel());	
					
				setState(331);
				else_part();
				}
				break;
			case ENDIF_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CompopContext compop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public TerminalNode TRUE_KEYWORD() { return getToken(MicroParser.TRUE_KEYWORD, 0); }
		public TerminalNode FALSE_KEYWORD() { return getToken(MicroParser.FALSE_KEYWORD, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cond);
		try {
			setState(345);
			switch (_input.LA(1)) {
			case ADD_OP:
			case SUB_OP:
			case EQ_OP:
			case NEQ_OP:
			case LT_OP:
			case GT_OP:
			case PAREN_OP:
			case LTE_OP:
			case GTE_OP:
			case IDENTIFIER:
			case INTLITERAL:
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				expr();
				setState(337);
				((CondContext)_localctx).compop = compop();
				setState(338);
				expr();
				NodeManager.addConditional((((CondContext)_localctx).compop!=null?_input.getText(((CondContext)_localctx).compop.start,((CondContext)_localctx).compop.stop):null));
				}
				break;
			case TRUE_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(TRUE_KEYWORD);
				NodeManager.handleTrue();
				}
				break;
			case FALSE_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(FALSE_KEYWORD);
				NodeManager.handleFalse();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_OP) | (1L << NEQ_OP) | (1L << LT_OP) | (1L << GT_OP) | (1L << LTE_OP) | (1L << GTE_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_stmtContext extends ParserRuleContext {
		public TerminalNode DO_KEYWORD() { return getToken(MicroParser.DO_KEYWORD, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode WHILE_KEYWORD() { return getToken(MicroParser.WHILE_KEYWORD, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroListener ) ((MicroListener)listener).exitDo_while_stmt(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			symboltable.addsymbolScope("BLOCK");
			setState(350);
			match(DO_KEYWORD);
			NodeManager.pushLabel();
				NodeManager.addLabel(NodeManager.topLabel());
			setState(352);
			decl();
			setState(353);
			stmt_list();
			setState(354);
			match(WHILE_KEYWORD);
			setState(355);
			match(PAREN_OP);
			NodeManager.pushLabel();
			setState(357);
			cond();
			setState(358);
			match(CPAREN_OP);
			NodeManager.addJump(NodeManager.SecondLabel());
				NodeManager.addLabel(NodeManager.topLabel());
			setState(360);
			match(SEMI_OP);
			symboltable.popsymbolScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\5\t}\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3\r\5\r\u0093\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00bd"+
		"\n\23\3\24\3\24\3\24\5\24\u00c2\n\24\3\25\3\25\3\25\3\25\5\25\u00c8\n"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00f0\n\34"+
		"\f\34\16\34\u00f3\13\34\3\34\5\34\u00f6\n\34\3\35\3\35\3\35\3\35\5\35"+
		"\u00fc\n\35\3\36\3\36\3\36\3\36\7\36\u0102\n\36\f\36\16\36\u0105\13\36"+
		"\3\36\5\36\u0108\n\36\3\37\3\37\5\37\u010c\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\5!\u011b\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0123\n\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0130\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u0151\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u015c\n(\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\6\4\2\21\21\24"+
		"\24\3\2\30\31\4\2\32\32\34\34\5\2\33\33\35\37$%\u015f\2T\3\2\2\2\4Z\3"+
		"\2\2\2\6\\\3\2\2\2\bi\3\2\2\2\nk\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20|\3"+
		"\2\2\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u008c\3\2\2\2\30\u0092\3\2\2\2"+
		"\32\u0094\3\2\2\2\34\u009e\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00b5"+
		"\3\2\2\2$\u00bc\3\2\2\2&\u00c1\3\2\2\2(\u00c7\3\2\2\2*\u00c9\3\2\2\2,"+
		"\u00cb\3\2\2\2.\u00d1\3\2\2\2\60\u00da\3\2\2\2\62\u00e3\3\2\2\2\64\u00e8"+
		"\3\2\2\2\66\u00f5\3\2\2\28\u00fb\3\2\2\2:\u0107\3\2\2\2<\u010b\3\2\2\2"+
		">\u010d\3\2\2\2@\u011a\3\2\2\2B\u0122\3\2\2\2D\u012f\3\2\2\2F\u0131\3"+
		"\2\2\2H\u0133\3\2\2\2J\u0135\3\2\2\2L\u0150\3\2\2\2N\u015b\3\2\2\2P\u015d"+
		"\3\2\2\2R\u015f\3\2\2\2TU\7\3\2\2UV\5\4\3\2VW\7\4\2\2WX\5\6\4\2XY\7\5"+
		"\2\2Y\3\3\2\2\2Z[\7\'\2\2[\5\3\2\2\2\\]\b\4\1\2]^\5\b\5\2^_\5\36\20\2"+
		"_`\b\4\1\2`a\b\4\1\2a\7\3\2\2\2bc\5\n\6\2cd\5\b\5\2dj\3\2\2\2ef\5\16\b"+
		"\2fg\5\b\5\2gj\3\2\2\2hj\3\2\2\2ib\3\2\2\2ie\3\2\2\2ih\3\2\2\2j\t\3\2"+
		"\2\2kl\7\23\2\2lm\5\4\3\2mn\7\27\2\2no\5\f\7\2op\b\6\1\2pq\7\"\2\2q\13"+
		"\3\2\2\2rs\7*\2\2s\r\3\2\2\2tu\5\22\n\2uv\b\b\1\2vw\b\b\1\2wx\5\24\13"+
		"\2xy\7\"\2\2y\17\3\2\2\2z}\5\22\n\2{}\7\22\2\2|z\3\2\2\2|{\3\2\2\2}\21"+
		"\3\2\2\2~\177\t\2\2\2\177\23\3\2\2\2\u0080\u0081\5\4\3\2\u0081\u0082\b"+
		"\13\1\2\u0082\u0083\b\13\1\2\u0083\u0084\5\26\f\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\7#\2\2\u0086\u0087\5\4\3\2\u0087\u0088\b\f\1\2\u0088\u0089\b\f"+
		"\1\2\u0089\u008a\5\26\f\2\u008a\u008d\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0085\3\2\2\2\u008c\u008b\3\2\2\2\u008d\27\3\2\2\2\u008e\u008f\5\32\16"+
		"\2\u008f\u0090\5\34\17\2\u0090\u0093\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0092\u0091\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095\5\22\n"+
		"\2\u0095\u0096\5\4\3\2\u0096\u0097\b\16\1\2\u0097\u0098\b\16\1\2\u0098"+
		"\33\3\2\2\2\u0099\u009a\7#\2\2\u009a\u009b\5\32\16\2\u009b\u009c\5\34"+
		"\17\2\u009c\u009f\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u0099\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\5\36\20"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\5\20\t\2\u00a8"+
		"\u00a9\5\4\3\2\u00a9\u00aa\b\21\1\2\u00aa\u00ab\b\21\1\2\u00ab\u00ac\7"+
		" \2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7!\2\2\u00ae\u00af\b\21\1\2\u00af"+
		"\u00b0\7\4\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\b\21\1\2\u00b2\u00b3\b"+
		"\21\1\2\u00b3\u00b4\7\5\2\2\u00b4!\3\2\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7"+
		"\5$\23\2\u00b7#\3\2\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\5$\23\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd%\3\2\2\2\u00be\u00c2\5(\25\2\u00bf\u00c2\5J&\2\u00c0\u00c2"+
		"\5R*\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\'\3\2\2\2\u00c3\u00c8\5*\26\2\u00c4\u00c8\5.\30\2\u00c5\u00c8\5\60\31"+
		"\2\u00c6\u00c8\5\62\32\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00ca\5,\27\2"+
		"\u00ca+\3\2\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce\5"+
		"\64\33\2\u00ce\u00cf\b\27\1\2\u00cf\u00d0\7\"\2\2\u00d0-\3\2\2\2\u00d1"+
		"\u00d2\b\30\1\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\7 \2\2\u00d4\u00d5\5\24"+
		"\13\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\b\30\1\2\u00d7\u00d8\7\"\2\2\u00d8"+
		"\u00d9\b\30\1\2\u00d9/\3\2\2\2\u00da\u00db\b\31\1\2\u00db\u00dc\7\b\2"+
		"\2\u00dc\u00dd\7 \2\2\u00dd\u00de\5\24\13\2\u00de\u00df\7!\2\2\u00df\u00e0"+
		"\b\31\1\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2\b\31\1\2\u00e2\61\3\2\2\2\u00e3"+
		"\u00e4\7\20\2\2\u00e4\u00e5\5\64\33\2\u00e5\u00e6\b\32\1\2\u00e6\u00e7"+
		"\7\"\2\2\u00e7\63\3\2\2\2\u00e8\u00e9\58\35\2\u00e9\u00ea\5\66\34\2\u00ea"+
		"\65\3\2\2\2\u00eb\u00ec\5F$\2\u00ec\u00ed\58\35\2\u00ed\u00ee\b\34\1\2"+
		"\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\67\3\2\2"+
		"\2\u00f7\u00f8\5<\37\2\u00f8\u00f9\5:\36\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc9\3\2\2\2\u00fd"+
		"\u00fe\5H%\2\u00fe\u00ff\5<\37\2\u00ff\u0100\b\36\1\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00fd\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0108\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0103\3\2\2\2\u0107\u0106\3\2\2\2\u0108;\3\2\2\2\u0109\u010c"+
		"\5D#\2\u010a\u010c\5> \2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"=\3\2\2\2\u010d\u010e\5\4\3\2\u010e\u010f\b \1\2\u010f\u0110\b \1\2\u0110"+
		"\u0111\7 \2\2\u0111\u0112\5@!\2\u0112\u0113\7!\2\2\u0113\u0114\b \1\2"+
		"\u0114?\3\2\2\2\u0115\u0116\5\64\33\2\u0116\u0117\b!\1\2\u0117\u0118\5"+
		"B\"\2\u0118\u011b\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0115\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011bA\3\2\2\2\u011c\u011d\7#\2\2\u011d\u011e\5\64\33\2"+
		"\u011e\u011f\b\"\1\2\u011f\u0120\5B\"\2\u0120\u0123\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u0121\3\2\2\2\u0123C\3\2\2\2\u0124"+
		"\u0125\7 \2\2\u0125\u0126\5\64\33\2\u0126\u0127\7!\2\2\u0127\u0130\3\2"+
		"\2\2\u0128\u0129\5\4\3\2\u0129\u012a\b#\1\2\u012a\u0130\3\2\2\2\u012b"+
		"\u012c\7(\2\2\u012c\u0130\b#\1\2\u012d\u012e\7)\2\2\u012e\u0130\b#\1\2"+
		"\u012f\u0124\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130E\3\2\2\2\u0131\u0132\t\3\2\2\u0132G\3\2\2\2\u0133\u0134"+
		"\t\4\2\2\u0134I\3\2\2\2\u0135\u0136\b&\1\2\u0136\u0137\b&\1\2\u0137\u0138"+
		"\7\t\2\2\u0138\u0139\7 \2\2\u0139\u013a\5N(\2\u013a\u013b\7!\2\2\u013b"+
		"\u013c\5\b\5\2\u013c\u013d\5$\23\2\u013d\u013e\b&\1\2\u013e\u013f\b&\1"+
		"\2\u013f\u0140\5L\'\2\u0140\u0141\7\13\2\2\u0141\u0142\b&\1\2\u0142K\3"+
		"\2\2\2\u0143\u0144\b\'\1\2\u0144\u0145\7\n\2\2\u0145\u0146\b\'\1\2\u0146"+
		"\u0147\7 \2\2\u0147\u0148\5N(\2\u0148\u0149\7!\2\2\u0149\u014a\5\b\5\2"+
		"\u014a\u014b\5$\23\2\u014b\u014c\b\'\1\2\u014c\u014d\b\'\1\2\u014d\u014e"+
		"\5L\'\2\u014e\u0151\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0143\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151M\3\2\2\2\u0152\u0153\5\64\33\2\u0153\u0154\5P)\2"+
		"\u0154\u0155\5\64\33\2\u0155\u0156\b(\1\2\u0156\u015c\3\2\2\2\u0157\u0158"+
		"\7\25\2\2\u0158\u015c\b(\1\2\u0159\u015a\7\26\2\2\u015a\u015c\b(\1\2\u015b"+
		"\u0152\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015cO\3\2\2\2"+
		"\u015d\u015e\t\5\2\2\u015eQ\3\2\2\2\u015f\u0160\b*\1\2\u0160\u0161\7\f"+
		"\2\2\u0161\u0162\b*\1\2\u0162\u0163\5\b\5\2\u0163\u0164\5$\23\2\u0164"+
		"\u0165\7\r\2\2\u0165\u0166\7 \2\2\u0166\u0167\b*\1\2\u0167\u0168\5N(\2"+
		"\u0168\u0169\7!\2\2\u0169\u016a\b*\1\2\u016a\u016b\7\"\2\2\u016b\u016c"+
		"\b*\1\2\u016cS\3\2\2\2\26i|\u008c\u0092\u009e\u00a4\u00bc\u00c1\u00c7"+
		"\u00f1\u00f5\u00fb\u0103\u0107\u010b\u011a\u0122\u012f\u0150\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}