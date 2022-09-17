package basic_java.day2.operators;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = scanner.nextInt();
		System.out.println("Enter b value: ");
		int b = scanner.nextInt();
		System.out.println("Enter c value: ");
		int c = scanner.nextInt();
		
		System.out.print("Quadratic Equation: ");
		System.out.print(a + "*x*x + (" + b + ")*x + (" + c + ")");
		
		int delta = b * b - 4 * a * c;
		
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("\n\nRoots of quadratic equation: " + root1 + ", " + root2);
	}
}
