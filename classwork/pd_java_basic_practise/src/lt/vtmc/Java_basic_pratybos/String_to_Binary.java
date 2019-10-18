package lt.vtmc.Java_basic_pratybos;

public class String_to_Binary {

	public static void main(String[] args) {
		String my_string = "String changer";
		byte[] bytes = my_string.getBytes(); // gets bytes of every character in string
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			System.out.println(b);
			int val = b; // change type to int
			for (int i = 0; i < 8; i++) { // binary numbers of 8 characters length. 1Byte = 8bits
				binary.append((val & 128) == 0 ? 0 : 1); // Checks if the first bit is 0. If true 0 is appended, if
															// false 1 is appended.
															// (S)01010011 & (128)10000000 = 00000000. Append 0.
				val <<= 1; // shift value to left by 1. Checking next bit value
			}
			binary.append(' ');
		}
		System.out.println("'" + my_string + "' to binary: " + binary);

	}

}
