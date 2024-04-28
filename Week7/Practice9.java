// Code the recursive function to find base-2 system equivalent of a number in base-10 system.

import java.util.Scanner;

public class Practice9 {
    static long toBase2(int base10) {
        if (base10<=1) return base10;
        
        return base10%2 + toBase2(base10/2)*10;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println(toBase2(number));
        scan.close();
    }
}
