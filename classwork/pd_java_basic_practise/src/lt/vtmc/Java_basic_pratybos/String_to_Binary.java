package lt.vtmc.Java_basic_pratybos;

public class String_to_Binary {

	public static void main(String[] args) {
		String s = "String changer";
		byte[] bytes = s.getBytes();
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			System.out.println(b);
			int val = b;
			for (int i = 0; i < 8; i++) {
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		System.out.println("'" + s + "' to binary: " + binary);

	}

}

//Take 'C' (67), which is
//01000011
//so the first time you '&' it with 128, which is (as you already worked out)
//10000000
//you get
//00000000
//which equals 0, so you add '0' to the string.
//
//Then you shift left, giving you (effectively)
//10000110
//and you '&' that with 128, which gives you
//10000000
//which is NOT 0, so you add '1' to the string.
//
//Then you shift left again, giving you (again effectively)
//00001100
//and you '&' that with 128, which gives you
//00000000
//which equals 0, so you add '0' to the string.
//.... 