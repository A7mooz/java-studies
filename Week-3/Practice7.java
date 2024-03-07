import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number in base-10: ");
        int n = sc.nextInt(), i = n;

        while (i > 0) {
            System.out.print(i % 2);
            i /=2;
        }

        sc.close();
    }
}
