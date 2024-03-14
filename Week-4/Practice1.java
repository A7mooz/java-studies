import java.util.Scanner;

// Code the program that displays the status of the numbers entered by the user "greater or equal to 50" or "less than 50" until the user enters zero.
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number != 0) {
            if (number >=50) System.out.println("Greater or equal to 50");
            else System.out.println("Less than 50");

            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }

        sc.close();
    }
}
