// Code the program that displays the proper integer divisors of a number by using a void function.

import java.util.Scanner;

public class Practice4 {
    static void divisors(int number) {
        System.out.print(1 + ", ");
        for (int i = 2; i <= number/2; i++)
            if (number%i==0) System.out.printf("%d, ", i);

        System.out.print(number);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        divisors(scan.nextInt());

        scan.close();
    }
}
