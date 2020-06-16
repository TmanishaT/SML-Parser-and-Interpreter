/**
 * @author manisha
 *
 */


public class BoolVal extends Value
{
    public  final boolean value;
    
  
    
    public BoolVal(boolean value) {
		super();
		this.value = value;
	}



	@Override
    public String toString() {
        return String.valueOf(value);
    }

}
