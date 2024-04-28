// Code the program that calculates the square of a number by using a function.  

import java.util.Scanner;

public class Practice1 {
    static int square(int number) {
        return (number*number);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int n = scan.nextInt();

        System.out.println(square(n));
        scan.close();
    }
}
