package basic_java.day2.forloop;
import java.util.Scanner;

class DoNaturalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter any natural number: ");
	int n = scan.nextInt();

	int sum = 0;
	for (int i = 1; i <= n; i++)
	    sum = sum + i;

	System.out.println("Sum of natural number from 1 to " + n + " = " + sum);
    }
}
