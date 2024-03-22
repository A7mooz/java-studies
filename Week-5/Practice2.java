// Code the program to declared an array whose size is 20 and assign the first 20 even numbers to each element of the array starting from 2.
public class Practice2 {
    public static void main(String[] args) {
        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2*(i+1);
            System.out.printf("%-4d", array[i]);
        }
    }
}
