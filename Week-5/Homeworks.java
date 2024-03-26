// Write the code of practices 1-4 by getting the length from user input.
import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }

    private static void practice1() {
        System.out.println("Practice 1");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");

        int length = scanner.nextInt();

        int array[] = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = i+1;
            System.out.printf("%d ", array[i]);
        }
    }

    private static void practice2() {
        System.out.println("\nPractice 2");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");

        int length = scanner.nextInt();

        int array[] = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = 2*(i+1);
            System.out.printf("%-4d", array[i]);
        }
    }

    private static void practice3() {
        System.out.println("\nPractice 3");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        
        int array[] = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = 2*i+1;
            System.out.printf("%-4d", array[i]);
        }
    }

    private static void practice4() {
        System.out.println("\nPractice 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];

        int sum = 0;

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i+1) + ". number: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println((double)sum/10);
        scanner.close();
    }
}
