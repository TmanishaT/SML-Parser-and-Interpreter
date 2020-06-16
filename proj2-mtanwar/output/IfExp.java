
/**
 * @author manisha
 *
 */
public class IfExp extends Expr {
	private final Expr cond;
	private final Expr ifExpr;
	private final Expr elseExpr;

	public IfExp(Expr cond, Expr ifExpr, Expr elseExpr) {
		super();
		this.cond = cond;
		this.ifExpr = ifExpr;
		this.elseExpr = elseExpr;
	}
	/*
	 * if( 3 > 2) then 100 else 200; here only 3 will be parsed as condition
	 * which will give not a boolean condition, because '>' will not be parsed
	 * by antlr and give error
	 */

	@Override
	public Value eval(Env env) throws EvalError {
		try {

			Value condition = cond.eval(env);// the condition value
												// type should be
												// boolean otherwise
												// class cast
												// exception
			if (!(condition instanceof BoolVal))
				throw new EvalError("Evaluation error: condition not boolean");
			if (((BoolVal) condition).value) {
				return ifExpr.eval(env);
			}
			return elseExpr.eval(env);
		} catch (ClassCastException exe) {
			throw new EvalError("Evaluation error: condition not boolean");
		}
	}

	@Override
	public String toString() {
		return "if (" + cond + ") then " + ifExpr + " else " + elseExpr;
	}

	public Expr getCond() {
		return cond;
	}

	public Expr getIfExpr() {
		return ifExpr;
	}

	public Expr getElseExpr() {
		return elseExpr;
	}

}
