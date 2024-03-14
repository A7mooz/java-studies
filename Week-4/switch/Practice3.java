import java.util.Scanner;

// Code the program that displays the status of a number "EVEN" or "ODD"
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch (number % 2) {
            case 0: System.out.println("Even"); break;
            default: System.out.println("Odd");
        }

        sc.close();
    }
}
