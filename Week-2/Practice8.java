
import java.util.Scanner;

//Display the base-2 system equivalent of the number entered by the user as base-10 system in real order.
public class Practice8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int temp = n;
        
        for(int i = n; i > 0; i /= 2)
        {
            counter++;
        }
        
        for(int i = counter; i > 0; i--)
        {
            for(int j = i; j > 1; j--)
            {
                temp /= 2;
            }
            System.out.print(temp%2);
            temp = n;
        }
        
        sc.close();
    }
}
