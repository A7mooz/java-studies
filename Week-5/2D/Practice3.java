/*
    Code the program to declare a two-dimensional array (1020) and assign even
    numbers to each element of the array from 2 to (2*10*20) without using extra
    variable than i and j. (row by row)
 */
public class Practice3 {
    public static void main(String[] args) {
        int array[][] = new int[10][20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 2*(20*i+j+1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
