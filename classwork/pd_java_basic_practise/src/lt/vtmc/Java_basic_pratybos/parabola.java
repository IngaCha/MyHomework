package lt.vtmc.Java_basic_pratybos;

import java.util.Scanner;

public class parabola {

	public static void main(String[] args) {
		System.out.println("Equation: ax^2+bx+c, a!=0 Enter number a: ");
		Scanner input = new Scanner(System.in);

		while (true) {
			float number1 = input.nextFloat();
			if (number1 == 0.0) {
				System.out.println("You chose 0, enter number a that is not 0:");
				continue;
			} else {
				System.out.println("Equation: " + number1 + "x^2+bx+c Enter number b: ");
				Scanner input2 = new Scanner(System.in);
				float number2 = input2.nextFloat();
				System.out.println("Equation: " + number1 + "x^2+" + number2 + "x+c Enter number c: ");
				Scanner input3 = new Scanner(System.in);
				float number3 = input2.nextFloat();
				float result1 = (float) (-number2 / (2 * number1));
				float result2 = (float) (((4 * number1 * number3) - (number2 * number2)) / (4 * number1));
				System.out.println("Vertex of parabola: " + number1 + "x^2+" + number2 + "x+" + number3 + " is: ("
						+ result1 + ", " + result2 + ")");
			}
			break;
		}

	}

}
