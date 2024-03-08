// Odd numbers from 1 to 99 displayed as 5 numbers per line (using while loops)
public class Practice5 {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 99) {
            int j = 1;
            while (j < 10) {
                System.out.printf("%5d", i + j);
                j += 2;
            }
            System.out.println();
            i+=10;
        }
    }
}
