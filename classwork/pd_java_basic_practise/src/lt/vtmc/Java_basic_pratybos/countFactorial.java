package lt.vtmc.Java_basic_pratybos;

public class countFactorial {

	public static void main(String[] args) {
		int n = 5;
		int result = 1;
		for (int i = n; i > 0; i--) {
			result = result * i;

		}
		System.out.println(result);

	}

}
