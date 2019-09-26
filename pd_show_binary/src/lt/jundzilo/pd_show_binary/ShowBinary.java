/**
 * 
 */
package lt.jundzilo.pd_show_binary;

/**
 * Program that shows binary expression of addition, subtraction, multiplication and division of decimal numbers
 * @author Inga Chamentauskiene
 *
 */
public class ShowBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		int number1 = 4;
		int number2 = 3;
		System.out.println("Binary expression of number1: " + Integer.toBinaryString(number1));
		System.out.println("Binary expression of number2: " + Integer.toBinaryString(number2));
		System.out.println("Binary expression of number1 and number2 addition: " + Integer.toBinaryString(number1+number2));
		System.out.println("Binary expression of number1 and number2 subtraction: " + Integer.toBinaryString(number1-number2));
		System.out.println("Binary expression of number1 and number2 multiplication: " + Integer.toBinaryString(number1*number2));
		System.out.println("Binary expression of number1 and number2 division: " + Integer.toBinaryString(number1/number2));

	}

}
