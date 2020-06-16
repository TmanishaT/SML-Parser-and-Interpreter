/**
 * @author manisha
 *
 */

public class AppExp extends Expr {
	private final String fName;
	private final Expr argExpr;

	public AppExp(String fName, Expr argExpr) {
		super();
		this.fName = fName;
		this.argExpr = argExpr;
	}

	/*
	 * let fun foo(x)= x+1 in foo(5) end ;
	 * 
	 * result=> 6
	 * 
	 * This class deals with invocation foo(5) 1. Lookup for the fun foo()
	 * binding in the envt, and get it in v. 2. v should be FunVal obj, evaluate
	 * the parameter exp = value 3. Add the binding of evaluated value of params
	 * in envt to update the envt 4. evaluate the function body with the updated
	 * envt
	 */
	@Override
	public Value eval(Env env) throws EvalError {
		// get the binding associated with fxn name -> <arguments,
		// body,curr-env>
		try {
			FunVal funDef = (FunVal)env.lookup(fName);
			// if not binding found then lookup will generate error
			// the binding of function definition must exist, to call/use that
			// function and it must be of type FunVal
			
				// Evaluate the param expr passed in the function
				Value argVal = argExpr.eval(env);
				Env definitionEnvOfFun = funDef.getEnv();

				// Add the binding of the evaluated param expr to the envt
				// obtained from the function definition
				// to create a new envt
				Env newEnv = definitionEnvOfFun.addBinding(funDef.getfParams(), argVal);

				// System.out.println("new envt obtained from : "+fName+"->
				// "+newEnv);

				// Body of function will only be evaluated using the new
				// environment ,
				// because we want to evaluate the body with the environment,
				// having the binding of fun arguments and along with function
				// definition
				return funDef.getfBody().eval(newEnv);
			// Throw error if, the binding of function is not of FunVal Type
			
		} catch (EvalError e) {
			throw new EvalError("Funtion with name: " + fName + " not found");
		}
	}

	@Override
	public String toString() {
		return fName+ "(" + argExpr + ") ";
	}

	public String getfName() {
		return fName;
	}

	public Expr getArgExpr() {
		return argExpr;
	}

}
