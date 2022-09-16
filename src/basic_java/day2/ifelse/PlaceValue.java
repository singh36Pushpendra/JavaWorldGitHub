package basic_java.day2.ifelse;
import java.util.Scanner;

class PlaceValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter either 1 | 10 | 100 | 1000 only!");
	int value = scanner.nextInt();

	if (value == 1)
	    System.out.println("unit");
	else if (value == 10)
	    System.out.println("ten");
	else if (value == 100)
	    System.out.println("hundred");
	else if (value == 1000)
	    System.out.println("thousand");
	else
	    System.out.println("Please enter correct value!");
    }
}
