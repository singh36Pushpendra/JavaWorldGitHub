package basic_java.day1;

import java.util.Scanner;

public class GetUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = scan.nextLine();
		System.out.println("Your name is: " + name);
	}

}
