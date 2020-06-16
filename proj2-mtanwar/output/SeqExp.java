
/**
 * @author manisha
 *
 */
public class SeqExp extends Expr {
	private final Expr expr1;
	private final Expr expr2;

	// eg
	/*
	 * let val x=1 in { x:=x+10; --arg1 x:=20+x --arg2 } end; ---result=> 31
	 * this will evaluate arg1 as Assignment expr, update envt, then arg2 is
	 * evaluated using updated envt and its value is returned from below eval()
	 * 
	 */

	@Override
	public Value eval(Env env) throws EvalError {
		// Evaluate both the expression but return the value of last expression
		// only
		try {
			expr1.eval(env);
			return expr2.eval(env);
		} catch (EvalError e) {
			throw new EvalError("Evaluation error");
		}
	}

	public SeqExp(Expr expr1, Expr expr2) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public String toString() {
		return "{" + expr1+ " ;" + expr2 + "}";
	}

	public Expr getArg1() {
		return expr1;
	}

	public Expr getArg2() {
		return expr2;
	}

}
