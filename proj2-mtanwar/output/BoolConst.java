/**
 * @author manisha
 *
 */


public class BoolConst extends Expr
{
    private final boolean value;
    
    public BoolConst(boolean value) {
		super();
		this.value = value;
	}

	@Override
    public Value eval( Env e) throws EvalError {
        return new BoolVal(value);
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }

	public boolean getValue() {
		return value;
	}
    
  
    
}
