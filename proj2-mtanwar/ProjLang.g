grammar ProjLang;
// Lexer specification

fragment LETTER	
	:	'a'..'z' | 'A'..'Z' ;
fragment DIGIT	
	:	'0'..'9';
SEMI	:	';';


EQ	:	'=';

ASSIGNMENT
	:	':=';
	

LT	:	'<';
	
LPAR	:	'(';
RPAR	:	')';
WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };
ADDOP	:	'+'| '-' | '|';

MULOP	:	'*'|'/'|'&';
NOT	:	'!';
IF	:	'if';
THEN	:	'then';
ELSE	:	'else';
WHILE	:	'while';
FOR	:	'for';
DO	:	'do';
LET	:	'let';
FUN	:	'fun';
VAL	:	'val';
IN	:	'in';
END	:	'end';
TRUE	:	'true';
FALSE	:	'false';
LCURL	:	'{';
RCURL	:	'}';


ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;

input	returns [Expr e]:	expr {$e= $expr.e;}SEMI;

expr	returns [Expr e]:
		IF cond=expr THEN e1=expr ELSE e2=expr { $e= new IfExp($cond.e, $e1.e, $e2.e) ;}
	|	LET VAL ID EQ e1=expr IN e2=expr END { $e = new LetValExp($ID.text, $e1.e,$e2.e) ;}
	|	LET FUN fname=ID LPAR arg=ID RPAR EQ body=expr IN eIn=expr END { $e= new LetFunExp($fname.text,$arg.text, $body.e, $eIn.e) ;}
	|	WHILE cond=expr DO body=expr { $e = new WhileExp($cond.e, $body.e);}
	|	LCURL e1=expr { $e = $e1.e;} ( SEMI e2=expr { $e = new SeqExp($e,$e2.e);} )* RCURL
	|	NOT e1=expr { $e = new NotExp($e1.e);}
	|	ID ASSIGNMENT e1=expr { $e = new AssnExp($ID.text,$e1.e);}
	|	relexpr {$e= $relexpr.e;}
	;



factor	returns [Expr e]:
		NUM { $e=new IntConst(Integer.parseInt($NUM.text));}
	|	TRUE { $e=new BoolConst(Boolean.parseBoolean($TRUE.text)); }
	|	FALSE { $e=new BoolConst(Boolean.parseBoolean($FALSE.text)); }
	|	ID  { $e=new VarExp($ID.text); }
	|	ID  LPAR e1=expr  RPAR {$e = new AppExp($ID.text,$e1.e);}
	|	LPAR expr {$e= $expr.e;} RPAR
	;
	
term 	returns [Expr e]:	f1=factor {$e=$f1.e;}( MULOP f2=factor {
							if($MULOP.text.equals("*")){
							$e= new BinExp(BinOp.TIMES,$e,$f2.e);
								}
						   else if($MULOP.text.equals("/")){
							$e= new BinExp(BinOp.DIV,$e,$f2.e);
								}
						  else if($MULOP.text.equals("&")){
							$e= new BinExp(BinOp.AND,$e,$f2.e);
								};
							;})*
	;


arithexpr returns [Expr e]
	:	t1=term {$e=$t1.e;}( ADDOP t2=term {if($ADDOP.text.equals("+")){
							$e= new BinExp(BinOp.PLUS,$e,$t2.e);
								}
						   else if($ADDOP.text.equals("-")){
							$e= new BinExp(BinOp.MINUS,$e,$t2.e);
								}
						  else if($ADDOP.text.equals("|")){
							$e= new BinExp(BinOp.OR,$e,$t2.e);
								};})*
	;



relexpr	returns [Expr e]:ar1=arithexpr {$e=$ar1.e;}( (op=EQ | op=LT) ar2=arithexpr {
							if($op.text.equals("<")){
							$e=new BinExp(BinOp.LT,$e,$ar2.e);
							}
							else if($op.text.equals("=")){
							$e=new BinExp(BinOp.EQ,$e,$ar2.e);
							}
							;})? 
	;
	
