// Code the program that finds the common values of two different arrays and displays them with their own sequence number (index + 1) in their own arrays.
public class Practice10 {
    public static void main(String[] args) {
        int array1[] = {10, 12, 5, 6, 19, 8, 21};
        int array2[] = {8, 2, 21, 53};

        System.out.println("Value\tarray1\tarray2");

        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array2.length; j++)
                if (array1[i] == array2[j]) System.out.println(array1[i] + "\t" + (i+1) + "\t" + (j+1));
    }
}
