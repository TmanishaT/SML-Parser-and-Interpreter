
/**
 * @author manisha
 *
 */
public class FunVal extends Value {
	// It represent a state of environment where the function params, body and
	// current envt gets bundled together
	// and added the binding of fxn name as fname=<fparam,fBody,env>
	private final String fParams;
	private final Expr fBody;
	private final Env env;

	public FunVal(String fParams, Expr fBody, Env env) {
		super();
		this.fParams = fParams;
		this.fBody = fBody;
		this.env = env;
	}

	@Override
	public String toString() {
		return "function binding with params,body < (" + fParams + ")," + fBody + " > ";
	}

	public String getfParams() {
		return fParams;
	}

	public Expr getfBody() {
		return fBody;
	}

	public Env getEnv() {
		return env;
	}

}
