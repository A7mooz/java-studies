// Code the program that determines and display wheteher the day number entered by the user is a weekday or a weekend. (1,2,3,4,5=Weekday;6,7=Weekend)

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day number: ");
        int daynumber = sc.nextInt();


        switch (daynumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday"); break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }

        sc.close();
    }
}
