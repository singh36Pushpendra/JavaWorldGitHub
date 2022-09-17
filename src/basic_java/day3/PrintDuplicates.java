package basic_java.day3;

import java.util.Random;
import java.util.Scanner;

public class PrintDuplicates {
	public static void main(String[] args) {
		// Printing the duplicate elements from the array.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		
		int []numbers = new int[size];
		Random random = new Random();
		System.out.println("Array elements: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 10 + random.nextInt(90);
			System.out.print(numbers[i] + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		
		boolean uniq;
		int count;
		System.out.println("\n\nDuplicate elements of array: ");
		l1 : for (int i = 0; i < size - 1; i++) {
			uniq = true;
			for (int j = 0; j < i; j++)
				if (numbers[i] == numbers[j])
				{
					uniq = false;
					continue l1;
				}
			count = 0;
			if (uniq)
				for (int k = 0; k < size; k++)
					if (numbers[i] == numbers[k])
						count++;
			
			if (count >= 2)
				System.out.print(numbers[i] + " ");
		}
	}
}
