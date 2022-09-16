package basic_java.day1;
import java.util.Scanner;

class StringEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.next();
        System.out.print("Enter second string: ");
        String str2 = scan.next();

        boolean isEqual = true;
        int strLength = str1.length();
        if (strLength == str2.length()) {
            for (int i = 0; i < strLength; i++) {
                if (str1.charAt(i) == str2.charAt(i));
                else {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual)
                System.out.println("Strings are equal!");
            else
                System.out.println("Strings are not equal!");
        }
        else {
            System.out.println("Strings are not equal!");
        }
    }
}
