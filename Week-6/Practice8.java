// Code the program that finds and displays the twin primes of an array.
/*
 * Twin Prime number: is a prime number that is either 2 less or 2 more than another prime number
 * for example, either member of the twin prime pair (17,19) or (41,43).
 */
public class Practice8 {
    public static void main(String[] args) {
        int array[] = {79, 41, 47, 31, 59, 6, 36, 68, 32, 89, 88, 14, 73, 46, 75, 37, 15, 1, 48, 17, 30, 99, 78, 87, 13, 45, 42, 28, 22, 80, 74, 9, 23, 63, 19, 81, 55, 90, 76, 97, 69, 7, 86, 95, 61, 20, 91, 43, 18, 8};
        int control;

        System.out.println("Prime numbers of the array:");

        for (int i = 0; i < array.length; i++) {
            control=0;
            for (int j = 2; j <= array[i]/2; j++) 
                if(array[i]%j==0) {
                    control=1;
                    break;
                }

            if (control==0)
                for (int j = 0; j < array.length; j++)
                    if ((array[j]-array[i])==2) {
                        control=0;
                        for (int k = 2; k <= array[j]/2; k++)
                            if(array[j]%k==0) {
                                control=1;
                                break;
                            }

                        if (control==0) System.out.printf("%d\t%d\n", array[i], array[j]);
                    }
        }
    }
}
