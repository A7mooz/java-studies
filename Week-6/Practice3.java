// Code the program that creates two different arrays for even numbers and odd numbers of a a one dimensional array.
public class Practice3 {
    public static void main(String[] args) {
        int array[] = { 2, 4, 9, 7, 6, 1, 13, 8, -8, -5 };
        int even = 0, odd = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                even++;
            else
                odd++;

        int evenarray[] = new int[even], oddarray[] = new int[odd];

        even = 0;
        odd = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
               evenarray[even++]=array[i];
            else
                oddarray[odd++]=array[i];
        
        System.out.println("Array with even numbers:");
        for (int i = 0; i < even; i++)
            System.out.println(evenarray[i]);
        System.out.println("Array with odd numbers:");
        for (int i = 0; i < odd; i++) 
            System.out.println(oddarray[i]);
    }
}
