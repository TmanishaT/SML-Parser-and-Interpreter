
/**
 * @author manisha
 *
 */
public class LetFunExp extends Expr {
	private final String fName;
	private final String argName;
	private final Expr fBody;
	private final Expr inClause;

	public LetFunExp(String fName, String argName, Expr fBody, Expr inClause) {
		super();
		this.fName = fName;
		this.argName = argName;
		this.fBody = fBody;
		this.inClause = inClause;
	}

	@Override
	public Value eval(Env env) throws EvalError {
		// it create the binding of function definition with : fname-> <params,
		// body, current-envt>

		// create dummy binding like fname->0 or false,so that the envt of
		// funval has something to refer to for self-loop in case of recursive functions
		Value emptyVal = new BoolVal(false);
		// Now add dummy binding to the envt, to create a new envt
		Env newEnv = env.addBinding(fName, emptyVal);

		// Now update the binding of fname with value <params, body, new-envt>
		// in new-envt
		FunVal newBinding = new FunVal(argName, fBody, newEnv);
		Env newEnv2=newEnv.updateBinding(fName, newBinding);

		// System.out.println("new binding created for: "+fName+"->
		// "+newBinding);
		// evaluate the in clause of let and return the value, do not need to
		// evaluate the function argument expression or function body
		return inClause.eval(newEnv2);

	}

	@Override
	public String toString() {
		return "let fun " + fName + "(" + argName + ")={ " + fBody + " } in " + inClause + " end";
	}

	public String getfName() {
		return fName;
	}

	public String getArgName() {
		return argName;
	}

	public Expr getfBody() {
		return fBody;
	}

	public Expr getInClause() {
		return inClause;
	}

}
