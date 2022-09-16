package basic_java.day1;
import java.util.Scanner;

public class StringEqual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String string1 = scanner.next();
		System.out.println("Enter second string: ");
		String string2 = scanner.next();
		
		boolean checkEqual = string1.equals(string2);
		
		if (checkEqual)
			System.out.println("Strings are equal.");
		else
			System.out.println("Strings are not equal.");
	}

}
