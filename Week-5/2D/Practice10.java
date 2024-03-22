// The user will enter the size (N) of the matrix on the keyboard. Code the
// program that generates a two dimensional array (NxN) and ﬁlls the array with
// numbers from 1 to N2 in spiral order. Two examples are given below.

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the matrix: ");
        int length = input.nextInt(), numbers=1, i, j, tour;
        int[][] spiral = new int[length][length];
        
        for (tour=0; tour <= length / 2; tour++) {
            for(j=tour, i = tour; j < length-tour; j++)
                spiral[i][j] = numbers++;
            
            for (j--, i++; i < length-tour;i++)
                spiral[i][j] = numbers++;
            
            for (i--, j--; j >= tour; j--)
                spiral[i][j] = numbers++;
            
            for (j++, i--; i > tour; i--)
                spiral[i][j] = numbers++;
        }

        for (i = 0; i < spiral.length; i++) {
            for (j = 0; j < spiral.length; j++)
                System.out.printf("%d\t", spiral[i][j]);
            System.out.println();
        }
    }
}
