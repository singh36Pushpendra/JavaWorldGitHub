package basic_java.day2.ifelse;
import java.util.Scanner;

class DigitInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter any single digit number: ");
	int singleDigit = scanner.nextInt();
	if (singleDigit == 0)
	    System.out.println("Zero");
	else if (singleDigit == 1)
	    System.out.println("One");
	else if (singleDigit == 2)
	    System.out.println("Two");
	else if (singleDigit == 3)
	    System.out.println("Three");
	else if (singleDigit == 4)
	    System.out.println("Four");
	else if (singleDigit == 5)
	    System.out.println("Five");
	else if (singleDigit == 6)
	    System.out.println("Six");
	else if (singleDigit == 7)
	    System.out.println("Seven");
	else if (singleDigit == 8)
	    System.out.println("Eight");
	else if (singleDigit == 9)
	    System.out.println("Nine");
	else
	    System.out.println("Invalid Input!");
    }
}
