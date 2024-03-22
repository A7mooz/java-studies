// Code the program that displays the negative integers of an array, and then positive integers.
public class Practice5 {
    public static void main(String[] args) {
        int arr[] = {-1,2,-5,10,12,-3,0};

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) System.out.print(arr[i] + " ");

        System.out.println();

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0) System.out.print(arr[i] + " ");
        
        // Print the remaining zeros
        System.out.println();
        
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) System.out.print(arr[i] + " ");
    }
}
