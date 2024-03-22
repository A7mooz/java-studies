/*
    Code the program that creates a two-dimensional boolean array according to
    the values of the elements of a two-dimensional integer array. If the number in
    the integer array is even. "true" is assigned to the related element of the
    boolean array, otherwise "false" is assigned to the related element of the
    boolean array.
*/
public class Practice7 {
    public static void main(String[] args) {
        int array[][] = {/* ... */};
        boolean bool[][] = new boolean[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) 
            for (int j = 0; j < array[0].length; j++)
                bool[i][j] = ((array[i][j] % 2) == 0);
    }
}
