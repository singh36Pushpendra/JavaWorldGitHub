
package basic_java.day3;
import java.util.Random;
import java.util.Scanner;

public class PrintSmallest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scan.nextInt();
		int[] numbers = new int[size];
		
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10 + random.nextInt(90);
			System.out.print(numbers[i] + " ");
		}
		
		int min = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++)
			if (min > numbers[i + 1])
				min = numbers[i + 1];
		
		System.out.println("\nSmallest element of array = " + min);
	}
}
