package lt.vtmc.Java_basic_pratybos;

public class Fibonacci {

	public static void main(String[] args) {
		printFibonacci();

	}

	private static void printFibonacci() {
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < 100; i++) {
			n3 = n1 + n2;
			if (n3 > 1000) {
				break;
			}
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
