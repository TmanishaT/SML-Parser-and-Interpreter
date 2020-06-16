
/**
 * @author manisha
 *
 */
public class WhileExp extends Expr {
	private final Expr condition;
	private final Expr body;

	public WhileExp(Expr condition, Expr body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	@Override
	public Value eval(Env env) throws EvalError {
		try {
			// Evaluate the condition expression till it doesn't give false
			// value.
			// Raise exception if the value return by evaluating condition is
			// not a boolval type
			while (((BoolVal) condition.eval(env)).value) {
				body.eval(env);
			}
			// While loop will always return false value as per Proj language
			return new BoolVal(false);
		} catch (EvalError exe) {
			throw new EvalError("Evaluation error: condition not boolean");
		}
	}

	@Override
	public String toString() {
		return "while (" + condition + ") do {" + body + "}";
	}

	public Expr getCond() {
		return condition;
	}

	public Expr getBody() {
		return body;
	}

}
