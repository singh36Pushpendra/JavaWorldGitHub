package basic_java.day3;
import java.util.Random;
import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = scanner.nextInt();
		
		int[] integers = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			integers[i] = random.nextInt(10);
			System.out.print(integers[i] + " ");
		}
		
		System.out.println();
		
		int count;
		boolean uniq;
		for (int i = 0; i < integers.length; i++) {
			
			uniq = true;
			for (int j = i - 1; j >= 0; j--)
				if (integers[j] == integers[i]) {
					uniq = false;
					break;
				}
			
			count = 1;
			if (uniq) {
				for (int k = i + 1; k < integers.length; k++)
					if (integers[i] == integers[k])
						count++;
				System.out.println(integers[i] + " present " + count + " times in array.");
			}
			
		}
	}
}
