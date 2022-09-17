package basic_java.day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrintDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		
		int []numbers = new int[size];
		Random random = new Random();
		System.out.println("Array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10 + random.nextInt(90);
			System.out.print(numbers[i] + " ");
		}
		
		Arrays.sort(numbers);
		
		System.out.println("\n\nSorted array: ");
		for (int i = 0; i < size; i++)
			System.out.print(numbers[i] + " ");
		
		int temp = 0;
		boolean isDuplicate = false;
		for (int i = 0; i < size - 1; i++) {
			temp = numbers[i]; 
//			if (temp == numbers[i + 1])
//					
//			else
					
				
		}
	}

}
