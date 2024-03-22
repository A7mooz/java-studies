/* Code the program to declare a two-dimensional array (10'20) and assign
numbers to each element of the array from 1 to (10'20) without using extra
variable than i and j. (columb by columb) */

public class Practice2 {
    public static void main(String[] args) {
        int array [][] = new int[10][20];

        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 10; i++) {
                array[i][j] = 10*j+i+1;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }
}
