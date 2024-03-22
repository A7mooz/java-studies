import java.util.Scanner;

// Write the code that converts from base-5 to base-8
public class Homework {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int number, temp, counter = 1;

        boolean cont = true;

        do {
            cont = true;
            System.out.print("Enter a base-5 number: ");
            number = scan.nextInt();
            if (number < 0) {
                cont = false;
            } else {
                temp = number*10;
                while ((temp /= 10) > 0) {
                    if (temp % 10 > 4) {
                        cont = false;
                        temp = 0;
                    } 
                }
            }
        } while (!cont);

        int base10 = 0;
        temp = number;

        while ((temp /= 10) > 0) counter++;
        
        for (int i = 0; i < counter; i++) {
            temp = number;
            
            for (int j = 0; j < i; j++) temp /= 10;

            int a = 1;

            for (int k = 0; k < i; k++) a *= 5;

            base10 += a * (temp % 10);
        }

        counter = 1;
        temp = base10;

        while ((temp /= 8) > 0) counter++;

        System.out.print("Base-8: ");

        for(int i = counter; i > 0; i--)
        {
            temp = base10;
            for(int j = i; j > 1; j--) temp /= 8;
            System.out.print(temp % 8);
        }

        System.out.println();
        
        scan.close();
    }
}