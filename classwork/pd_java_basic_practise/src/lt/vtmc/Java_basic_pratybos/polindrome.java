package lt.vtmc.Java_basic_pratybos;

public class polindrome {

	public static void main(String[] args) {
		String s = "madam";
		System.out.println(s);
		StringBuilder make_reverse = new StringBuilder();
		make_reverse.append(s);
		make_reverse = make_reverse.reverse();
		System.out.print(make_reverse);
		System.out.println();
		if (s.contentEquals(make_reverse)) {
			System.out.println("It's a polindrome!");
		} else {
			System.out.println("It's not a polindrome.");
		}

	}

}
