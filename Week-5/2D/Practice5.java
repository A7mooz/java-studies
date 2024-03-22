/*
    Generate 3 different two-dimensional arrays with the components of 10x10
    multiplication table. Array1[][] is the products, Array2[][] is the multipliers and
    Array3[][] is the results. First. display all of them one by one. and then display
    the 10x10 multiplication table by using these 3 arrays.
 */
public class Practice5 {
    public static void main(String[] args) {
        int Array1[][] = new int[10][10];
        int Array2[][] = new int[10][10];
        int Array3[][] = new int[10][10];
        
        System.out.println("Products:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Array1[i][j] = i+1;
                System.out.printf("%-4d", Array1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMultipliers:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Array2[i][j] = j+1;
                System.out.printf("%-4d", Array2[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nResults:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Array3[i][j] = (i+1)*(j+1);
                System.out.printf("%-4d", Array3[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d x %2d = %3d\t", Array1[i][j], Array2[i][j], Array3[i][j]);
            }
            System.out.println();
        }
    }    
}