
/**
 * @author manisha
 *
 */
public class LetValExp extends Expr {
	private final String varName;
	private final Expr varExpr;
	private final Expr inBody;

	public LetValExp(String varName, Expr varExpr, Expr inBody) {
		super();
		this.varName = varName;
		this.varExpr = varExpr;
		this.inBody = inBody;
	}

	@Override
	public Value eval(Env env) throws EvalError {
		/*
		 * 1.evaluate the varExpr to get value 2.add binding of var -> value in
		 * the current envt to get a new envt 3. Evaluate the 'in' expr using
		 * updated envt
		 */
		//try {
			Value val = varExpr.eval(env);
			Env updatedEnv = env.addBinding(varName, val);
			return inBody.eval(updatedEnv);
		//} catch (EvalError exe) {
		//	throw new EvalError("Evaluation error");
	//	}

	}

	@Override
	public String toString() {
		return "let val " + varName + "=" + varExpr + " in " + inBody + " end";
	}

	public String getVarName() {
		return varName;
	}

	public Expr getVarExpr() {
		return varExpr;
	}

	public Expr getInBody() {
		return inBody;
	}

}
