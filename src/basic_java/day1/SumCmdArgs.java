package basic_java.day1;

public class SumCmdArgs {

	public static void main(String[] args) {
		int sum = 0, num, count = 0;
		for (int i = 0; i < args.length; i++)
		{
			System.out.println("args[" + i + "] = " + args[i]);
			try {
				// converting String to int type.
				num = Integer.parseInt(args[i]);
				sum += num;
			}
			catch (NumberFormatException nfe) {
//				System.out.println(nfe.getMessage());
				count++;
			}
		}
		System.out.println("Sum of command line arguments = " + sum);
		System.out.println("Number of invalid integers entered = " + count);
	}
}
