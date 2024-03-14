import java.util.Scanner;

// Code the program that displays the status of a number "EVEN" or "ODD"
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
        
        sc.close();
    }
}
