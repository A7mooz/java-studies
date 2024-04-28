// Code a function to create your own integer scanner.

import java.util.Scanner;

public class Practice5 {
    static int read() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int x = read();
        System.out.println(x);
    }
}
