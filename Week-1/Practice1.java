import java.util.Scanner;

// Code the program that calculates the squares of the double numbers entered on the keyboatf and displays them as the seven different forms listed below.
public class Practice1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input a double: ");

    double newnum = sc.nextFloat();

    // Only with two digits after the dot
    System.out.printf("%.2f\n", newnum * newnum);

    // Only with two digits after the dot and "+" sign in front of it
    System.out.printf("%+.2f\n", newnum * newnum);

    // Within 10 spaces and left-sided.
    System.out.printf("%10.2f\n", newnum * newnum);

    // Within 15 spaces, three digits after the dot and left-sided
    System.out.printf("%-15.3f\n", newnum * newnum);

    // Within 20 spaces, three digits after the dot and right-sided
    System.out.printf("%20.3f\n", newnum * newnum);

    // With thousand separator and four digits after the dot
    System.out.printf("%,.4f\n", newnum * newnum);

    // Within 15 spaces, zeros at the beginning and three digits after the dot.
    System.out.printf("%015.3f\n", newnum * newnum);

    // Close the Scanner (not required)
    sc.close();
  }
}
