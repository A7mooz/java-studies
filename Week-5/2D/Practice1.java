/*
Code the program to declare a two-dimensional array (10*20) and assign
numbers to each element of the array from 1 to (10*20) without using extra
variable than i and j. (row by row) 
*/
public class Practice1 {
    public static void main(String[] args) {
        int array [][] = new int[10][20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 20*i+j+1;
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
