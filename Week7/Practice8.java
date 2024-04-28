// Code the function that returns the maximum value of an array.

public class Practice8 {
    static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i]>max) max=array[i];
        
        return max;
    }
    public static void main(String[] args) {
        int [] array = {2, 4, 5, 6, 1, 9, 8, 7, 10, 3};
        
        System.out.println(max(array));
    }
}
