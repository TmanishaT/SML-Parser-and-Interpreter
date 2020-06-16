/**
 * @author manisha
 *
 */

public class BinExp extends Expr {
	private final BinOp operator;
	private final Expr expr1;
	private final Expr expr2;

	public BinExp(BinOp operator, Expr expr1, Expr expr2) {
		super();
		this.operator = operator;
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public String toString() {
		return expr1 + " " + ExpUtility.getOperatorValue(operator) + " " + expr2;
	}

	@Override
	public Value eval(Env env) throws EvalError {
		try {
			// Used ExpUitility to evaluate binary expression to make it
			// extensible in case of more operator like >,% , ^ etc to be added in future, then no
			// need to change BinExp class. Just add more cases in Utility class and Binop enum
			return ExpUtility.evaluateBinaryExpression(env, operator, expr1, expr2);
		} catch (ClassCastException exe) {
			throw new EvalError("Evaluation error: Incompatible argument types");
		} // no need to add another catch for EvalError

	}

	public BinOp getOperator() {
		return operator;
	}

	public Expr getExpr1() {
		return expr1;
	}

	public Expr getExpr2() {
		return expr2;
	}

}
