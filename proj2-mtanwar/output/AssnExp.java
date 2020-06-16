/**
 * @author manisha
 *
 */

public class AssnExp extends Expr {
	private final String varName;
	private final Expr valExpr;

	public AssnExp(String varName, Expr valExpr) {
		super();
		this.varName = varName;
		this.valExpr = valExpr;
	}

	/*
	 * let val x=1 in x:=2+x end;
	 * 
	 * result=> 3
	 * 
	 * 1.it will execute the letVal expression which in turn will add binding of
	 * x->1 in env 2. 'in' expr will call this class(as its an assignment), it
	 * will lookup for existing binding of x in envt. and gets its value as v1
	 * 3. evaluate the right side of exp ie 2+x as BinExp of addition ,
	 * v2=2+1->3 4. check if both the values v1 and v2 has same type and update
	 * the binding of x-> 3 (v2) in envt and return the value v2
	 */
	@Override
	public Value eval(Env env) throws EvalError {
		// check if there exist binding of the variable, if no binding throw
		// error , else update binding
		//try {
			Value rhs = valExpr.eval(env);
			Value leftExpr = env.lookup(varName);

			// both the LHS and RHS should be of same type
			if ((leftExpr instanceof BoolVal && rhs instanceof BoolVal)
					|| (leftExpr instanceof IntVal && rhs instanceof IntVal)
					|| (leftExpr instanceof FunVal && rhs instanceof FunVal)) {
				env.updateBinding(varName, rhs);
				return rhs;
			}//if none of the expression type is same throw error
			else throw new EvalError("Evaluation Error: 	Incompatible types in assignment..");

		//} catch (EvalError e) {
			//throw new EvalError("Evaluation Error: 	Incompatible types in assignment..");
			// throw new EvalError();
	//	}
	}

	@Override
	public String toString() {
		return varName + ":=" + valExpr;
	}

	public String getVarName() {
		return varName;
	}

	public Expr getValExpr() {
		return valExpr;
	}

}