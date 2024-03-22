// Code the program that finds the highest number among the elements of an array.
public class Practice7 {
    public static void main(String[] args) {
        int array[] = {-32, -5, -621, -500, -321, -1000};

        int max = array[0];

        for (int i = 0; i < array.length; i++)
            if (max < array[i]) max = array[i];

        System.out.println(max);
    }
}
