package lt.vtmc.Java_basic_pratybos;

public class xor {

	public static void main(String[] args) {
		boolean a;
		boolean b;

		System.out.println("a" + "\t" + "b" + "\t" + "a^c");

		a = false;
		b = false;
		boolean c = a ^ b;
		System.out.println(a + "\t" + b + "\t" + c);

		a = false;
		b = true;
		boolean d = a ^ b;
		System.out.println(a + "\t" + b + "\t" + d);

		a = true;
		b = false;
		boolean e = a ^ b;
		System.out.println(a + "\t" + b + "\t" + e);

		a = true;
		b = true;
		boolean f = a ^ b;
		System.out.println(a + "\t" + b + "\t" + f);

	}

}
