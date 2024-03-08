import java.util.Scanner;

// Sum of all natural numbers until the number user has input (using a while loop)
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), sum = 0;

        int i = 1;

        while (i <= n) sum += i++;

        System.out.println(sum);

        sc.close();
    }
}
