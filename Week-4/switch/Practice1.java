import java.util.Scanner;

// Code the program that determines and display the name of the weekday according to the number entered by the user. (1=Monday...7=Sunday) 
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daynumber;
        
        do {
            System.out.println("Enter a number: ");
            daynumber = sc.nextInt();
        } while (daynumber < 1 || daynumber > 7);

        switch (daynumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Sunday");
        }
        
        sc.close();
    }    
}
