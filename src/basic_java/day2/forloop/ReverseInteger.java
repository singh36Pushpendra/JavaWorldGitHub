package basic_java.day2.forloop;
import java.util.Scanner;

class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter any number: ");
	int n = scan.nextInt();

	int count = 0, num = n, digit, rev = 0;
	while (n != 0) {
            n = n / 10;
	    count++;
	}

	for (int i = 1; i <= count; i++) {
            digit = num % 10;
	    num = num / 10;
	    rev = rev * 10 + digit;
	}
	System.out.println("Reverse of number = " + rev);
    }
}
