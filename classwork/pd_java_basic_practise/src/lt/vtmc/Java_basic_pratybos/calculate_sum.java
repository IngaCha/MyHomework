package lt.vtmc.Java_basic_pratybos;

import java.util.Scanner;

public class calculate_sum {

	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		System.out.println("Enter second number: ");
		Scanner input2 = new Scanner(System.in);
		int number2 = input2.nextInt();
		for (int i = 1; i < number2 + 1; i++) {
			number1++;

		}
		System.out.println("Sum is: " + number1);
	}

}
