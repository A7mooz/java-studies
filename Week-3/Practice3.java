import java.util.Scanner;

// Factorial of the number provided by the user (using a while loop)
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1, n = sc.nextInt();

        int i = 1;
        
        while (i<=n)
            fact *= i++;
        
        System.out.println(fact);
        
        sc.close();
    }
}
