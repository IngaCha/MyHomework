package lt.jundzilo.pd10;

import java.util.Random;

/**
 * Quick Sort implementation on long array.
 *
 */

public class QuickSort {

	private long array[];

	public void sort(long[] inputArr) {
		this.array = inputArr;
		quickSort(0, inputArr.length - 1);// begin and end indexes
	}

	private void quickSort(int begin, int end) {

		int i = begin;
		int j = end;
		long pivot = array[begin + (end - begin) / 2]; // define pivot element

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swapNumbers(i, j);
				i++;
				j--;
			}
		}

		if (begin < j)
			quickSort(begin, j);
		if (i < end)
			quickSort(i, end);
	}

	private void swapNumbers(int i, int j) {
		long tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	private static long[] fillLongArray(long[] longArray) {
		Random random = new Random();
		for (int i = 0; i < longArray.length; i++) {
			longArray[i] = random.nextInt(100);
		}

		return longArray;
	}

	private static void printLongArray(long[] longArray) {
		for (long number : longArray) {
			System.out.print(number + " ");
		}
	}

	public static void main(String a[]) {
		QuickSort sorter = new QuickSort();
		long[] input = new long[50000]; // create new Long array
		fillLongArray(input); // fill array with random numbers
		sorter.sort(input); // sort array with QuickSort
		printLongArray(input); // print sorted array
	}

}
