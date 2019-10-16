package lt.vtmc.Java_basic_pratybos;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		System.out.println("Enter square side: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Square perimeter is: " + 4 * number);
		System.out.println("Square area is: " + number * number);

	}

}
