// Display the mutliplication table of the numbers from 1 to 10 (using while loops)
public class Practice9 {
    public static void main(String[] args) {
        System.out.printf("%8s", "");
        
        int i = 0;

        while (i++ < 10) 
            System.out.printf("%2s%2d%6s", "", i, "");

        System.out.println();

        i = 0;

        while (i++<10) {
            System.out.printf("%3s%2d%3s", "", i, "");

            int j = 0;
            while(j++<10)
                System.out.printf("%-2d%1s%-2d%1s%-4d", i, "x", j, "=", i*j);
            System.out.println();
        }
    }
}
