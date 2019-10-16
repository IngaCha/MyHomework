/**
 * 
 */
package lt.jundzilo.pd10;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

/**
 * Various exercises with arrays.
 * 
 * @author Inga Chamentauskiene
 *
 */
public class WorkWithArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] my_array = new int[100]; // exercise No. 1 Random array, sorted
		fillIntArray(my_array);
		// Arrays.sort(my_array);
		BubbleSort(my_array);
		printIntArray(my_array);
		System.out.println();
		System.out.println();
		BigInteger[] fib_array = new BigInteger[121]; // exercise No. 2 Fibonacci 120th member
		fill_fib_Array(fib_array);
		printBigIntArray(fib_array);
		System.out.println();
		System.out.println();
		int[] arrayNo1 = new int[30]; // exercise No. 3 Two arrays->max elements->mean
		int[] arrayNo2 = new int[40];
		fillIntArray(arrayNo1);
		printArray(arrayNo1);
		System.out.println();
		fillIntArray(arrayNo2);
		printArray(arrayNo2);
		System.out.println();
		System.out.printf("%.2f", (float) (findMax(arrayNo1) + findMax(arrayNo2)) / 2);
		System.out.println();
		System.out.println();
		String[] names = { "Tom", "Tim", "Jen", "Fin", "John", "Eva", "Matt", "Inga", "Emma", "Ona" };// exercise No. 4
																										// String
																										// arrays->sorted
																										// by abc
		// Arrays.sort(names);
		StringBubbleSort(names);
		printStringArray(names);
		System.out.println();
		System.out.println();

	}

	private static String[] StringBubbleSort(String[] names) {
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length - 1; j++) {
				if (names[j].charAt(0) > names[j + 1].charAt(0)) {
					String tmp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = tmp;
				} else if (names[j].charAt(0) == names[j + 1].charAt(0)) {
					if (names[j].charAt(1) > names[j + 1].charAt(1)) {
						String tmp = names[j];
						names[j] = names[j + 1];
						names[j + 1] = tmp;
					}
				}
			}
		}

		return names;

	}

	private static int[] BubbleSort(int[] my_array) {
		for (int i = 0; i < my_array.length; i++) {
			for (int j = 0; j < my_array.length - 1; j++) {
				if (my_array[j] > my_array[j + 1]) {
					int tmp = my_array[j];
					my_array[j] = my_array[j + 1];
					my_array[j + 1] = tmp;
				}
			}
		}

		return my_array;

	}

	private static void printStringArray(String[] names) {
		for (String name : names) {
			System.out.print(name + " ");
		}

	}

	private static void printArray(int[] arrayNo1) {
		for (int number : arrayNo1) {
			System.out.print(number + " ");
		}

	}

	private static int[] fillIntArray(int[] arrayNo1) {
		Random random = new Random();
		for (int i = 0; i < arrayNo1.length; i++) {
			arrayNo1[i] = random.nextInt(100);
		}
		return arrayNo1;

	}

	private static int findMax(int[] arrayNo1) {
		int max = arrayNo1[0];
		for (int i = 0; i < arrayNo1.length; i++) {
			if (arrayNo1[i] > max) {
				max = arrayNo1[i];
			}
		}
		System.out.println("Max: " + max);
		return max;
	}

	private static BigInteger[] fill_fib_Array(BigInteger[] fib_array) {
		long start = System.currentTimeMillis();
		fib_array[0] = BigInteger.valueOf(0);
		fib_array[1] = BigInteger.valueOf(1);
		for (int i = 2; i < fib_array.length; i++) {
			fib_array[i] = fib_array[i - 1].add(fib_array[i - 2]);
		}
		System.out.println("Fibonacci 120th member: " + fib_array[120]);
		long stop = System.currentTimeMillis();
		System.out.println("Time for filling fib_array + finding 120th member: " + (stop - start) + " mS");
		return fib_array;

	}

	private static void printBigIntArray(BigInteger[] my_array) {
		for (BigInteger number : my_array) {
			System.out.print(number + " ");
		}
	}

	private static void printIntArray(int[] my_array) {
		for (int number : my_array) {
			System.out.print(number + " ");
		}
	}

}
