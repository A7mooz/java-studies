import java.util.Scanner;

// Code the program that calculates sum of two numbers entered on the keyboard by the user and displays the result as the five different forms listed below.
public class Practice2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter two numbers: ");

    int a = sc.nextInt();
    int b = sc.nextInt();

    // Within 15 spaces and zeros at the beginning
    System.out.printf("%015d\n", a + b);
    // Within 15 spaces and thousand separator
    System.out.printf("%,15d\n", a + b);
    // Within 15 spaces, thoudans separators and left-sided.
    System.out.printf("%,15d\n", a + b);
    // Within 12 spaces, a '+' sign in front of it and right-sided.
    System.out.printf("%+12d\n", a + b);
    // a '-' sign in front of it and thousand seperator
    System.out.printf("-%,d\n", a + b);

    // Close the Scanner (not required)
    sc.close();
  }
}
