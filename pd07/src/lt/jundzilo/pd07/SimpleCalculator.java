/**
 * 
 */
package lt.jundzilo.pd07;

/**
 * Simple calculator program
 * 
 * @author Inga Chamentauskiene
 *
 */
public class SimpleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calling methods
		arithmeticOperations("-", 20, 10);
		squareRoot(49);
		remainder(10, 3);
		powerOfTwo(20);
		powerOfAny(2, 3);
		trigonometryFunctions("sin", 20);
		percentCalc(5, 10);
	}

	private static void percentCalc(double a, double b) {
		double percent = (a / b) * 100;
		System.out.printf("Percent: %.4f", percent);

	}

	private static void trigonometryFunctions(String trig, double a) {
		if (trig == "sin") {
			double my_sin = Math.sin(a);
			System.out.printf("Sin: %.4f \n", my_sin);
		} else if (trig == "cos") {
			double my_cos = Math.cos(a);
			System.out.printf("Cos: %.4f \n", my_cos);
		} else if (trig == "tg") {
			double my_tg = Math.tan(a);
			System.out.printf("Tg: %.4f \n", my_tg);
		} else if (trig == "ctg") {
			double my_ctg = 1.0 / Math.tan(a);
			System.out.printf("Ctg: %.4f \n", my_ctg);
		}
			

	}

	private static void powerOfAny(double a, double b) {
		double pow_any = Math.pow(a, b);
		System.out.printf("Power of any: %.4f \n", pow_any);
	}

	private static void powerOfTwo(double a) {
		double pow = Math.pow(a, 2);
		System.out.printf("Power of 2: %.4f \n", pow);
	}

	private static void remainder(double a, double b) {
		double rem = a % b;
		System.out.printf("Remainder: %.4f \n", rem);
	}

	private static void squareRoot(double my_number) {
		double sqrt = Math.sqrt(my_number);
		System.out.printf("Square root: %.4f \n", sqrt);

	}

	private static void arithmeticOperations(String operator, double a, double b) {
		if (operator == "+") {
			double c = a + b;
			System.out.printf("Sum: %.4f \n", c);
		} else if (operator == "-") {
			double c = a - b;
			System.out.printf("Subtraction: %.4f \n", c);
		} else if (operator == "*") {
			double c = a * b;
			System.out.printf("Multiplication: %.4f \n", c);
		} else if (operator == "/") {
			double c = a * b;
			System.out.printf("Division: %.4f \n", c);
		}

	}

}
