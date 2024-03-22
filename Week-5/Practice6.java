// Code the program that creates and displays the reverse of an array with 15 elements as another array.
public class Practice6 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int reverse[] = new int[array.length];

        for (int i = 0; i < array.length; i++){
            reverse[i] = array[array.length - i - 1];
            System.out.print(reverse[i] + " ");
        }
    }
}
