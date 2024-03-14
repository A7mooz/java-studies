// Code the program that displays the numbers of the clothing size codes. (S=Small, M=Medium, L=Large, X1=XLarge, X2=XXLarge, X3=XXXLarge, X4=XXXXLarge)

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        System.out.print("Enter clothing size code: ");
        String CSC = sc.next();

        switch (CSC) {
            case "S": System.out.println("Small"); break;
            case "M": System.out.println("Medium"); break;
            case "L": System.out.println("Large"); break;
            case "X1": System.out.println("XLarge"); break;
            case "X2": System.out.println("XXLarge"); break;
            case "X3": System.out.println("XXXLarge"); break;
            case "X4": System.out.println("XXXXLarge"); break;
        }

        sc.close();
    }
}
