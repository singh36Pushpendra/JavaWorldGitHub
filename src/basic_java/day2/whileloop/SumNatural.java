package basic_java.day2.whileloop;
import java.util.Scanner;

class SumNatural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.print("Enter any natural number = ");
	int natural = scan.nextInt();

	int count = 0;
	int sum = 0;
	while (count != natural)
	{
	    count++;
	    sum += count;
	}
	System.out.println("Sum of first " + natural + " natural number = " + sum);
    }
}
