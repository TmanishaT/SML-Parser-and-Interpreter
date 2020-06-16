
/**
 * @author manisha
 *
 */
public class ExpUtility {

	public static Value evaluateBinaryExpression(Env env, BinOp operator, Expr expr1, Expr expr2) throws EvalError {

		switch (operator) {
		case TIMES: {
			IntVal v1 = (IntVal) expr1.eval(env);
			IntVal v2 = (IntVal) expr2.eval(env);

			return new IntVal(v1.value * v2.value);
		}
		case DIV: {
			IntVal num = (IntVal) expr1.eval(env);
			IntVal deno = (IntVal) expr2.eval(env);
			if (deno.value == 0) {
				throw new EvalError("Arithmetic Evaluation error: division by zero");
			}
			return new IntVal(num.value / deno.value);
		}
		case PLUS: {
			IntVal v1 = (IntVal) expr1.eval(env);
			IntVal v2 = (IntVal) expr2.eval(env);

			return new IntVal(v1.value + v2.value);
		}
		case MINUS: {
			IntVal v1 = (IntVal) expr1.eval(env);
			IntVal v2 = (IntVal) expr2.eval(env);

			return new IntVal(v1.value - v2.value);
		}
		case AND: {
			// if 1st argument is true then only check 2nd argument,
			// otherwise return false
			BoolVal v1 = (BoolVal) expr1.eval(env);
			if (v1.value) {
				BoolVal v2 = (BoolVal) expr2.eval(env);
				return new BoolVal(v2.value);
			}
			return new BoolVal(false);
		}
		case OR: {
			// if 1st argument is true then no need to check 2nd argument,
			// if 1st argument is false then only check 2nd argument and return
			// it
			BoolVal v1 = (BoolVal) expr1.eval(env);
			if (v1.value) {
				return new BoolVal(v1.value);
			}
			BoolVal v2 = (BoolVal) expr2.eval(env);
			return new BoolVal(v2.value);
		}
		case EQ: {
			Value op1 = expr1.eval(env);
			Value op2 = expr2.eval(env);
			// arg1 and arg2 can be of int or bool but both should be of
			// same type
			// use == for comparison instead of .equals() because we are
			// comparing primitive int and boolean
			if (op1 instanceof IntVal && op2 instanceof IntVal) {
				if (((IntVal) op1).value == ((IntVal) op2).value)
					return new BoolVal(true);
				return new BoolVal(false);
			}
			if (op1 instanceof BoolVal && op2 instanceof BoolVal) {
				if (((BoolVal) op1).value == ((BoolVal) op2).value)
					return new BoolVal(true);
				return new BoolVal(false);
			}
			// throw new EvalError("Evaluation error: Incompatible arg
			// types");
		}
		case LT: {
			IntVal op1 = (IntVal) expr1.eval(env);
			IntVal op2 = (IntVal) expr2.eval(env);
			return new BoolVal(op1.value < op2.value);
		}
		default: {
			throw new EvalError("Evaluation error: Operation not supported");
		}
		}

	}

	public static String getOperatorValue(BinOp operator) {
		if (operator != null) {
			switch (operator) {
			case TIMES:
				return "+";
			case PLUS:
				return "+";
			case MINUS:
				return "-";
			case DIV:
				return "/";
			case EQ:
				return "=";
			case LT:
				return "<";
			case AND:
				return "&";
			case OR:
				return "|";
			default:
				return "Operation not supported...";
			}
		}
		return null;

	}

}
