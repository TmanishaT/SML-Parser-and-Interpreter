// $ANTLR null D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g 2020-04-13 19:30:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "ASSIGNMENT", "DIGIT", 
		"DO", "ELSE", "END", "EQ", "FALSE", "FOR", "FUN", "ID", "IF", "IN", "LCURL", 
		"LET", "LETTER", "LPAR", "LT", "MULOP", "NOT", "NUM", "RCURL", "RPAR", 
		"SEMI", "THEN", "TRUE", "VAL", "WHILE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g"; }



	// $ANTLR start "input"
	// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:46:1: input returns [Expr e] : expr SEMI ;
	public final Expr input() throws RecognitionException {
		Expr e = null;


		Expr expr1 =null;

		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:46:23: ( expr SEMI )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:46:25: expr SEMI
			{
			pushFollow(FOLLOW_expr_in_input287);
			expr1=expr();
			state._fsp--;

			e = expr1;
			match(input,SEMI,FOLLOW_SEMI_in_input290); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:48:1: expr returns [Expr e] : ( IF cond= expr THEN e1= expr ELSE e2= expr | LET VAL ID EQ e1= expr IN e2= expr END | LET FUN fname= ID LPAR arg= ID RPAR EQ body= expr IN eIn= expr END | WHILE cond= expr DO body= expr | LCURL e1= expr ( SEMI e2= expr )* RCURL | NOT e1= expr | ID ASSIGNMENT e1= expr | relexpr );
	public final Expr expr() throws RecognitionException {
		Expr e = null;


		Token fname=null;
		Token arg=null;
		Token ID2=null;
		Token ID3=null;
		Expr cond =null;
		Expr e1 =null;
		Expr e2 =null;
		Expr body =null;
		Expr eIn =null;
		Expr relexpr4 =null;

		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:48:22: ( IF cond= expr THEN e1= expr ELSE e2= expr | LET VAL ID EQ e1= expr IN e2= expr END | LET FUN fname= ID LPAR arg= ID RPAR EQ body= expr IN eIn= expr END | WHILE cond= expr DO body= expr | LCURL e1= expr ( SEMI e2= expr )* RCURL | NOT e1= expr | ID ASSIGNMENT e1= expr | relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LCURL:
				{
				alt2=5;
				}
				break;
			case NOT:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSIGNMENT) ) {
					alt2=7;
				}
				else if ( (LA2_6==ADDOP||(LA2_6 >= DO && LA2_6 <= EQ)||LA2_6==IN||(LA2_6 >= LPAR && LA2_6 <= MULOP)||(LA2_6 >= RCURL && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LPAR:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:49:3: IF cond= expr THEN e1= expr ELSE e2= expr
					{
					match(input,IF,FOLLOW_IF_in_expr303); 
					pushFollow(FOLLOW_expr_in_expr307);
					cond=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr309); 
					pushFollow(FOLLOW_expr_in_expr313);
					e1=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr315); 
					pushFollow(FOLLOW_expr_in_expr319);
					e2=expr();
					state._fsp--;

					 e = new IfExp(cond, e1, e2) ;
					}
					break;
				case 2 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:50:4: LET VAL ID EQ e1= expr IN e2= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr326); 
					match(input,VAL,FOLLOW_VAL_in_expr328); 
					ID2=(Token)match(input,ID,FOLLOW_ID_in_expr330); 
					match(input,EQ,FOLLOW_EQ_in_expr332); 
					pushFollow(FOLLOW_expr_in_expr336);
					e1=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr338); 
					pushFollow(FOLLOW_expr_in_expr342);
					e2=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr344); 
					 e = new LetValExp((ID2!=null?ID2.getText():null), e1,e2) ;
					}
					break;
				case 3 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:51:4: LET FUN fname= ID LPAR arg= ID RPAR EQ body= expr IN eIn= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr351); 
					match(input,FUN,FOLLOW_FUN_in_expr353); 
					fname=(Token)match(input,ID,FOLLOW_ID_in_expr357); 
					match(input,LPAR,FOLLOW_LPAR_in_expr359); 
					arg=(Token)match(input,ID,FOLLOW_ID_in_expr363); 
					match(input,RPAR,FOLLOW_RPAR_in_expr365); 
					match(input,EQ,FOLLOW_EQ_in_expr367); 
					pushFollow(FOLLOW_expr_in_expr371);
					body=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr373); 
					pushFollow(FOLLOW_expr_in_expr377);
					eIn=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr379); 
					 e = new LetFunExp((fname!=null?fname.getText():null),(arg!=null?arg.getText():null), body, eIn) ;
					}
					break;
				case 4 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:52:4: WHILE cond= expr DO body= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr386); 
					pushFollow(FOLLOW_expr_in_expr390);
					cond=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr392); 
					pushFollow(FOLLOW_expr_in_expr396);
					body=expr();
					state._fsp--;

					 e = new WhileExp(cond, body);
					}
					break;
				case 5 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:53:4: LCURL e1= expr ( SEMI e2= expr )* RCURL
					{
					match(input,LCURL,FOLLOW_LCURL_in_expr403); 
					pushFollow(FOLLOW_expr_in_expr407);
					e1=expr();
					state._fsp--;

					 e = e1;
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:53:33: ( SEMI e2= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:53:35: SEMI e2= expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr413); 
							pushFollow(FOLLOW_expr_in_expr417);
							e2=expr();
							state._fsp--;

							 e = new SeqExp(e,e2);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURL,FOLLOW_RCURL_in_expr424); 
					}
					break;
				case 6 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:54:4: NOT e1= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr429); 
					pushFollow(FOLLOW_expr_in_expr433);
					e1=expr();
					state._fsp--;

					 e = new NotExp(e1);
					}
					break;
				case 7 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:55:4: ID ASSIGNMENT e1= expr
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_expr440); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_expr442); 
					pushFollow(FOLLOW_expr_in_expr446);
					e1=expr();
					state._fsp--;

					 e = new AssnExp((ID3!=null?ID3.getText():null),e1);
					}
					break;
				case 8 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:56:4: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr453);
					relexpr4=relexpr();
					state._fsp--;

					e = relexpr4;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "factor"
	// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:61:1: factor returns [Expr e] : ( NUM | TRUE | FALSE | ID | ID LPAR e1= expr RPAR | LPAR expr RPAR );
	public final Expr factor() throws RecognitionException {
		Expr e = null;


		Token NUM5=null;
		Token TRUE6=null;
		Token FALSE7=null;
		Token ID8=null;
		Token ID9=null;
		Expr e1 =null;
		Expr expr10 =null;

		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:61:24: ( NUM | TRUE | FALSE | ID | ID LPAR e1= expr RPAR | LPAR expr RPAR )
			int alt3=6;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt3=1;
				}
				break;
			case TRUE:
				{
				alt3=2;
				}
				break;
			case FALSE:
				{
				alt3=3;
				}
				break;
			case ID:
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4==LPAR) ) {
					alt3=5;
				}
				else if ( (LA3_4==ADDOP||(LA3_4 >= DO && LA3_4 <= EQ)||LA3_4==IN||(LA3_4 >= LT && LA3_4 <= MULOP)||(LA3_4 >= RCURL && LA3_4 <= THEN)) ) {
					alt3=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAR:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:62:3: NUM
					{
					NUM5=(Token)match(input,NUM,FOLLOW_NUM_in_factor472); 
					 e =new IntConst(Integer.parseInt((NUM5!=null?NUM5.getText():null)));
					}
					break;
				case 2 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:63:4: TRUE
					{
					TRUE6=(Token)match(input,TRUE,FOLLOW_TRUE_in_factor479); 
					 e =new BoolConst(Boolean.parseBoolean((TRUE6!=null?TRUE6.getText():null))); 
					}
					break;
				case 3 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:64:4: FALSE
					{
					FALSE7=(Token)match(input,FALSE,FOLLOW_FALSE_in_factor486); 
					 e =new BoolConst(Boolean.parseBoolean((FALSE7!=null?FALSE7.getText():null))); 
					}
					break;
				case 4 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:65:4: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_factor493); 
					 e =new VarExp((ID8!=null?ID8.getText():null)); 
					}
					break;
				case 5 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:66:4: ID LPAR e1= expr RPAR
					{
					ID9=(Token)match(input,ID,FOLLOW_ID_in_factor501); 
					match(input,LPAR,FOLLOW_LPAR_in_factor504); 
					pushFollow(FOLLOW_expr_in_factor508);
					e1=expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_factor511); 
					e = new AppExp((ID9!=null?ID9.getText():null),e1);
					}
					break;
				case 6 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:67:4: LPAR expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor518); 
					pushFollow(FOLLOW_expr_in_factor520);
					expr10=expr();
					state._fsp--;

					e = expr10;
					match(input,RPAR,FOLLOW_RPAR_in_factor524); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "factor"



	// $ANTLR start "term"
	// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:70:1: term returns [Expr e] : f1= factor ( MULOP f2= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr e = null;


		Token MULOP11=null;
		Expr f1 =null;
		Expr f2 =null;

		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:70:23: (f1= factor ( MULOP f2= factor )* )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:70:25: f1= factor ( MULOP f2= factor )*
			{
			pushFollow(FOLLOW_factor_in_term541);
			f1=factor();
			state._fsp--;

			e =f1;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:70:46: ( MULOP f2= factor )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==MULOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:70:48: MULOP f2= factor
					{
					MULOP11=(Token)match(input,MULOP,FOLLOW_MULOP_in_term546); 
					pushFollow(FOLLOW_factor_in_term550);
					f2=factor();
					state._fsp--;


												if((MULOP11!=null?MULOP11.getText():null).equals("*")){
												e = new BinExp(BinOp.TIMES,e,f2);
													}
											   else if((MULOP11!=null?MULOP11.getText():null).equals("/")){
												e = new BinExp(BinOp.DIV,e,f2);
													}
											  else if((MULOP11!=null?MULOP11.getText():null).equals("&")){
												e = new BinExp(BinOp.AND,e,f2);
													};
												;
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "term"



	// $ANTLR start "arithexpr"
	// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:84:1: arithexpr returns [Expr e] : t1= term ( ADDOP t2= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr e = null;


		Token ADDOP12=null;
		Expr t1 =null;
		Expr t2 =null;

		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:85:2: (t1= term ( ADDOP t2= term )* )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:85:4: t1= term ( ADDOP t2= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr572);
			t1=term();
			state._fsp--;

			e =t1;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:85:23: ( ADDOP t2= term )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ADDOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:85:25: ADDOP t2= term
					{
					ADDOP12=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr577); 
					pushFollow(FOLLOW_term_in_arithexpr581);
					t2=term();
					state._fsp--;

					if((ADDOP12!=null?ADDOP12.getText():null).equals("+")){
												e = new BinExp(BinOp.PLUS,e,t2);
													}
											   else if((ADDOP12!=null?ADDOP12.getText():null).equals("-")){
												e = new BinExp(BinOp.MINUS,e,t2);
													}
											  else if((ADDOP12!=null?ADDOP12.getText():null).equals("|")){
												e = new BinExp(BinOp.OR,e,t2);
													};
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "relexpr"
	// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:1: relexpr returns [Expr e] : ar1= arithexpr ( (op= EQ |op= LT ) ar2= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr e = null;


		Token op=null;
		Expr ar1 =null;
		Expr ar2 =null;

		try {
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:25: (ar1= arithexpr ( (op= EQ |op= LT ) ar2= arithexpr )? )
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:26: ar1= arithexpr ( (op= EQ |op= LT ) ar2= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr601);
			ar1=arithexpr();
			state._fsp--;

			e =ar1;
			// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:52: ( (op= EQ |op= LT ) ar2= arithexpr )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==EQ||LA7_0==LT) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:54: (op= EQ |op= LT ) ar2= arithexpr
					{
					// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:54: (op= EQ |op= LT )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==EQ) ) {
						alt6=1;
					}
					else if ( (LA6_0==LT) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:55: op= EQ
							{
							op=(Token)match(input,EQ,FOLLOW_EQ_in_relexpr609); 
							}
							break;
						case 2 :
							// D:\\PL Work\\ANTLR\\ANTLRExamples1\\proj2-mtanwar\\ProjLang.g:98:63: op= LT
							{
							op=(Token)match(input,LT,FOLLOW_LT_in_relexpr615); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr620);
					ar2=arithexpr();
					state._fsp--;


												if((op!=null?op.getText():null).equals("<")){
												e =new BinExp(BinOp.LT,e,ar2);
												}
												else if((op!=null?op.getText():null).equals("=")){
												e =new BinExp(BinOp.EQ,e,ar2);
												}
												;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "relexpr"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input287 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SEMI_in_input290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr303 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr307 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_THEN_in_expr309 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr313 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_expr315 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr326 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_VAL_in_expr328 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr330 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_expr332 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr336 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr338 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr342 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr351 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FUN_in_expr353 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr357 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAR_in_expr359 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr363 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAR_in_expr365 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_expr367 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr371 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr373 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr386 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr390 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_expr392 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURL_in_expr403 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr407 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_SEMI_in_expr413 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr417 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_RCURL_in_expr424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr429 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr440 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_expr442 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_expr446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_factor472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor501 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAR_in_factor504 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_factor508 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAR_in_factor511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_factor518 = new BitSet(new long[]{0x00000000A196C800L});
	public static final BitSet FOLLOW_expr_in_factor520 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RPAR_in_factor524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term541 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_MULOP_in_term546 = new BitSet(new long[]{0x0000000021104800L});
	public static final BitSet FOLLOW_factor_in_term550 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_term_in_arithexpr572 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr577 = new BitSet(new long[]{0x0000000021104800L});
	public static final BitSet FOLLOW_term_in_arithexpr581 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr601 = new BitSet(new long[]{0x0000000000200402L});
	public static final BitSet FOLLOW_EQ_in_relexpr609 = new BitSet(new long[]{0x0000000021104800L});
	public static final BitSet FOLLOW_LT_in_relexpr615 = new BitSet(new long[]{0x0000000021104800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr620 = new BitSet(new long[]{0x0000000000000002L});
}
