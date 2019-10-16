package lt.vtmc.Java_basic_pratybos;

public class Byte_to_String {

	public static void main(String[] args) {
		byte[] my_array = { 84, 104, 101, 32, 98, 101, 115, 116, 32, 112, 97, 115, 115, 119, 111, 114, 100, 32, 109, 97,
				110, 97, 103, 101, 114, 115, 32, 102, 111, 114, 32, 50, 48, 49, 57 };
		String s = new String(my_array);
		System.out.println(s);

	}

}
