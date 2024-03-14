import java.util.Scanner;

// Code the program that displays the numbers of the clothing size codes. (S=Small, M=Medium, L=Large, X=XLarge)
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter clothing size code: ");
        char CSC = sc.next().charAt(0);

        switch (CSC) {
            case 'S': System.out.println("Small"); break;
            case 'M': System.out.println("Medium"); break;
            case 'L': System.out.println("Large"); break;
            case 'X': System.out.println("XLarge");
        }

        sc.close();
    }
}
