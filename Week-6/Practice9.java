// Code the program that sums and displays the numbers of an array mutually starting from the beginning to the end. 
public class Practice9 {
    public static void main(String[] args) {
        int array[] = {2, 4, 9, 3, 8, 10, 1, 5, 7, 6};
        long sum=0;

        for (int i = 0; i < array.length; i++)
            sum+=array[i];

        System.out.println("The array sum is " + sum);
    }
}
