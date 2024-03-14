import java.util.Scanner;

// Code the program that finds and displays wheter a character entered by the user is a "Vowel" or a "Consonant".
public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            System.out.print("Enter a character: ");
            ch = sc.next().toLowerCase().charAt(0);
        } while (ch < 'a' || ch > 'z');

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("Vowel"); break;
            default: System.out.println("Consonant");
        }

        sc.close();
    }
}
