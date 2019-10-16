package lt.vtmc.Java_basic_pratybos;

public class StringChar {

	public static void main(String[] args) {
		String str = "A\240b3&4\040";
		System.out.println("Chars: " + str);
		System.out.println("Char: " + "\t\t\t" + str.charAt(0) + "\t" + str.charAt(1) + "\t" + str.charAt(2) + "\t"
				+ str.charAt(3) + "\t" + str.charAt(4) + "\t" + str.charAt(5) + "\t" + str.charAt(6));
		System.out.println("Char Code: " + "\t\t" + (int) str.charAt(0) + "\t" + (int) str.charAt(1) + "\t"
				+ (int) str.charAt(2) + "\t" + (int) str.charAt(3) + "\t" + (int) str.charAt(4) + "\t"
				+ (int) str.charAt(5) + "\t" + (int) str.charAt(6));
		System.out.println("isDigit(): " + "\t\t" + Character.isDigit(str.charAt(0)) + "\t"
				+ Character.isDigit(str.charAt(1)) + "\t" + Character.isDigit(str.charAt(2)) + "\t"
				+ Character.isDigit(str.charAt(3)) + "\t" + Character.isDigit(str.charAt(4)) + "\t"
				+ Character.isDigit(str.charAt(5)) + "\t" + Character.isDigit(str.charAt(6)));
		System.out.println("isLetter(): " + "\t\t" + Character.isLetter(str.charAt(0)) + "\t"
				+ Character.isLetter(str.charAt(1)) + "\t" + Character.isLetter(str.charAt(2)) + "\t"
				+ Character.isLetter(str.charAt(3)) + "\t" + Character.isLetter(str.charAt(4)) + "\t"
				+ Character.isLetter(str.charAt(5)) + "\t" + Character.isLetter(str.charAt(6)));
		System.out.println("isLetterOrDigit(): " + "\t" + Character.isLetterOrDigit(str.charAt(0)) + "\t"
				+ Character.isLetterOrDigit(str.charAt(1)) + "\t" + Character.isLetterOrDigit(str.charAt(2)) + "\t"
				+ Character.isLetterOrDigit(str.charAt(3)) + "\t" + Character.isLetterOrDigit(str.charAt(4)) + "\t"
				+ Character.isLetterOrDigit(str.charAt(5)) + "\t" + Character.isLetterOrDigit(str.charAt(6)));
		System.out.println("isLowerCase(): " + "\t\t" + Character.isLowerCase(str.charAt(0)) + "\t"
				+ Character.isLowerCase(str.charAt(1)) + "\t" + Character.isLowerCase(str.charAt(2)) + "\t"
				+ Character.isLowerCase(str.charAt(3)) + "\t" + Character.isLowerCase(str.charAt(4)) + "\t"
				+ Character.isLowerCase(str.charAt(5)) + "\t" + Character.isLowerCase(str.charAt(6)));
		System.out.println("isSpaceChar(): " + "\t\t" + Character.isSpaceChar(str.charAt(0)) + "\t"
				+ Character.isSpaceChar(str.charAt(1)) + "\t" + Character.isSpaceChar(str.charAt(2)) + "\t"
				+ Character.isSpaceChar(str.charAt(3)) + "\t" + Character.isSpaceChar(str.charAt(4)) + "\t"
				+ Character.isSpaceChar(str.charAt(5)) + "\t" + Character.isSpaceChar(str.charAt(6)));
		System.out.println("isUpperCase(): " + "\t\t" + Character.isUpperCase(str.charAt(0)) + "\t"
				+ Character.isUpperCase(str.charAt(1)) + "\t" + Character.isUpperCase(str.charAt(2)) + "\t"
				+ Character.isUpperCase(str.charAt(3)) + "\t" + Character.isUpperCase(str.charAt(4)) + "\t"
				+ Character.isUpperCase(str.charAt(5)) + "\t" + Character.isUpperCase(str.charAt(6)));
		System.out.println("isWhitespace(): " + "\t" + Character.isWhitespace(str.charAt(0)) + "\t"
				+ Character.isWhitespace(str.charAt(1)) + "\t" + Character.isWhitespace(str.charAt(2)) + "\t"
				+ Character.isWhitespace(str.charAt(3)) + "\t" + Character.isWhitespace(str.charAt(4)) + "\t"
				+ Character.isWhitespace(str.charAt(5)) + "\t" + Character.isWhitespace(str.charAt(6)));

	}

}
