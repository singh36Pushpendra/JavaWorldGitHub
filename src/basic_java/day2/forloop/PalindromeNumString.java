
package basic_java.day2.forloop;
import java.util.Scanner;

public class PalindromeNumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scan.nextInt();

		if(isPalindrome(num))
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");
	}

	static boolean isPalindrome(int number) {
		int num = number;
		String numInString = "" + number;
//		System.out.println(numInString);
//		System.out.println(numInString.length());
		int digit, rev = 0;
		for (int i = 1; i <= numInString.length(); i++) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return number == rev;
	}
}
