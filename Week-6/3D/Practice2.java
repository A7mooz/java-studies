// Delcare a three dimesional array as Array[3][5][7] and assign numbers to each element of the array starting from 1 to (3x5x7). (columb by columb)

public class Practice2 {
    public static void main(String[] args) {
        int [][][] Array = new int[3][5][7];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 7; j++) 
                for (int k = 0; k < 5; k++) 
                    Array[i][k][j] = 7*5*i+5*i+k+1;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("\n"+(i+1)+". matrix:");
            for (int j = 0; j < 5; j++) {
                System.out.println();
                for (int k = 0; k < 7; k++)
                    System.out.print(Array[i][j][k]+"\t");
            }
        }        
    }
}
