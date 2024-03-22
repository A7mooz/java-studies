// Code the program to declared an array whose size is 20 and assign numbers to each element of the array from 1 to 20.
public class Practice1 {
    public static void main(String[] args) {
        int array[] = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = i+1;
            System.out.printf("%d ", array[i]);
        }
    }
}
