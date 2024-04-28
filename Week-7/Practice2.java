// Code the program that calculates the factorial value of n by using a function.

import java.util.Scanner;

public class Practice2 {
    static int factorial(int number) {
        int result = 1;

        for (int i = 2; i <= number; i++)
            result*=i;

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        System.out.println(factorial(scan.nextInt()));

        scan.close();
    }
}
