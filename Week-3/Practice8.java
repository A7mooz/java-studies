import java.util.Scanner;

// Convert base-10 number provided by the user to base-2 in real order (using while loops)
public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number in base-10: ");
        
        int n = sc.nextInt(), temp = n * 2, counter = 0;

        while ((temp /= 2) > 0) counter++;

        while (counter > 0) {
            int i = counter--;
            temp = n;
            
            while (i-- > 1)
                temp /= 2;

            System.out.print(temp % 2);
        }

        sc.close();
    }
}