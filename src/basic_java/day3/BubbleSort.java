package basic_java.day3;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
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
		
		int bubbleElement;
		for (int i = size - 1; i > 0; i--) {
			bubbleElement = numbers[0];
			for (int j = 1; j <= i; j++)
				if (bubbleElement > numbers[j]) {
					numbers[j - 1] = numbers[j];
					numbers[j] = bubbleElement;
				}
				else
					bubbleElement = numbers[j];
		}
		System.out.println("\n\nSorted array: ");
		for (int k = 0; k < size; k++)
			System.out.print(numbers[k] + " ");
	}
}
