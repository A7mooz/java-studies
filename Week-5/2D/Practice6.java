// As a continuation of Practice 5, use the arrays in Practice 5 to display the mutiplication table result only which the user wants.

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication result do you want to print?");

        int n1 = scanner.nextInt(), n2 = scanner.nextInt();

        int Array1[][] = new int[10][10];
        int Array2[][] = new int[10][10];
        int Array3[][] = new int[10][10];
        
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                Array1[i][j] = i+1;
                Array2[i][j] = j+1;
                Array3[i][j] = Array1[i][j] * Array2[i][j];
            }
        
        System.out.printf("%2d x%2d =%3d\n", Array1[n1-1][n2-1], Array2[n1-1][n2-1], Array3[n1-1][n2-1]);

        scanner.close();
    }
}
