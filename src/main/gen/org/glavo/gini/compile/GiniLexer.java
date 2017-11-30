// Generated from C:/Users/Glavo/IdeaProjects/Gini/src/main/antlr4\Gini.g4 by ANTLR 4.7
package org.glavo.gini.compile;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GiniLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, DecimalLiteral=2, HexLiteral=3, OctLiteral=4, BinaryLiteral=5, 
		FloatLiteral=6, HexFloatLiteral=7, BoolLiteral=8, CharLiteral=9, StringLiteral=10, 
		NullLiteral=11, ID=12, NL=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IMPORT", "DecimalLiteral", "HexLiteral", "OctLiteral", "BinaryLiteral", 
		"FloatLiteral", "HexFloatLiteral", "BoolLiteral", "CharLiteral", "StringLiteral", 
		"NullLiteral", "ID", "ExponentPart", "EscapeSequence", "HexDigits", "HexDigit", 
		"Digits", "IdStart", "IdContinue", "NL", "WS"
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


	public GiniLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gini.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\5\38\n\3\3\3\6\3;\n\3\r\3\16\3<\3\3\5\3@\n\3\5\3B\n\3"+
		"\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\5\4Q\n\4\3\4"+
		"\5\4T\n\4\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13"+
		"\5\3\5\5\5e\n\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3"+
		"\6\5\6t\n\6\3\6\5\6w\n\6\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\5\7\u0080\n\7\3"+
		"\7\5\7\u0083\n\7\3\7\5\7\u0086\n\7\3\7\3\7\3\7\5\7\u008b\n\7\3\7\5\7\u008e"+
		"\n\7\5\7\u0090\n\7\3\b\3\b\3\b\3\b\5\b\u0096\n\b\3\b\5\b\u0099\n\b\3\b"+
		"\3\b\5\b\u009d\n\b\3\b\3\b\5\b\u00a1\n\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\n\3\n\3\n\5\n\u00b5\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13\u00bc\n\13\f\13\16\13\u00bf\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3\16\3"+
		"\16\5\16\u00d1\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\17"+
		"\5\17\u00dc\n\17\3\17\3\17\3\17\6\17\u00e1\n\17\r\17\16\17\u00e2\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\20\3\20\3\20\7\20\u00ef\n\20\f"+
		"\20\16\20\u00f2\13\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\22\3\22\7\22\u00fb"+
		"\n\22\f\22\16\22\u00fe\13\22\3\22\5\22\u0101\n\22\3\23\5\23\u0104\n\23"+
		"\3\24\3\24\5\24\u0108\n\24\3\25\3\25\3\25\5\25\u010d\n\25\3\26\3\26\3"+
		"\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\2\35\2\37\2!\2#\2%\2\'\2)\17+\20\3\2\32\3\2\63;\4\2NNnn\4\2ZZz"+
		"z\5\2\62;CHch\6\2\62;CHaach\3\2\629\4\2\629aa\4\2DDdd\3\2\62\63\4\2\62"+
		"\63aa\6\2FFHHffhh\4\2RRrr\4\2--//\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^"+
		"\4\2GGgg\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\62;\4\2\62;aa\u0129\2C\\aa"+
		"c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0243"+
		"\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0\u02f0\u037c\u037c\u0388\u0388"+
		"\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03f7\u03f9\u0483"+
		"\u048c\u04d0\u04d2\u04fb\u0502\u0511\u0533\u0558\u055b\u055b\u0563\u0589"+
		"\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0670\u0671\u0673\u06d5"+
		"\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712"+
		"\u0714\u0731\u074f\u076f\u0782\u07a7\u07b3\u07b3\u0906\u093b\u093f\u093f"+
		"\u0952\u0952\u095a\u0963\u097f\u097f\u0987\u098e\u0991\u0992\u0995\u09aa"+
		"\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0\u09d0\u09de\u09df"+
		"\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32"+
		"\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76"+
		"\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb"+
		"\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a"+
		"\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63"+
		"\u0b73\u0b73\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c"+
		"\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0c07\u0c0e"+
		"\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e"+
		"\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0"+
		"\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63"+
		"\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32"+
		"\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c"+
		"\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9"+
		"\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8"+
		"\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6c\u0f8a\u0f8d\u1002\u1023"+
		"\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10fc\u10fe\u10fe"+
		"\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u124a\u124c\u124f\u1252\u1258"+
		"\u125a\u125a\u125c\u125f\u1262\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7"+
		"\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317"+
		"\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671\u1678\u1683\u169c"+
		"\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1713\u1722\u1733\u1742\u1753"+
		"\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17de\u17de\u1822\u1879"+
		"\u1882\u18aa\u1902\u191e\u1952\u196f\u1972\u1976\u1982\u19ab\u19c3\u19c9"+
		"\u1a02\u1a18\u1d02\u1dc1\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f"+
		"\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f"+
		"\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce"+
		"\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2073\u2073"+
		"\u2081\u2081\u2092\u2096\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117"+
		"\u211a\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u2133\u2135\u213b"+
		"\u213e\u2141\u2147\u214b\u2162\u2185\u2c02\u2c30\u2c32\u2c60\u2c82\u2ce6"+
		"\u2d02\u2d27\u2d32\u2d67\u2d71\u2d71\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0"+
		"\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0"+
		"\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e\u3043\u3098\u309d\u30a1"+
		"\u30a3\u30fc\u30fe\u3101\u3107\u312e\u3133\u3190\u31a2\u31b9\u31f2\u3201"+
		"\u3402\u4db7\u4e02\u9fbd\ua002\ua48e\ua802\ua803\ua805\ua807\ua809\ua80c"+
		"\ua80e\ua824\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c\ufa72\ufadb\ufb02\ufb08"+
		"\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40"+
		"\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9"+
		"\ufdf2\ufdfd\ufe72\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0"+
		"\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde\u0096\2\62;\u0302\u0371"+
		"\u0485\u0488\u0593\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c7"+
		"\u05c9\u05c9\u0612\u0617\u064d\u0660\u0662\u066b\u0672\u0672\u06d8\u06de"+
		"\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u06f2\u06fb\u0713\u0713\u0732\u074c"+
		"\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f\u0953\u0956\u0964\u0965"+
		"\u0968\u0971\u0983\u0985\u09be\u09be\u09c0\u09c6\u09c9\u09ca\u09cd\u09cf"+
		"\u09d9\u09d9\u09e4\u09e5\u09e8\u09f1\u0a03\u0a05\u0a3e\u0a3e\u0a40\u0a44"+
		"\u0a49\u0a4a\u0a4d\u0a4f\u0a68\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7"+
		"\u0ac9\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8\u0af1\u0b03\u0b05\u0b3e\u0b3e"+
		"\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b68\u0b71\u0b84\u0b84"+
		"\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be8\u0bf1\u0c03\u0c05"+
		"\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c68\u0c71\u0c84\u0c85"+
		"\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce8\u0cf1"+
		"\u0d04\u0d05\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d68\u0d71"+
		"\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5"+
		"\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0e52\u0e5b\u0eb3\u0eb3\u0eb6\u0ebb"+
		"\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb\u0f1a\u0f1b\u0f22\u0f2b\u0f37\u0f37"+
		"\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92\u0f99"+
		"\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038\u103b\u1042\u104b\u1058\u105b"+
		"\u1361\u1361\u136b\u1373\u1714\u1716\u1734\u1736\u1754\u1755\u1774\u1775"+
		"\u17b8\u17d5\u17df\u17df\u17e2\u17eb\u180d\u180f\u1812\u181b\u18ab\u18ab"+
		"\u1922\u192d\u1932\u193d\u1948\u1951\u19b2\u19c2\u19ca\u19cb\u19d2\u19db"+
		"\u1a19\u1a1d\u1dc2\u1dc5\u2041\u2042\u2056\u2056\u20d2\u20de\u20e3\u20e3"+
		"\u20e7\u20ed\u302c\u3031\u309b\u309c\ua804\ua804\ua808\ua808\ua80d\ua80d"+
		"\ua825\ua829\ufb20\ufb20\ufe02\ufe11\ufe22\ufe25\ufe35\ufe36\ufe4f\ufe51"+
		"\uff12\uff1b\uff41\uff41\4\2\f\f\17\17\5\2\13\13\16\16\"\"\2\u0137\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5A\3\2\2\2\7F\3\2\2\2\tU\3\2"+
		"\2\2\13i\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2\2\2\21\u00af\3\2\2\2\23"+
		"\u00b1\3\2\2\2\25\u00b8\3\2\2\2\27\u00c2\3\2\2\2\31\u00c7\3\2\2\2\33\u00ce"+
		"\3\2\2\2\35\u00e9\3\2\2\2\37\u00eb\3\2\2\2!\u00f6\3\2\2\2#\u00f8\3\2\2"+
		"\2%\u0103\3\2\2\2\'\u0107\3\2\2\2)\u010c\3\2\2\2+\u010e\3\2\2\2-.\7k\2"+
		"\2./\7o\2\2/\60\7r\2\2\60\61\7q\2\2\61\62\7t\2\2\62\63\7v\2\2\63\4\3\2"+
		"\2\2\64B\7\62\2\2\65?\t\2\2\2\668\5#\22\2\67\66\3\2\2\2\678\3\2\2\28@"+
		"\3\2\2\29;\7a\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@"+
		"\5#\22\2?\67\3\2\2\2?:\3\2\2\2@B\3\2\2\2A\64\3\2\2\2A\65\3\2\2\2BD\3\2"+
		"\2\2CE\t\3\2\2DC\3\2\2\2DE\3\2\2\2E\6\3\2\2\2FG\7\62\2\2GH\t\4\2\2HP\t"+
		"\5\2\2IK\t\6\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3"+
		"\2\2\2OQ\t\5\2\2PL\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\t\3\2\2SR\3\2\2\2ST\3"+
		"\2\2\2T\b\3\2\2\2UY\7\62\2\2VX\7a\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ"+
		"\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\d\t\7\2\2]_\t\b\2\2^]\3\2\2\2_b\3\2\2\2"+
		"`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2ce\t\7\2\2d`\3\2\2\2de\3\2\2\2"+
		"eg\3\2\2\2fh\t\3\2\2gf\3\2\2\2gh\3\2\2\2h\n\3\2\2\2ij\7\62\2\2jk\t\t\2"+
		"\2ks\t\n\2\2ln\t\13\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2"+
		"\2\2qo\3\2\2\2rt\t\n\2\2so\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\t\3\2\2vu\3\2"+
		"\2\2vw\3\2\2\2w\f\3\2\2\2xy\5#\22\2y{\7\60\2\2z|\5#\22\2{z\3\2\2\2{|\3"+
		"\2\2\2|\u0080\3\2\2\2}~\7\60\2\2~\u0080\5#\22\2\177x\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\33\16\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\t\f\2\2\u0085\u0084\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0090\3\2\2\2\u0087\u008d\5#\22\2\u0088"+
		"\u008a\5\33\16\2\u0089\u008b\t\f\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008e\t\f\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0090\3\2\2\2\u008f\177\3\2\2\2\u008f\u0087\3\2\2"+
		"\2\u0090\16\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u009c\t\4\2\2\u0093\u0095"+
		"\5\37\20\2\u0094\u0096\7\60\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2"+
		"\2\u0096\u009d\3\2\2\2\u0097\u0099\5\37\20\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\60\2\2\u009b\u009d\5"+
		"\37\20\2\u009c\u0093\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\t\r\2\2\u009f\u00a1\t\16\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\5#\22\2\u00a3\u00a5\t\f\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\u00a9\7w\2\2\u00a9\u00b0\7g\2\2\u00aa\u00ab"+
		"\7h\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00b0\7g\2\2\u00af\u00a6\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\22\3\2\2\2"+
		"\u00b1\u00b4\7)\2\2\u00b2\u00b5\n\17\2\2\u00b3\u00b5\5\35\17\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7)\2\2\u00b7"+
		"\24\3\2\2\2\u00b8\u00bd\7$\2\2\u00b9\u00bc\n\20\2\2\u00ba\u00bc\5\35\17"+
		"\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c1\7$\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7w\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7n\2\2\u00c6\30\3\2\2\2\u00c7\u00cb\5%\23\2"+
		"\u00c8\u00ca\5\'\24\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\32\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\t\21\2\2\u00cf\u00d1\t\16\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5#\22\2\u00d3\34\3\2\2\2\u00d4"+
		"\u00d5\7^\2\2\u00d5\u00ea\t\22\2\2\u00d6\u00db\7^\2\2\u00d7\u00d9\t\23"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\t\7\2\2\u00db\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00ea\t\7\2\2\u00de\u00e0\7^\2\2\u00df\u00e1\7w\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\5!\21\2\u00e5\u00e6\5!\21\2\u00e6\u00e7\5!"+
		"\21\2\u00e7\u00e8\5!\21\2\u00e8\u00ea\3\2\2\2\u00e9\u00d4\3\2\2\2\u00e9"+
		"\u00d6\3\2\2\2\u00e9\u00de\3\2\2\2\u00ea\36\3\2\2\2\u00eb\u00f4\5!\21"+
		"\2\u00ec\u00ef\5!\21\2\u00ed\u00ef\7a\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\5!\21\2\u00f4\u00f0\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5 \3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7\"\3"+
		"\2\2\2\u00f8\u0100\t\24\2\2\u00f9\u00fb\t\25\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\t\24\2\2\u0100\u00fc\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101$\3\2\2\2\u0102\u0104\t\26\2\2\u0103\u0102\3\2\2\2"+
		"\u0104&\3\2\2\2\u0105\u0108\5%\23\2\u0106\u0108\t\27\2\2\u0107\u0105\3"+
		"\2\2\2\u0107\u0106\3\2\2\2\u0108(\3\2\2\2\u0109\u010a\7\17\2\2\u010a\u010d"+
		"\7\f\2\2\u010b\u010d\t\30\2\2\u010c\u0109\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d*\3\2\2\2\u010e\u010f\t\31\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b"+
		"\26\2\2\u0111,\3\2\2\2\60\2\67<?ADLPSY`dgosv{\177\u0082\u0085\u008a\u008d"+
		"\u008f\u0095\u0098\u009c\u00a0\u00a4\u00af\u00b4\u00bb\u00bd\u00cb\u00d0"+
		"\u00d8\u00db\u00e2\u00e9\u00ee\u00f0\u00f4\u00fc\u0100\u0103\u0107\u010c"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}