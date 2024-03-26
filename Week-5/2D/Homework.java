// Write the code of practices 1-4 by getting the length from user input.

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }

    private static void practice1() {
        System.out.println("Practice 1");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd length:");
        int length1 = scanner.nextInt(), length2=scanner.nextInt();

        int array [][] = new int[length1][length2];

        
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                array[i][j] = length2*i+j+1;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


    private static void practice2() {
        System.out.println("\nPractice 2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd length:");
        int length1 = scanner.nextInt(), length2=scanner.nextInt();

        int array [][] = new int[length1][length2];

        for (int j = 0; j < length2; j++) {
            for (int i = 0; i < length1; i++) {
                array[i][j] = length1*j+i+1;
            }
        }

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void practice3() {
        System.out.println("\nPractice 3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd length:");
        int length1 = scanner.nextInt(), length2=scanner.nextInt();

        int array [][] = new int[length1][length2];

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                array[i][j] = 2*(length2*i+j+1);
            }
        }

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++)
                System.out.print(array[i][j] + " ");
            
            System.out.println();
        }
    }

    private static void practice4() {
        System.out.println("\nPractice 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st and 2nd length:");
        int length1 = scanner.nextInt(), length2=scanner.nextInt();
        
        int array [][] = new int[length1][length2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 2*(20*i+j)+1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                System.out.print(array[i][j] + " ");
            
            System.out.println();
        }

        scanner.close();
    }
}
