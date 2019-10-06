/**
 * 
 */
package lt.jundzilo.pd_prime_numbers;

import java.util.Arrays;
import java.util.Random;

/**
 * This program creates an array of 20 random elements, shuffles them and
 * selects only prime numbers.
 * 
 * @author Inga Chamentauskiene
 *
 */
public class primeNumbers {
	private static int[] numbers = new int[20];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Empty array: ");
		printArray(numbers);
		fillArrayWithRandomNumbers(numbers);
		System.out.println("Array filled with random numbers: ");
		printArray(numbers);
		shuffleArray(numbers);
		System.out.println("Shuffled array: ");
		printArray(numbers);
		int[] primeNumbers = getPrimeNumberArray(numbers);
		getCleanArray(primeNumbers);

	}

	private static void getCleanArray(int[] primeNumbers) {
		int new_arr_length = 0;
		for (int i = 0; i < primeNumbers.length; i++) {
			if (primeNumbers[i] != 0) {
				new_arr_length++;
			}
		}

		int[] cleanNumbers = new int[new_arr_length];
		for (int i = 0, j = 0; i < primeNumbers.length; i++) {
			if (primeNumbers[i] != 0) {
				cleanNumbers[j] = primeNumbers[i];
				j++;
			}
		}
		System.out.println("Array with prime numbers and no zero's: ");
		printArray(cleanNumbers);
	}

	private static int[] getPrimeNumberArray(int[] numbers) {
		int[] primeNumbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			if (isPrimeNumber(numbers[i])) {
				primeNumbers[i] = numbers[i];
			}
		}
		System.out.println("Array with prime numbers and zero's: ");
		printArray(primeNumbers);

		int counter = 0;
		for (int number : primeNumbers) {
			if (number != 0) {
				counter++;
			}
		}
		int[] result = new int[counter];

		return primeNumbers;
	}

	private static boolean isPrimeNumber(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void shuffleArray(int[] numbers) {
		int tmp = 0, randomIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			randomIndex = (int) (Math.random() * numbers.length);
			if (i == randomIndex)
				continue;
			tmp = numbers[i];
			numbers[i] = numbers[randomIndex];
			numbers[randomIndex] = tmp;
		}

	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	private static int[] fillArrayWithRandomNumbers(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}

}
