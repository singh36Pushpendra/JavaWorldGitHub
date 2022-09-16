package basic_java.day2.switchcase;
import java.util.Scanner;
class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.print("Enter any alphabet symbol: ");
        char letter = scan.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vowel");
		break;
            default:
                System.out.println("Consonant!");
        }
    }
}
