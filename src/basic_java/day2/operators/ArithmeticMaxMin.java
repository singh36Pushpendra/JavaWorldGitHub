package basic_java.day2.operators;
import java.util.Scanner;

public class ArithmeticMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter b value: ");
		int b = scanner.nextInt();
		
		System.out.println("Enter c value: ");
		int c = scanner.nextInt();
		
		float num1 = a + b * c;
		float num2 = c + a / b;
		float num3 = a % b + c;
		float num4 = a * b + c;
		
		System.out.println("a + b * c = " + num1);
		System.out.println("c + a / b = " + num2);
		System.out.println("a % b + c = " + num3);
		System.out.println("a * b + c = " + num4 + "\n");
		
		System.out.print("Maximum number is = ");
		if (num1 > num2 && num1 > num3 && num1 > num4)
			System.out.println(num1);
		else if (num2 > num3 && num2 > num4)
			System.out.println(num2);
		else if (num3 > num4)
			System.out.println(num3);
		else
			System.out.println(num4);
		
		System.out.print("Minimum number is = ");
		if (num1 < num2 && num1 < num3 && num1 < num4)
			System.out.println(num1);
		else if (num2 < num3 && num2 < num4)
			System.out.println(num2);
		else if (num3 < num4)
			System.out.println(num3);
		else
			System.out.println(num4);

	}

}
