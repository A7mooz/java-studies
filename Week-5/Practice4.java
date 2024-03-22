import java.util.Scanner;
// Code the program to claculate the average of 10 numbers entered by the user using an array.
public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the " + (i+1) + ". number: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println((double)sum/10);
        scanner.close();
    }
}
