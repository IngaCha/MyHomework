package lt.vtmc.Java_basic_pratybos;

public class char_programming {

	public static void main(String[] args) {
		char[] hello = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' };
		String strng = new String(hello);
		System.out.println(strng.toUpperCase());
		System.out.println(Character.toUpperCase(strng.charAt(0)) + strng.substring(1));
		System.out.println(strng);

		for (int i = hello.length - 1; i >= 0; i--) {
			System.out.print(hello[i]);
		}

	}

}
