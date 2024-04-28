// Code the program that displays if the number is prime number or not by using a void function.

import java.util.Scanner;

public class Practice6 {
    static void isPrime(int number) {
        for (int i = 2; i < number/2; i++) {
            if (number%i==0)  {
                System.out.println("Number is not prime");
                return;
            }
        }
        
        System.out.println("Number is prime");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        isPrime(scan.nextInt());

        scan.close();
    }
}
