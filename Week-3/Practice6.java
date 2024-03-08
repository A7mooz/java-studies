// Even numbers from 2 to 100 displayed as 5 numbers per line (using while loops)
public class Practice6 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            int j = 2;
            while (j <= 10) {
                System.out.printf("%5d", i + j);
                j +=2;
            }
            System.out.println();
            i += 10;
        }
    }
}
