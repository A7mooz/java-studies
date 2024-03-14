import java.util.Scanner;

// Code the program that displays the status of the numbers entered by the user "positive", "negative" or "zero" until the user wants to stop the program.
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        String stop;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number > 0) System.out.println("Positive.");
            else if (number < 0) System.out.println("Negative");
            else System.out.println("Zero");

            System.out.print("Do you want to stop (Yes/No)? ");
            stop = sc.next();
        } while ("no".equals(stop.toLowerCase()));


        sc.close();
    }
}
