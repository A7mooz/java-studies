// Code the program that counts and displays the amount of even and odd numbers in an array.
public class Practice9 {
    public static void main(String[] args) {
        int array[] = {1,5,7,8,9,14,15};

        int even = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) even++;

        System.out.println("Even: " + even);
        System.out.println("Odd: " + (array.length-even));
    }
}
