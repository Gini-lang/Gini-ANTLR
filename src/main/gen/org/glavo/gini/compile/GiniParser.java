// Generated from C:/Users/Glavo/IdeaProjects/Gini/src/main/antlr4\Gini.g4 by ANTLR 4.7
package org.glavo.gini.compile;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GiniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, AS=4, CLASS=5, ELSE=6, DEF=7, FROM=8, IF=9, IMPORT=10, 
		LAMBDA=11, RETURN=12, VAL=13, VAR=14, DecimalLiteral=15, HexLiteral=16, 
		OctLiteral=17, BinaryLiteral=18, FloatLiteral=19, HexFloatLiteral=20, 
		BoolLiteral=21, CharLiteral=22, StringLiteral=23, NoneLiteral=24, ID=25, 
		NL=26, WS=27, ShebangLine=28, LPAREN=29, RPAREN=30, LBRACE=31, RBRACE=32, 
		LBRACK=33, RBRACK=34, SEMI=35, COMMA=36, DOT=37, DOTDOT=38, ASSIGN=39, 
		GT=40, LT=41, BANG=42, TILDE=43, QUESTION=44, COLON=45, EQUAL=46, LE=47, 
		GE=48, NOTEQUAL=49, AND=50, OR=51, INC=52, DEC=53, ADD=54, SUB=55, MUL=56, 
		MULMUL=57, DIV=58, BITAND=59, BITOR=60, CARET=61, MOD=62, ARROW=63, COLONCOLON=64, 
		ADD_ASSIGN=65, SUB_ASSIGN=66, MUL_ASSIGN=67, DIV_ASSIGN=68, AND_ASSIGN=69, 
		OR_ASSIGN=70, XOR_ASSIGN=71, MOD_ASSIGN=72;
	public static final int
		RULE_sourceFile = 0, RULE_statement = 1, RULE_functionReturnType = 2, 
		RULE_dottedName = 3, RULE_expr = 4, RULE_expr1 = 5, RULE_exprN = 6, RULE_expr2 = 7, 
		RULE_ifExpr = 8, RULE_lambdaExpr = 9, RULE_functionParameterList = 10, 
		RULE_functionParameter = 11, RULE_functionTypeExpr = 12, RULE_expr3 = 13, 
		RULE_expr4 = 14, RULE_expr5 = 15, RULE_expr6 = 16, RULE_expr7 = 17, RULE_expr8 = 18, 
		RULE_expr9 = 19, RULE_expr10 = 20, RULE_compareOp = 21, RULE_expr11 = 22, 
		RULE_expr12 = 23, RULE_expr13 = 24, RULE_expr14 = 25, RULE_expr15 = 26, 
		RULE_functionArgumentList = 27, RULE_expr16 = 28, RULE_literal = 29;
	public static final String[] ruleNames = {
		"sourceFile", "statement", "functionReturnType", "dottedName", "expr", 
		"expr1", "exprN", "expr2", "ifExpr", "lambdaExpr", "functionParameterList", 
		"functionParameter", "functionTypeExpr", "expr3", "expr4", "expr5", "expr6", 
		"expr7", "expr8", "expr9", "expr10", "compareOp", "expr11", "expr12", 
		"expr13", "expr14", "expr15", "functionArgumentList", "expr16", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "','", "'**'", "'as'", "'class'", "'else'", "'def'", "'from'", 
		"'if'", "'import'", null, "'return'", "'val'", "'var'", null, null, null, 
		null, null, null, null, null, null, "'none'", null, null, null, null, 
		"'('", "')'", "'{'", "'}'", "'['", "']'", null, null, "'.'", "'..'", "'='", 
		"'>'", "'<'", "'!'", "'~'", "'?'", null, "'=='", "'<='", "'>='", "'!='", 
		"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", null, null, "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'->'", null, "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'%='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "AS", "CLASS", "ELSE", "DEF", "FROM", "IF", "IMPORT", 
		"LAMBDA", "RETURN", "VAL", "VAR", "DecimalLiteral", "HexLiteral", "OctLiteral", 
		"BinaryLiteral", "FloatLiteral", "HexFloatLiteral", "BoolLiteral", "CharLiteral", 
		"StringLiteral", "NoneLiteral", "ID", "NL", "WS", "ShebangLine", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"DOTDOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", 
		"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
		"MUL", "MULMUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN"
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
	public String getGrammarFileName() { return "Gini.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GiniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GiniParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(60);
				match(NL);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << FROM) | (1L << IF) | (1L << IMPORT) | (1L << LAMBDA) | (1L << VAL) | (1L << VAR) | (1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NoneLiteral) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportStatementContext extends StatementContext {
		public TerminalNode IMPORT() { return getToken(GiniParser.IMPORT, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(GiniParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GiniParser.SEMI, i);
		}
		public ImportStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GiniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GiniParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public TerminalNode SEMI() { return getToken(GiniParser.SEMI, 0); }
		public TerminalNode VAL() { return getToken(GiniParser.VAL, 0); }
		public TerminalNode VAR() { return getToken(GiniParser.VAR, 0); }
		public LetStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public TerminalNode SEMI() { return getToken(GiniParser.SEMI, 0); }
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDefineStatementContext extends StatementContext {
		public TerminalNode DEF() { return getToken(GiniParser.DEF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public TerminalNode ID() { return getToken(GiniParser.ID, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GiniParser.COLON, 0); }
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public FunctionDefineStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFunctionDefineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFunctionDefineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFunctionDefineStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromImportStatementContext extends StatementContext {
		public TerminalNode FROM() { return getToken(GiniParser.FROM, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(GiniParser.IMPORT, 0); }
		public TerminalNode ID() { return getToken(GiniParser.ID, 0); }
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(GiniParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GiniParser.SEMI, i);
		}
		public FromImportStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFromImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFromImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFromImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new LetStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL || _la==VAR) {
					{
					setState(74);
					_la = _input.LA(1);
					if ( !(_la==VAL || _la==VAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(79); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						match(ID);
						setState(78);
						match(ASSIGN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(83);
				expr();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(84);
					match(NL);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(90);
					match(SEMI);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(91);
						match(NL);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(IMPORT);
				setState(100);
				dottedName();
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL || _la==SEMI );
				}
				break;
			case 3:
				_localctx = new FromImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(FROM);
				setState(107);
				dottedName();
				setState(108);
				match(IMPORT);
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL || _la==SEMI );
				}
				break;
			case 4:
				_localctx = new FunctionDefineStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(DEF);
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						match(NL);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(122);
					match(ID);
					}
				}

				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(125);
					match(NL);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(LPAREN);
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						match(NL);
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(138);
					functionParameterList();
					}
				}

				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(141);
					match(NL);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(RPAREN);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(148);
					match(NL);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(154);
					match(COLON);
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(155);
						match(NL);
						}
						}
						setState(160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(161);
					functionReturnType();
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(162);
						match(NL);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(ARROW);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(171);
					match(NL);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				expr();
				}
				break;
			case 5:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				expr();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(179);
					match(NL);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(185);
					match(SEMI);
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(186);
						match(NL);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

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

	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public Expr8Context expr8() {
			return getRuleContext(Expr8Context.class,0);
		}
		public Expr9Context expr9() {
			return getRuleContext(Expr9Context.class,0);
		}
		public Expr10Context expr10() {
			return getRuleContext(Expr10Context.class,0);
		}
		public Expr11Context expr11() {
			return getRuleContext(Expr11Context.class,0);
		}
		public Expr12Context expr12() {
			return getRuleContext(Expr12Context.class,0);
		}
		public Expr13Context expr13() {
			return getRuleContext(Expr13Context.class,0);
		}
		public Expr14Context expr14() {
			return getRuleContext(Expr14Context.class,0);
		}
		public Expr15Context expr15() {
			return getRuleContext(Expr15Context.class,0);
		}
		public Expr16Context expr16() {
			return getRuleContext(Expr16Context.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionReturnType);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				expr5();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				expr6();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				expr7();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				expr8();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				expr9();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				expr10();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				expr11();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				expr12();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
				expr13();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				expr14();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				expr15();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(207);
				expr16();
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

	public static class DottedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GiniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GiniParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GiniParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GiniParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterDottedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitDottedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitDottedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		DottedNameContext _localctx = new DottedNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dottedName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(211);
						match(NL);
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(217);
					match(DOT);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(218);
						match(NL);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(224);
					match(ID);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprNContext exprN() {
			return getRuleContext(ExprNContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				exprN();
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

	public static class Expr1Context extends ParserRuleContext {
		public List<ExprNContext> exprN() {
			return getRuleContexts(ExprNContext.class);
		}
		public ExprNContext exprN(int i) {
			return getRuleContext(ExprNContext.class,i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			exprN();
			setState(237); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(235);
					match(T__1);
					setState(236);
					exprN();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ExprNContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public Expr8Context expr8() {
			return getRuleContext(Expr8Context.class,0);
		}
		public Expr9Context expr9() {
			return getRuleContext(Expr9Context.class,0);
		}
		public Expr10Context expr10() {
			return getRuleContext(Expr10Context.class,0);
		}
		public Expr11Context expr11() {
			return getRuleContext(Expr11Context.class,0);
		}
		public Expr12Context expr12() {
			return getRuleContext(Expr12Context.class,0);
		}
		public Expr13Context expr13() {
			return getRuleContext(Expr13Context.class,0);
		}
		public Expr14Context expr14() {
			return getRuleContext(Expr14Context.class,0);
		}
		public Expr15Context expr15() {
			return getRuleContext(Expr15Context.class,0);
		}
		public Expr16Context expr16() {
			return getRuleContext(Expr16Context.class,0);
		}
		public ExprNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExprN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExprN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExprN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNContext exprN() throws RecognitionException {
		ExprNContext _localctx = new ExprNContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprN);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				expr3();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				expr4();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				expr5();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				expr6();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				expr7();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				expr8();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				expr9();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				expr10();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				expr11();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				expr12();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(252);
				expr13();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(253);
				expr14();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(254);
				expr15();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(255);
				expr16();
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

	public static class Expr2Context extends ParserRuleContext {
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public LambdaExprContext lambdaExpr() {
			return getRuleContext(LambdaExprContext.class,0);
		}
		public FunctionTypeExprContext functionTypeExpr() {
			return getRuleContext(FunctionTypeExprContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr2);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				ifExpr();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				lambdaExpr();
				}
				break;
			case NoneLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				functionTypeExpr();
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GiniParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GiniParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GiniParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public TerminalNode ELSE() { return getToken(GiniParser.ELSE, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(IF);
			setState(264);
			match(LPAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(265);
				match(NL);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			expr();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(272);
				match(NL);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(RPAREN);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(279);
				match(NL);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			expr();
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(286);
				match(NL);
				}
				break;
			}
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(289);
				match(ELSE);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(290);
					match(NL);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				expr();
				}
				break;
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

	public static class LambdaExprContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(GiniParser.LAMBDA, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public ExprNContext exprN() {
			return getRuleContext(ExprNContext.class,0);
		}
		public LambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExprContext lambdaExpr() throws RecognitionException {
		LambdaExprContext _localctx = new LambdaExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambdaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LAMBDA);
			setState(300);
			functionParameterList();
			setState(301);
			match(ARROW);
			setState(302);
			exprN();
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

	public static class FunctionParameterListContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GiniParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GiniParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public FunctionParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFunctionParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFunctionParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			functionParameter();
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(305);
						match(NL);
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					match(COMMA);
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(312);
						match(NL);
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(318);
					functionParameter();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GiniParser.ID, 0); }
		public TerminalNode COLON() { return getToken(GiniParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(325);
				match(COLON);
				setState(326);
				expr();
				}
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

	public static class FunctionTypeExprContext extends ParserRuleContext {
		public FunctionTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFunctionTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFunctionTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFunctionTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeExprContext functionTypeExpr() throws RecognitionException {
		FunctionTypeExprContext _localctx = new FunctionTypeExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionTypeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(NoneLiteral);
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

	public static class Expr3Context extends ParserRuleContext {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public List<TerminalNode> DOTDOT() { return getTokens(GiniParser.DOTDOT); }
		public TerminalNode DOTDOT(int i) {
			return getToken(GiniParser.DOTDOT, i);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			expr4();
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(DOTDOT);
				setState(333);
				expr4();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOTDOT );
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

	public static class Expr4Context extends ParserRuleContext {
		public List<Expr5Context> expr5() {
			return getRuleContexts(Expr5Context.class);
		}
		public Expr5Context expr5(int i) {
			return getRuleContext(Expr5Context.class,i);
		}
		public TerminalNode COLON() { return getToken(GiniParser.COLON, 0); }
		public TerminalNode AS() { return getToken(GiniParser.AS, 0); }
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			expr5();
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			expr5();
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

	public static class Expr5Context extends ParserRuleContext {
		public List<Expr6Context> expr6() {
			return getRuleContexts(Expr6Context.class);
		}
		public Expr6Context expr6(int i) {
			return getRuleContext(Expr6Context.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GiniParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GiniParser.OR, i);
		}
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			expr6();
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				match(OR);
				setState(344);
				expr6();
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OR );
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

	public static class Expr6Context extends ParserRuleContext {
		public List<Expr7Context> expr7() {
			return getRuleContexts(Expr7Context.class);
		}
		public Expr7Context expr7(int i) {
			return getRuleContext(Expr7Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GiniParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GiniParser.AND, i);
		}
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		Expr6Context _localctx = new Expr6Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			expr7();
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(350);
				match(AND);
				setState(351);
				expr7();
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND );
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

	public static class Expr7Context extends ParserRuleContext {
		public List<Expr8Context> expr8() {
			return getRuleContexts(Expr8Context.class);
		}
		public Expr8Context expr8(int i) {
			return getRuleContext(Expr8Context.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(GiniParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(GiniParser.BITOR, i);
		}
		public Expr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr7Context expr7() throws RecognitionException {
		Expr7Context _localctx = new Expr7Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expr8();
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(357);
				match(BITOR);
				setState(358);
				expr8();
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BITOR );
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

	public static class Expr8Context extends ParserRuleContext {
		public List<Expr9Context> expr9() {
			return getRuleContexts(Expr9Context.class);
		}
		public Expr9Context expr9(int i) {
			return getRuleContext(Expr9Context.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(GiniParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(GiniParser.BITAND, i);
		}
		public Expr8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr8Context expr8() throws RecognitionException {
		Expr8Context _localctx = new Expr8Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr8);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			expr9();
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(364);
				match(BITAND);
				setState(365);
				expr9();
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BITAND );
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

	public static class Expr9Context extends ParserRuleContext {
		public List<Expr10Context> expr10() {
			return getRuleContexts(Expr10Context.class);
		}
		public Expr10Context expr10(int i) {
			return getRuleContext(Expr10Context.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GiniParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(GiniParser.NOTEQUAL, 0); }
		public Expr9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr9Context expr9() throws RecognitionException {
		Expr9Context _localctx = new Expr9Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			expr10();
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(372);
			expr10();
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

	public static class Expr10Context extends ParserRuleContext {
		public List<Expr11Context> expr11() {
			return getRuleContexts(Expr11Context.class);
		}
		public Expr11Context expr11(int i) {
			return getRuleContext(Expr11Context.class,i);
		}
		public List<CompareOpContext> compareOp() {
			return getRuleContexts(CompareOpContext.class);
		}
		public CompareOpContext compareOp(int i) {
			return getRuleContext(CompareOpContext.class,i);
		}
		public Expr10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr10Context expr10() throws RecognitionException {
		Expr10Context _localctx = new Expr10Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			expr11();
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				compareOp();
				setState(376);
				expr11();
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0) );
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

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(GiniParser.LT, 0); }
		public TerminalNode LE() { return getToken(GiniParser.LE, 0); }
		public TerminalNode GT() { return getToken(GiniParser.GT, 0); }
		public TerminalNode GE() { return getToken(GiniParser.GE, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Expr11Context extends ParserRuleContext {
		public List<Expr12Context> expr12() {
			return getRuleContexts(Expr12Context.class);
		}
		public Expr12Context expr12(int i) {
			return getRuleContext(Expr12Context.class,i);
		}
		public Expr11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr11Context expr11() throws RecognitionException {
		Expr11Context _localctx = new Expr11Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr11);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			expr12();
			setState(388); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(388);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(385);
						match(ADD);
						}
						break;
					case SUB:
						{
						setState(386);
						match(SUB);
						setState(387);
						expr12();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(390); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Expr12Context extends ParserRuleContext {
		public List<Expr13Context> expr13() {
			return getRuleContexts(Expr13Context.class);
		}
		public Expr13Context expr13(int i) {
			return getRuleContext(Expr13Context.class,i);
		}
		public Expr12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr12; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr12(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr12Context expr12() throws RecognitionException {
		Expr12Context _localctx = new Expr12Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr12);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			expr13();
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(397);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(393);
					match(T__0);
					}
					break;
				case DIV:
					{
					setState(394);
					match(DIV);
					}
					break;
				case MOD:
					{
					setState(395);
					match(MOD);
					setState(396);
					expr13();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << DIV) | (1L << MOD))) != 0) );
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

	public static class Expr13Context extends ParserRuleContext {
		public List<Expr14Context> expr14() {
			return getRuleContexts(Expr14Context.class);
		}
		public Expr14Context expr14(int i) {
			return getRuleContext(Expr14Context.class,i);
		}
		public Expr13Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr13; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr13(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr13(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr13Context expr13() throws RecognitionException {
		Expr13Context _localctx = new Expr13Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr13);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(401);
					expr14();
					setState(402);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==CARET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(406); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(408);
			expr14();
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

	public static class Expr14Context extends ParserRuleContext {
		public Expr15Context expr15() {
			return getRuleContext(Expr15Context.class,0);
		}
		public Expr14Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr14; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr14(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr14(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr14Context expr14() throws RecognitionException {
		Expr14Context _localctx = new Expr14Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr14);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(410);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(413); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0) );
			setState(415);
			expr15();
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

	public static class Expr15Context extends ParserRuleContext {
		public Expr16Context expr16() {
			return getRuleContext(Expr16Context.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(GiniParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GiniParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(GiniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GiniParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public List<FunctionArgumentListContext> functionArgumentList() {
			return getRuleContexts(FunctionArgumentListContext.class);
		}
		public FunctionArgumentListContext functionArgumentList(int i) {
			return getRuleContext(FunctionArgumentListContext.class,i);
		}
		public Expr15Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr15; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr15(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr15(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr15Context expr15() throws RecognitionException {
		Expr15Context _localctx = new Expr15Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr15);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			expr16();
			setState(454); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(454);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(418);
						match(DOT);
						setState(419);
						match(ID);
						}
						break;
					case LBRACK:
						{
						setState(420);
						match(LBRACK);
						setState(424);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(421);
								match(NL);
								}
								} 
							}
							setState(426);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
						}
						setState(428);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LAMBDA) | (1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NoneLiteral) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0)) {
							{
							setState(427);
							functionArgumentList();
							}
						}

						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(430);
							match(NL);
							}
							}
							setState(435);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(436);
						match(RBRACK);
						}
						break;
					case LPAREN:
						{
						setState(437);
						match(LPAREN);
						setState(441);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(438);
								match(NL);
								}
								} 
							}
							setState(443);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						}
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LAMBDA) | (1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NoneLiteral) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0)) {
							{
							setState(444);
							functionArgumentList();
							}
						}

						setState(450);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(447);
							match(NL);
							}
							}
							setState(452);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(453);
						match(RPAREN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionArgumentListContext extends ParserRuleContext {
		public List<ExprNContext> exprN() {
			return getRuleContexts(ExprNContext.class);
		}
		public ExprNContext exprN(int i) {
			return getRuleContext(ExprNContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GiniParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GiniParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public FunctionArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterFunctionArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitFunctionArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitFunctionArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentListContext functionArgumentList() throws RecognitionException {
		FunctionArgumentListContext _localctx = new FunctionArgumentListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionArgumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			exprN();
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(459);
						match(NL);
						}
						}
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(465);
					match(COMMA);
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(466);
						match(NL);
						}
						}
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(472);
					exprN();
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class Expr16Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionArgumentListContext functionArgumentList() {
			return getRuleContext(FunctionArgumentListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GiniParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GiniParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(GiniParser.ID, 0); }
		public Expr16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterExpr16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitExpr16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitExpr16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr16Context expr16() throws RecognitionException {
		Expr16Context _localctx = new Expr16Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr16);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(LPAREN);
				setState(479);
				expr();
				setState(480);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(LBRACK);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LAMBDA) | (1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NoneLiteral) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					setState(483);
					functionArgumentList();
					}
				}

				setState(486);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(LBRACE);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(488);
					match(NL);
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << FROM) | (1L << IF) | (1L << IMPORT) | (1L << LAMBDA) | (1L << VAL) | (1L << VAR) | (1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NoneLiteral) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << TILDE) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					{
					setState(494);
					statement();
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(500);
				match(RBRACE);
				}
				break;
			case DecimalLiteral:
			case HexLiteral:
			case OctLiteral:
			case BinaryLiteral:
			case FloatLiteral:
			case HexFloatLiteral:
			case BoolLiteral:
			case CharLiteral:
			case StringLiteral:
			case NoneLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(502);
				match(ID);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(GiniParser.DecimalLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(GiniParser.HexLiteral, 0); }
		public TerminalNode OctLiteral() { return getToken(GiniParser.OctLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(GiniParser.BinaryLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(GiniParser.FloatLiteral, 0); }
		public TerminalNode HexFloatLiteral() { return getToken(GiniParser.HexFloatLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(GiniParser.BoolLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(GiniParser.CharLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(GiniParser.StringLiteral, 0); }
		public TerminalNode NoneLiteral() { return getToken(GiniParser.NoneLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GiniListener ) ((GiniListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GiniVisitor ) return ((GiniVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NoneLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\5\3N\n\3\3"+
		"\3\3\3\6\3R\n\3\r\3\16\3S\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\7\3"+
		"_\n\3\f\3\16\3b\13\3\5\3d\n\3\3\3\3\3\3\3\6\3i\n\3\r\3\16\3j\3\3\3\3\3"+
		"\3\3\3\3\3\6\3r\n\3\r\3\16\3s\3\3\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\5\3"+
		"~\n\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\3\3\3\7\3\u0088\n\3\f\3"+
		"\16\3\u008b\13\3\3\3\5\3\u008e\n\3\3\3\7\3\u0091\n\3\f\3\16\3\u0094\13"+
		"\3\3\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\3\3\3\7\3\u009f\n\3\f\3"+
		"\16\3\u00a2\13\3\3\3\3\3\7\3\u00a6\n\3\f\3\16\3\u00a9\13\3\5\3\u00ab\n"+
		"\3\3\3\3\3\7\3\u00af\n\3\f\3\16\3\u00b2\13\3\3\3\3\3\3\3\7\3\u00b7\n\3"+
		"\f\3\16\3\u00ba\13\3\3\3\3\3\7\3\u00be\n\3\f\3\16\3\u00c1\13\3\5\3\u00c3"+
		"\n\3\5\3\u00c5\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00d3\n\4\3\5\3\5\7\5\u00d7\n\5\f\5\16\5\u00da\13\5\3\5\3\5\7\5\u00de"+
		"\n\5\f\5\16\5\u00e1\13\5\3\5\7\5\u00e4\n\5\f\5\16\5\u00e7\13\5\3\6\3\6"+
		"\5\6\u00eb\n\6\3\7\3\7\3\7\6\7\u00f0\n\7\r\7\16\7\u00f1\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0103\n\b\3\t\3\t\3"+
		"\t\5\t\u0108\n\t\3\n\3\n\3\n\7\n\u010d\n\n\f\n\16\n\u0110\13\n\3\n\3\n"+
		"\7\n\u0114\n\n\f\n\16\n\u0117\13\n\3\n\3\n\7\n\u011b\n\n\f\n\16\n\u011e"+
		"\13\n\3\n\3\n\5\n\u0122\n\n\3\n\3\n\7\n\u0126\n\n\f\n\16\n\u0129\13\n"+
		"\3\n\5\n\u012c\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0135\n\f\f\f"+
		"\16\f\u0138\13\f\3\f\3\f\7\f\u013c\n\f\f\f\16\f\u013f\13\f\3\f\7\f\u0142"+
		"\n\f\f\f\16\f\u0145\13\f\3\r\3\r\3\r\5\r\u014a\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\6\17\u0151\n\17\r\17\16\17\u0152\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\6\21\u015c\n\21\r\21\16\21\u015d\3\22\3\22\3\22\6\22\u0163\n\22\r"+
		"\22\16\22\u0164\3\23\3\23\3\23\6\23\u016a\n\23\r\23\16\23\u016b\3\24\3"+
		"\24\3\24\6\24\u0171\n\24\r\24\16\24\u0172\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\6\26\u017d\n\26\r\26\16\26\u017e\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\6\30\u0187\n\30\r\30\16\30\u0188\3\31\3\31\3\31\3\31\3\31\6\31\u0190"+
		"\n\31\r\31\16\31\u0191\3\32\3\32\3\32\6\32\u0197\n\32\r\32\16\32\u0198"+
		"\3\32\3\32\3\33\6\33\u019e\n\33\r\33\16\33\u019f\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\7\34\u01a9\n\34\f\34\16\34\u01ac\13\34\3\34\5\34\u01af\n"+
		"\34\3\34\7\34\u01b2\n\34\f\34\16\34\u01b5\13\34\3\34\3\34\3\34\7\34\u01ba"+
		"\n\34\f\34\16\34\u01bd\13\34\3\34\5\34\u01c0\n\34\3\34\7\34\u01c3\n\34"+
		"\f\34\16\34\u01c6\13\34\3\34\6\34\u01c9\n\34\r\34\16\34\u01ca\3\35\3\35"+
		"\7\35\u01cf\n\35\f\35\16\35\u01d2\13\35\3\35\3\35\7\35\u01d6\n\35\f\35"+
		"\16\35\u01d9\13\35\3\35\7\35\u01dc\n\35\f\35\16\35\u01df\13\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u01e7\n\36\3\36\3\36\3\36\7\36\u01ec\n\36"+
		"\f\36\16\36\u01ef\13\36\3\36\7\36\u01f2\n\36\f\36\16\36\u01f5\13\36\3"+
		"\36\3\36\3\36\5\36\u01fa\n\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\13\3\2\17\20\4\2\34\34%%"+
		"\4\2\3\3\33\33\4\2\6\6//\4\2\60\60\63\63\4\2*+\61\62\4\2\5\5??\4\2--8"+
		"9\3\2\21\32\2\u0244\2A\3\2\2\2\4\u00c4\3\2\2\2\6\u00d2\3\2\2\2\b\u00d4"+
		"\3\2\2\2\n\u00ea\3\2\2\2\f\u00ec\3\2\2\2\16\u0102\3\2\2\2\20\u0107\3\2"+
		"\2\2\22\u0109\3\2\2\2\24\u012d\3\2\2\2\26\u0132\3\2\2\2\30\u0146\3\2\2"+
		"\2\32\u014b\3\2\2\2\34\u014d\3\2\2\2\36\u0154\3\2\2\2 \u0158\3\2\2\2\""+
		"\u015f\3\2\2\2$\u0166\3\2\2\2&\u016d\3\2\2\2(\u0174\3\2\2\2*\u0178\3\2"+
		"\2\2,\u0180\3\2\2\2.\u0182\3\2\2\2\60\u018a\3\2\2\2\62\u0196\3\2\2\2\64"+
		"\u019d\3\2\2\2\66\u01a3\3\2\2\28\u01cc\3\2\2\2:\u01f9\3\2\2\2<\u01fb\3"+
		"\2\2\2>@\7\34\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA"+
		"\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2I"+
		"G\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LN\t\2\2\2ML\3\2\2\2MN\3\2\2\2NQ\3\2\2\2"+
		"OP\7\33\2\2PR\7)\2\2QO\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2"+
		"UY\5\n\6\2VX\7\34\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zc\3\2\2"+
		"\2[Y\3\2\2\2\\`\7%\2\2]_\7\34\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2c\\\3\2\2\2cd\3\2\2\2d\u00c5\3\2\2\2ef\7\f\2\2"+
		"fh\5\b\5\2gi\t\3\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\u00c5\3"+
		"\2\2\2lm\7\n\2\2mn\5\b\5\2no\7\f\2\2oq\t\4\2\2pr\t\3\2\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2t\u00c5\3\2\2\2uy\7\t\2\2vx\7\34\2\2wv\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|~\7\33\2\2}|\3\2"+
		"\2\2}~\3\2\2\2~\u0082\3\2\2\2\177\u0081\7\34\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0089\7\37\2\2\u0086\u0088\7\34\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\5\26\f\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u0091\7\34"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\7 "+
		"\2\2\u0096\u0098\7\34\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00aa\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u00a0\7/\2\2\u009d\u009f\7\34\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a7\5\6\4\2\u00a4\u00a6\7\34\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u009c\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\7A\2\2\u00ad\u00af\7\34"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00c5\5\n"+
		"\6\2\u00b4\u00b8\5\n\6\2\u00b5\u00b7\7\34\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c2\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\7%\2\2\u00bc\u00be\7\34\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4M\3\2\2\2\u00c4e\3\2\2\2\u00c4"+
		"l\3\2\2\2\u00c4u\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c5\5\3\2\2\2\u00c6\u00d3"+
		"\5 \21\2\u00c7\u00d3\5\"\22\2\u00c8\u00d3\5$\23\2\u00c9\u00d3\5&\24\2"+
		"\u00ca\u00d3\5(\25\2\u00cb\u00d3\5*\26\2\u00cc\u00d3\5.\30\2\u00cd\u00d3"+
		"\5\60\31\2\u00ce\u00d3\5\62\32\2\u00cf\u00d3\5\64\33\2\u00d0\u00d3\5\66"+
		"\34\2\u00d1\u00d3\5:\36\2\u00d2\u00c6\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2"+
		"\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cb\3\2"+
		"\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\7\3\2\2\2"+
		"\u00d4\u00e5\7\33\2\2\u00d5\u00d7\7\34\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00df\7\'\2\2\u00dc\u00de\7\34\2\2\u00dd\u00dc\3"+
		"\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\33\2\2\u00e3\u00d8\3"+
		"\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\t\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\5\f\7\2\u00e9\u00eb\5\16\b"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\13\3\2\2\2\u00ec\u00ef"+
		"\5\16\b\2\u00ed\u00ee\7\4\2\2\u00ee\u00f0\5\16\b\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\r\3"+
		"\2\2\2\u00f3\u0103\5\20\t\2\u00f4\u0103\5\34\17\2\u00f5\u0103\5\36\20"+
		"\2\u00f6\u0103\5 \21\2\u00f7\u0103\5\"\22\2\u00f8\u0103\5$\23\2\u00f9"+
		"\u0103\5&\24\2\u00fa\u0103\5(\25\2\u00fb\u0103\5*\26\2\u00fc\u0103\5."+
		"\30\2\u00fd\u0103\5\60\31\2\u00fe\u0103\5\62\32\2\u00ff\u0103\5\64\33"+
		"\2\u0100\u0103\5\66\34\2\u0101\u0103\5:\36\2\u0102\u00f3\3\2\2\2\u0102"+
		"\u00f4\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f7\3\2"+
		"\2\2\u0102\u00f8\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\17\3\2\2\2\u0104\u0108\5\22\n\2\u0105\u0108\5\24\13\2\u0106\u0108\5\32"+
		"\16\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\21\3\2\2\2\u0109\u010a\7\13\2\2\u010a\u010e\7\37\2\2\u010b\u010d\7\34"+
		"\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\5\n"+
		"\6\2\u0112\u0114\7\34\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011c\7 \2\2\u0119\u011b\7\34\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0121\5\n\6\2\u0120\u0122\7\34\2\2\u0121"+
		"\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012b\3\2\2\2\u0123\u0127\7\b"+
		"\2\2\u0124\u0126\7\34\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\5\n\6\2\u012b\u0123\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\23\3\2\2\2\u012d\u012e\7\r\2\2\u012e\u012f\5\26\f\2\u012f\u0130\7A\2"+
		"\2\u0130\u0131\5\16\b\2\u0131\25\3\2\2\2\u0132\u0143\5\30\r\2\u0133\u0135"+
		"\7\34\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013d"+
		"\7&\2\2\u013a\u013c\7\34\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0142\5\30\r\2\u0141\u0136\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\27\3\2\2\2\u0145\u0143\3\2\2"+
		"\2\u0146\u0149\7\33\2\2\u0147\u0148\7/\2\2\u0148\u014a\5\n\6\2\u0149\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\31\3\2\2\2\u014b\u014c\7\32\2\2\u014c"+
		"\33\3\2\2\2\u014d\u0150\5\36\20\2\u014e\u014f\7(\2\2\u014f\u0151\5\36"+
		"\20\2\u0150\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\35\3\2\2\2\u0154\u0155\5 \21\2\u0155\u0156\t\5\2"+
		"\2\u0156\u0157\5 \21\2\u0157\37\3\2\2\2\u0158\u015b\5\"\22\2\u0159\u015a"+
		"\7\65\2\2\u015a\u015c\5\"\22\2\u015b\u0159\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e!\3\2\2\2\u015f\u0162\5"+
		"$\23\2\u0160\u0161\7\64\2\2\u0161\u0163\5$\23\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165#\3\2\2\2"+
		"\u0166\u0169\5&\24\2\u0167\u0168\7>\2\2\u0168\u016a\5&\24\2\u0169\u0167"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"%\3\2\2\2\u016d\u0170\5(\25\2\u016e\u016f\7=\2\2\u016f\u0171\5(\25\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\'\3\2\2\2\u0174\u0175\5*\26\2\u0175\u0176\t\6\2\2\u0176\u0177"+
		"\5*\26\2\u0177)\3\2\2\2\u0178\u017c\5.\30\2\u0179\u017a\5,\27\2\u017a"+
		"\u017b\5.\30\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f+\3\2\2\2\u0180\u0181"+
		"\t\7\2\2\u0181-\3\2\2\2\u0182\u0186\5\60\31\2\u0183\u0187\78\2\2\u0184"+
		"\u0185\79\2\2\u0185\u0187\5\60\31\2\u0186\u0183\3\2\2\2\u0186\u0184\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"/\3\2\2\2\u018a\u018f\5\62\32\2\u018b\u0190\7\3\2\2\u018c\u0190\7<\2\2"+
		"\u018d\u018e\7@\2\2\u018e\u0190\5\62\32\2\u018f\u018b\3\2\2\2\u018f\u018c"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\61\3\2\2\2\u0193\u0194\5\64\33\2\u0194\u0195\t\b"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\64"+
		"\33\2\u019b\63\3\2\2\2\u019c\u019e\t\t\2\2\u019d\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\5\66\34\2\u01a2\65\3\2\2\2\u01a3\u01c8\5:\36\2\u01a4\u01a5\7\'"+
		"\2\2\u01a5\u01c9\7\33\2\2\u01a6\u01aa\7#\2\2\u01a7\u01a9\7\34\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\58\35\2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b3\3\2\2\2\u01b0\u01b2\7\34"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01c9\7$"+
		"\2\2\u01b7\u01bb\7\37\2\2\u01b8\u01ba\7\34\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\58\35\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01c3\7\34\2\2\u01c2\u01c1\3"+
		"\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\7 \2\2\u01c8\u01a4\3\2"+
		"\2\2\u01c8\u01a6\3\2\2\2\u01c8\u01b7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\67\3\2\2\2\u01cc\u01dd\5\16\b"+
		"\2\u01cd\u01cf\7\34\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d7\7&\2\2\u01d4\u01d6\7\34\2\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\5\16\b\2\u01db\u01d0\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de9\3\2\2\2"+
		"\u01df\u01dd\3\2\2\2\u01e0\u01e1\7\37\2\2\u01e1\u01e2\5\n\6\2\u01e2\u01e3"+
		"\7 \2\2\u01e3\u01fa\3\2\2\2\u01e4\u01e6\7#\2\2\u01e5\u01e7\58\35\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01fa\7$"+
		"\2\2\u01e9\u01ed\7!\2\2\u01ea\u01ec\7\34\2\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f3\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\5\4\3\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01fa\7\"\2\2\u01f7\u01fa\5<\37\2\u01f8"+
		"\u01fa\7\33\2\2\u01f9\u01e0\3\2\2\2\u01f9\u01e4\3\2\2\2\u01f9\u01e9\3"+
		"\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa;\3\2\2\2\u01fb\u01fc"+
		"\t\n\2\2\u01fc=\3\2\2\2GAGMSY`cjsy}\u0082\u0089\u008d\u0092\u0099\u00a0"+
		"\u00a7\u00aa\u00b0\u00b8\u00bf\u00c2\u00c4\u00d2\u00d8\u00df\u00e5\u00ea"+
		"\u00f1\u0102\u0107\u010e\u0115\u011c\u0121\u0127\u012b\u0136\u013d\u0143"+
		"\u0149\u0152\u015d\u0164\u016b\u0172\u017e\u0186\u0188\u018f\u0191\u0198"+
		"\u019f\u01aa\u01ae\u01b3\u01bb\u01bf\u01c4\u01c8\u01ca\u01d0\u01d7\u01dd"+
		"\u01e6\u01ed\u01f3\u01f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}