package basic_java.day2.operators;
import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter any month value(1-12)");
	int month = scan.nextInt();
	System.out.println("Enter any day value(1-30)");
	int day = scan.nextInt();


	if (month >= 3 && month <= 6)
	    if (day >= 1 && day <= 30)
		if (month > 3 && month < 6)
		    System.out.println(true);
	        else
		    if (month == 3 && day > 20)
			System.out.println(true);
	            else if (month == 6 && day < 20)
			System.out.println(true);
	            else
			System.out.println(false);
	    else
		System.out.println("Please enter the correct day value!");
	else
	    System.out.println("Please enter the month value within March to June only!");
    }
}
