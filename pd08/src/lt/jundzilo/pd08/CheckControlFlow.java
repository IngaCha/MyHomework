/**
 * 
 */
package lt.jundzilo.pd08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This Java program shows: 1. If-then, if-then-else and switch statements; 2.
 * For, While, Do-While statements; 3. Break, Continue, Return statements; 4.
 * Labeled return, labeled continue statements; 5. Return statement that returns
 * something; 6. Several separate methods; 7. How user input is read and data
 * type determined; 8. Switch statement;
 * 
 * @author Inga Chamentauskiene
 *
 */
public class CheckControlFlow {

	public static void main(String[] args) {
		int[] numbers = checkFor();
		System.out.println("My Array from 1 to 100: " + Arrays.toString(numbers));
		checkForEach();
		checkWhile();
		checkDoWhile();
		checkIfThen(10, 10);
		checkIfThenElse();
		checkSwitch();
		checkLabeledBreak();
		int result = checkReturn(12, 14);
		System.out.println(result);
		checkLabeledContinue();

	}

	// Labeled Continue
	private static void checkLabeledContinue() {
		int i, j;
		For1: for (i = 1; i <= 100; i++) {
			System.out.println();
			For2: for (j = 1; j <= 100; j++) {
				System.out.print(j + " ");
				if (j == 5)
					continue For1;
			}
		}
	}

	// Simple Return
	private static int checkReturn(int i, int j) {
		return i * j;

	}

	// Labeled Break
	private static void checkLabeledBreak() {
		int i, j;
		For1: for (i = 1; i <= 100; i++) {
			System.out.println();
			For2: for (j = 1; j <= 100; j++) {
				System.out.print(j + " ");
				if (j == 7) {
					break For1;
				}
			}
		}

	}

	// While + continue
	private static void checkWhile() {
		int my_number;
		my_number = 0;
		while (my_number <= 100) {
			if (my_number == 30 | my_number == 70) {
				my_number = my_number + 10;
				continue;
			}
			System.out.println(my_number);
			my_number = my_number + 10;

		}

	}

	// Do-While
	private static void checkDoWhile() {
		int number;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Guess a number from 1 to 10: ");
			number = input.nextInt();
			if (number != 6) {
				System.out.println("Sorry! Pick another number!");
			}
		} while (number != 6);

		System.out.println("You guest it! It was 6!");
	}

	// For Each
	private static void checkForEach() {
		int[] salaries = { 1000, 2000, 1500, 1600, 4000 };
		for (int num : salaries) {
			int salaries_plus_bonus = num + 100;
			System.out.println(salaries_plus_bonus);
		}

	}

	// Switch + break
	private static void checkSwitch() {
		int day = 5;
		String weekString;

		switch (day) {
		case 1:
		case 2:
			weekString = "It's beginning of a new work week!";
			break;
		case 3:
			weekString = "You're in a middle of a work week!";
			break;
		case 4:
		case 5:
			weekString = "You're at the end of a work week! Almost weekend!";
			break;
		case 6:
		case 7:
			weekString = "Time to celebrate! It's weekend!";
			break;
		default:
			weekString = "Something's wrong. Try enter a number from 1 to 7.";
			break;
		}
		System.out.println(weekString);

	}

	// If-Then
	private static void checkIfThen(int i, int j) {
		if (i == j) {
			System.out.println("Numbers are equal.");
		}

	}

	// If-Then-Else + user input + data type
	private static void checkIfThenElse() {
		int user_input;
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		user_input = input.nextInt();
		if (user_input % 2 == 0) {
			System.out.println("You chose: " + user_input + " It's an even number.");
		} else {
			System.out.println("You chose: " + user_input + " It's an odd number.");
		}

	}

	// Simple For Example + return
	private static int[] checkFor() {
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i] = i + 1;
		}
		return numbers;
	}
}
