/**
 * 
 */
package lt.jundzilo.pd06;

/**
 * Program that shows basic Java syntax
 * @author Inga Chamentauskiene
 *
 */
public class SyntaxBasics {
	//instance variable. We can use this when we create object.
	private String objectDescription;
	
	//static class variable (both private-accessible only in this class and public-accessible in other classes)
	private static String SayHello="Hi!";
	public static byte a = 12, b = 127;
	public static byte multipl = (byte)(a*b);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//local method variables
		short num1 = 1, num2 = 2, num3 = 3;
		short suma = (short)(num1 + num2 + num3);
		
		boolean b1 = true, b2 = false;
		boolean lazyand = b1 && b2;
		boolean xor = b1^b2;
		boolean order_check = b1 | !b2 & b2 ;
		
		int i1 = -6, i2 = -10;
		int result = i1++ + ++i2;
		
		long my_long_num = 1233333334555555555L;
		
		double infinity = -10.0/0.0;
		//not defined double, could be 0.0, -infinity, +infinity
		double nan = 0.0 / 0.0;
		
		boolean notEqualsItself = nan != nan;
		
		float f1 = (float) 10.00, f2 = (float) 20.00;
		float rem = f2%f1;
		
		char nl = '\n';
		
		int arithmeticShiftRight = 35 >> 3;
		
		System.out.println("Example of byte cast: " + multipl);
		System.out.println("My Short sum: " + suma);
		System.out.println("'Lazy' AND example: " + lazyand);
		System.out.println("XOR example: " + xor);
		System.out.println("My order check: " + order_check);
		System.out.println("Increment example: 0 " + result);
		System.out.println("My long number: " + my_long_num);
		System.out.println("My negative infinity: " + infinity);
		System.out.println("Not a number!: " + nan);
		System.out.println("Not defined number is not equal to not defined number: " + notEqualsItself);
		System.out.println("My example of float reminder: " + rem);
		System.out.println("Print" + nl + "Newline");
		System.out.println(SayHello + " " + -1*infinity);
		System.out.println("Shift example: " + arithmeticShiftRight);
	}

}
