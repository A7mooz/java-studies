import java.util.Scanner;

// Code the program that subtracts and displays the smaller number of the two entered numbers from the higher number.
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt(), b = sc.nextInt();

        int result;

        if (a > b) result = a-b;
        else result = b-a;

        System.out.println(result);

        sc.close();
    }
}
