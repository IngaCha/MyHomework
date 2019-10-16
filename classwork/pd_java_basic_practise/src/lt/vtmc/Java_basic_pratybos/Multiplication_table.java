package lt.vtmc.Java_basic_pratybos;

public class Multiplication_table {

	public static void main(String[] args) {
		printMultiplicationTable();

	}

	private static void printMultiplicationTable() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {

				int result = i * j;
				System.out.format("%4d ", result);

			}
			System.out.println();
		}

	}

}
