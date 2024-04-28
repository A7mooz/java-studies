// Code the program that finds and displays the prime numbers in an array.
public class Practice7 {
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

            if (control==0) System.out.println(array[i]);
        }
    }
}
