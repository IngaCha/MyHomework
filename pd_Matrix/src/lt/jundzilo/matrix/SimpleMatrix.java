package lt.jundzilo.matrix;

/**
 * Program that draws various matrixes
 * 
 * @author Inga Chamentauskiene
 *
 */

public class SimpleMatrix {

	public static void main(String[] args) {
		doSimpleMatrix();
		doLines();
		doDiagonal();
		doeverySecondRow();
		doeverySecondCol();
		doFrame();
		doDiagonals();
		doLineDiff();
	}

	private static void doLineDiff() {
		for (int i = 0; i < 9; i++) {
			System.out.println();
			for (int j = 1; j < 11; j++) {
				System.out.print(j + i + " ");

			}
		}
	}

	private static void doDiagonals() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (j == i | j == 9 - i) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

		}

	}

	private static void doFrame() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (i == 0 | j == 0 | j == 9) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

		}

	}

	private static void doeverySecondCol() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (i == 0 | j % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

		}

	}

	private static void doeverySecondRow() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

		}

	}

	private static void doDiagonal() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if (j == i) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

		}

	}

	private static void doLines() {
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print(i + " ");
			}
		}
	}

	private static void doSimpleMatrix() {
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print(0 + " ");
			}
		}
	}

}
