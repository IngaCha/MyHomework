package lt.vtmc.Java_basic_pratybos;

import java.util.Scanner;

public class Male_Female_Names {

	public static void main(String[] args) {
		System.out.println("Enter any lithuanian name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		String a = "a";
		String s = "s";
		String e = "ė";
		if (String.valueOf(name.charAt(name.length() - 1)).equals(s)) {
			System.out.println(name + " is a man");
		} else if (String.valueOf(name.charAt(name.length() - 1)).equals(a)
				|| String.valueOf(name.charAt(name.length() - 1)).equals(e)) {
			System.out.println(name + " is a woman");
		}
	}

}
