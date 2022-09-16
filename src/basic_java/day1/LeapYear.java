package basic_java.day1;
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = scan.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is leap year!");
        else
            System.out.println(year + " is not leap year!");
    }
}
