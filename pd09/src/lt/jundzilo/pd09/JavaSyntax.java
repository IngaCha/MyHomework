/**
 * 
 */
package lt.jundzilo.pd09;

import java.util.Scanner;

/**
 * This program solves 10 simple math problems.
 * 
 * @author Inga Chamentauskiene
 *
 */
public class JavaSyntax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// checkRightAngledTriangle();
		// countDiscriminant();
		// guessNumber();
		// countResultFor();
		// countResultWhile();
		// countSumFor();
		// countSumWhile();
		// countSumDoWhile();
		// printABC();
		// printMultiplicationTable();

	}

	private static void printMultiplicationTable() {
		for (int i = 1; i < 101; i++) {
			for (int j = 1; j < 101; j++) {

				int result = i * j;
				System.out.format("%4d ", result);

			}
			System.out.println();
		}

	}

	private static void printABC() {
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
			System.out.print(alphabet + " ");
		}

	}

	private static void countSumDoWhile() {
		int i = 0;
		int result = 0;
		do {
			result = result + i;
			i++;

		} while (i < 101);
		System.out.println(result);
	}

	private static void countSumWhile() {
		int i = 0;
		int result = 0;
		while (i < 101) {
			result = result + i;
			i++;
		}
		System.out.println(result);

	}

	private static void countSumFor() {
		int result = 0;
		for (int i = 0; i < 101; i++) {
			result = result + i;
		}
		System.out.println(result);
	}

	private static void countResultWhile() {
		int x = 0;
		while (x < 11) {
			int y = 3 * x;
			System.out.println(y);
			x++;

		}

	}

	private static void countResultFor() {
		for (int x = 0; x < 11; x++) {
			int y = 3 * x;
			System.out.println(y);
		}

	}

	private static void guessNumber() {
		int number;
		int lucky_number = 50;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Guess a number from 0 to 100: ");
			number = input.nextInt();
			if (number < 0 || number > 100) {
				System.out.println("You are out of range! Please pick a number between 0 and 100!");
			}

			else if (number != lucky_number) {
				System.out.println("Your number is in required range, but you did not guess it.");
			}
		} while (number != lucky_number);

		System.out.println("You guessed it!");
	}

	private static void countDiscriminant() {
		double user_input1;
		double user_input2;
		double user_input3;
		System.out.println("Equation: ax^2+bx+c Enter number a:");
		Scanner input1 = new Scanner(System.in);
		user_input1 = input1.nextDouble();
		System.out.println("Equation: ax^2+bx+c Enter number b:");
		Scanner input2 = new Scanner(System.in);
		user_input2 = input2.nextDouble();
		System.out.println("Equation: ax^2+bx+c Enter number c:");
		Scanner input3 = new Scanner(System.in);
		user_input3 = input3.nextDouble();
		if (user_input2 == 0 || user_input3 == 0) {
			System.out.println("Solution to your equation does not require discriminant");
		} else {
			double discriminant = Math.pow(user_input2, 2) - 4 * user_input1 * user_input3;
			System.out.printf("Discriminant for equation: %.2f", discriminant);
		}
	}

	private static void checkRightAngledTriangle() {
		int[] user_inputs = new int[3];
		int user_input;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter triangle side nr: " + (i + 1));
			Scanner input = new Scanner(System.in);
			user_input = input.nextInt();
			while (user_input <= 0) {
				System.out.println("Please enter positive number");
				user_input = input.nextInt();
			}
			user_inputs[i] = user_input;
		}
		double a_sq = Math.pow(user_inputs[0], 2);
		double b_sq = Math.pow(user_inputs[1], 2);
		double c_sq = Math.pow(user_inputs[2], 2);
		if ((a_sq + b_sq == c_sq) || (a_sq + c_sq == b_sq) || (b_sq + c_sq == a_sq)) {
			System.out.println("Triangle is right angled");
		} else {
			System.out.println("Triangle is not right angled");
		}

	}

}
