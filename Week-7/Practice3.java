// Code the program that calculates the factorial value of n by using a recursive function.

import java.util.Scanner;

public class Practice3 {
    static int factorial(int number) {
        if (number<=1) return number;
        return number*factorial(number-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        System.out.println(factorial(scan.nextInt()));

        scan.close();
    }
}
