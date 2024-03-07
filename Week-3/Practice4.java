public class Practice4 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            int j = 0;
            while (j++ < 10)
                System.out.printf("%5d", i + j);
            System.out.println();
            i += 10;
        }
    }
}
