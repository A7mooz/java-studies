import java.util.Scanner;

// Code the program that subtracts and displays the smaller number of the two entered numbers from the higher number.
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letters;

        do {
            System.out.print("Enter the grade letters: ");
            letters = sc.next().toUpperCase();
        } while (letters.charAt(0) < 'A' || letters.charAt(0) > 'F' || letters.charAt(0) == 'E' || letters.charAt(1) < 'A' || letters.charAt(1) > 'F' || letters.charAt(1) == 'E');

        switch (letters) {
            case "AA": System.out.println(4); break;
            case "AB": System.out.println(3.5); break;
            case "BB": System.out.println(3); break;
            case "CB": System.out.println(2.5); break;
            case "CC": System.out.println(2); break;
            case "DC": System.out.println(1.5); break;
            case "DD": System.out.println(1); break;
            case "FD": System.out.println(0.5); break;
            case "FF": System.out.println(0); break;
        }

        sc.close();
    }
}
