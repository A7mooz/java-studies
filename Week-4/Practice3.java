import java.util.Scanner;

// Code the program that determines and display the name of the weekday according to the number entered by the user. (1=Monday...7=Sunday) 
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        do {
            System.out.print("Enter a number: ");
            day = sc.nextInt();
        } while (day < 1 || day > 7);
        
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");

        sc.close();
    }
}
