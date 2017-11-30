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
		IMPORT=1, DecimalLiteral=2, HexLiteral=3, OctLiteral=4, BinaryLiteral=5, 
		FloatLiteral=6, HexFloatLiteral=7, BoolLiteral=8, CharLiteral=9, StringLiteral=10, 
		NullLiteral=11, ID=12, NL=13, WS=14;
	public static final int
		RULE_literal = 0;
	public static final String[] ruleNames = {
		"literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", null, null, null, null, null, null, null, null, null, 
		"'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "DecimalLiteral", "HexLiteral", "OctLiteral", "BinaryLiteral", 
		"FloatLiteral", "HexFloatLiteral", "BoolLiteral", "CharLiteral", "StringLiteral", 
		"NullLiteral", "ID", "NL", "WS"
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
		public TerminalNode NullLiteral() { return getToken(GiniParser.NullLiteral, 0); }
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
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexLiteral) | (1L << OctLiteral) | (1L << BinaryLiteral) | (1L << FloatLiteral) | (1L << HexFloatLiteral) | (1L << BoolLiteral) | (1L << CharLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\7\4\2\t\2\3\2"+
		"\3\2\3\2\2\2\3\2\2\3\3\2\4\r\2\5\2\4\3\2\2\2\4\5\t\2\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}