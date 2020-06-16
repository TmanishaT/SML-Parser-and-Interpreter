// $ANTLR null D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g 2020-04-13 19:30:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int ASSIGNMENT=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int END=9;
	public static final int EQ=10;
	public static final int FALSE=11;
	public static final int FOR=12;
	public static final int FUN=13;
	public static final int ID=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int LCURL=17;
	public static final int LET=18;
	public static final int LETTER=19;
	public static final int LPAR=20;
	public static final int LT=21;
	public static final int MULOP=22;
	public static final int NOT=23;
	public static final int NUM=24;
	public static final int RCURL=25;
	public static final int RPAR=26;
	public static final int SEMI=27;
	public static final int THEN=28;
	public static final int TRUE=29;
	public static final int VAL=30;
	public static final int WHILE=31;
	public static final int WS=32;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:5:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:7:2: ( '0' .. '9' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:8:6: ( ';' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:8:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:11:4: ( '=' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:11:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "ASSIGNMENT"
	public final void mASSIGNMENT() throws RecognitionException {
		try {
			int _type = ASSIGNMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:14:2: ( ':=' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:14:4: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNMENT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:17:4: ( '<' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:17:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:19:6: ( '(' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:19:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:20:6: ( ')' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:20:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:21:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:21:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:21:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:22:7: ( '+' | '-' | '|' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:24:7: ( '*' | '/' | '&' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:25:5: ( '!' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:25:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:26:4: ( 'if' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:26:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:27:6: ( 'then' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:27:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:28:6: ( 'else' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:28:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:29:7: ( 'while' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:29:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:30:5: ( 'for' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:30:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:31:4: ( 'do' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:31:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:32:5: ( 'let' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:32:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:33:5: ( 'fun' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:33:7: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:34:5: ( 'val' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:34:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:35:4: ( 'in' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:35:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:36:5: ( 'end' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:36:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:37:6: ( 'true' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:37:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:38:7: ( 'false' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:38:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "LCURL"
	public final void mLCURL() throws RecognitionException {
		try {
			int _type = LCURL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:39:7: ( '{' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:39:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURL"

	// $ANTLR start "RCURL"
	public final void mRCURL() throws RecognitionException {
		try {
			int _type = RCURL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:40:7: ( '}' )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:40:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURL"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:43:4: ( LETTER ( LETTER | DIGIT )* )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:43:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:43:13: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:44:5: ( ( DIGIT )+ )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:44:7: ( DIGIT )+
			{
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:44:7: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:8: ( SEMI | EQ | ASSIGNMENT | LT | LPAR | RPAR | WS | ADDOP | MULOP | NOT | IF | THEN | ELSE | WHILE | FOR | DO | LET | FUN | VAL | IN | END | TRUE | FALSE | LCURL | RCURL | ID | NUM )
		int alt4=27;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:10: SEMI
				{
				mSEMI(); 

				}
				break;
			case 2 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:15: EQ
				{
				mEQ(); 

				}
				break;
			case 3 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:18: ASSIGNMENT
				{
				mASSIGNMENT(); 

				}
				break;
			case 4 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:29: LT
				{
				mLT(); 

				}
				break;
			case 5 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:32: LPAR
				{
				mLPAR(); 

				}
				break;
			case 6 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:37: RPAR
				{
				mRPAR(); 

				}
				break;
			case 7 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:42: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:45: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 9 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:51: MULOP
				{
				mMULOP(); 

				}
				break;
			case 10 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:57: NOT
				{
				mNOT(); 

				}
				break;
			case 11 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:61: IF
				{
				mIF(); 

				}
				break;
			case 12 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:64: THEN
				{
				mTHEN(); 

				}
				break;
			case 13 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:69: ELSE
				{
				mELSE(); 

				}
				break;
			case 14 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:74: WHILE
				{
				mWHILE(); 

				}
				break;
			case 15 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:80: FOR
				{
				mFOR(); 

				}
				break;
			case 16 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:84: DO
				{
				mDO(); 

				}
				break;
			case 17 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:87: LET
				{
				mLET(); 

				}
				break;
			case 18 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:91: FUN
				{
				mFUN(); 

				}
				break;
			case 19 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:95: VAL
				{
				mVAL(); 

				}
				break;
			case 20 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:99: IN
				{
				mIN(); 

				}
				break;
			case 21 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:102: END
				{
				mEND(); 

				}
				break;
			case 22 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:106: TRUE
				{
				mTRUE(); 

				}
				break;
			case 23 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:111: FALSE
				{
				mFALSE(); 

				}
				break;
			case 24 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:117: LCURL
				{
				mLCURL(); 

				}
				break;
			case 25 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:123: RCURL
				{
				mRCURL(); 

				}
				break;
			case 26 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:129: ID
				{
				mID(); 

				}
				break;
			case 27 :
				// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:1:132: NUM
				{
				mNUM(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\13\uffff\10\25\4\uffff\1\44\1\45\10\25\1\56\2\25\2\uffff\3\25\1\64\1"+
		"\25\1\66\1\67\1\25\1\uffff\1\71\1\72\1\73\1\74\1\75\1\uffff\1\25\2\uffff"+
		"\1\25\5\uffff\1\100\1\101\2\uffff";
	static final String DFA4_eofS =
		"\102\uffff";
	static final String DFA4_minS =
		"\1\11\12\uffff\1\146\1\150\1\154\1\150\1\141\1\157\1\145\1\141\4\uffff"+
		"\2\60\1\145\1\165\1\163\1\144\1\151\1\162\1\156\1\154\1\60\1\164\1\154"+
		"\2\uffff\1\156\2\145\1\60\1\154\2\60\1\163\1\uffff\5\60\1\uffff\1\145"+
		"\2\uffff\1\145\5\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\12\uffff\1\156\1\162\1\156\1\150\1\165\1\157\1\145\1\141\4\uffff"+
		"\2\172\1\145\1\165\1\163\1\144\1\151\1\162\1\156\1\154\1\172\1\164\1\154"+
		"\2\uffff\1\156\2\145\1\172\1\154\2\172\1\163\1\uffff\5\172\1\uffff\1\145"+
		"\2\uffff\1\145\5\uffff\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\10\uffff\1\30\1\31"+
		"\1\32\1\33\15\uffff\1\13\1\24\10\uffff\1\20\5\uffff\1\25\1\uffff\1\17"+
		"\1\22\1\uffff\1\21\1\23\1\14\1\26\1\15\2\uffff\1\16\1\27";
	static final String DFA4_specialS =
		"\102\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\7\2\uffff\1\7\22\uffff\1\7\1\12\4\uffff\1\11\1\uffff\1\5\1\6\1\11"+
			"\1\10\1\uffff\1\10\1\uffff\1\11\12\26\1\3\1\1\1\4\1\2\3\uffff\32\25\6"+
			"\uffff\3\25\1\20\1\15\1\17\2\25\1\13\2\25\1\21\7\25\1\14\1\25\1\22\1"+
			"\16\3\25\1\23\1\10\1\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\27\7\uffff\1\30",
			"\1\31\11\uffff\1\32",
			"\1\33\1\uffff\1\34",
			"\1\35",
			"\1\40\15\uffff\1\36\5\uffff\1\37",
			"\1\41",
			"\1\42",
			"\1\43",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\57",
			"\1\60",
			"",
			"",
			"\1\61",
			"\1\62",
			"\1\63",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\65",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\70",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"\1\76",
			"",
			"",
			"\1\77",
			"",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SEMI | EQ | ASSIGNMENT | LT | LPAR | RPAR | WS | ADDOP | MULOP | NOT | IF | THEN | ELSE | WHILE | FOR | DO | LET | FUN | VAL | IN | END | TRUE | FALSE | LCURL | RCURL | ID | NUM );";
		}
	}

}
