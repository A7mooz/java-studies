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

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else System.out.println("Consonant");

        sc.close();
    }
}
