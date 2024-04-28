// Code the program that finds and displays the mode of an array.
/*
 * Note: The mode is the most frequent element
 */
public class Practice4 {
    public static void main(String[] args) {
        int array[] = { 6, 1, 7, 5, 3, 6, 3, 5, 9, 4, 2, 6, 5, 8, 9, 9, 2, 7, 6, 5, 7, 3, 1, 1, 7, 6, 9, 3, 4, 1, 2, 10, 1, 8, 4, 6, 5, 8, 10, 3, 4, 1, 1, 8, 1, 9, 6, 2, 6, 3 };
        int mode[] = new int[array.length];

        for (int i = 0; i < array.length; i++)
            mode[i]=0;

        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length; j++)
                if (array[i]==array[j])
                    mode[i]++;
        
        int max=0, index=0;
        for (int i = 0; i < mode.length; i++)
            if (max<mode[i]) {
                max=mode[i];
                index=i;
            }
        
        System.out.println(array[index] + " is the mode and its frequency is " + mode[index]);
    }
}
 