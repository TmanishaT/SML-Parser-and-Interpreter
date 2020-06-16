
/**
 * @author manisha
 *
 */
public class VarExp extends Expr {
	private final String variable;

	public VarExp(String str) {
		super();
		this.variable = str;
	}

	@Override
	public Value eval(Env env) throws EvalError {
		// Incase of just string like abc; -> lookup for abc in envt and give
		// unbound error
		try {
			return env.lookup(variable);
		} catch (EvalError exe) {
			throw new UnboundVar("No binding exist for variable: "+variable);
		}
	}

	@Override
	public String toString() {
		return variable;
	}

	public String getStr() {
		return variable;
	}

}
