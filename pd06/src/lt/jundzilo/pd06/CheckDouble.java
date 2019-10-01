/**
 * 
 */
package lt.jundzilo.pd06;

/**
 * program that checks out Double
 * @author Inga Chamentauskiene
 *
 */
public class CheckDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkDouble();

	}
	
	private static void checkDouble() {
		double doubleMinValue = Double.MIN_VALUE;
		double doubleMaxValue = Double.MAX_VALUE;
		System.out.println("Double range from " + doubleMinValue 
				+ " to " + doubleMaxValue);
		double doubleValue = 1.7976931348623157E308d;
		System.out.println(doubleValue / 0);
		System.out.println(doubleValue % 10);
		System.out.println(0.0d / 0.0d);
		System.out.println(0.1d + 0.1d + 0.1d + 0.1d 
				+ 0.1d + 0.1d + 0.1d + 0.1d + 0.1d);
		double doubleOtherValue = 1.7976931348623157E308d;
		double doubleResult = doubleValue + doubleOtherValue;
		System.out.println(doubleResult);
	}

}
