package lt.vtmc.Java_basic_pratybos;

import java.util.Scanner;

public class calculate_square {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int result = 0;
		for (int i = 1; i < number + 1; i++) {
			result = result + number;
		}
		System.out.println("Square of " + number + " is: " + result);
	}

}
