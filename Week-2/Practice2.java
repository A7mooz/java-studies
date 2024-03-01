
import java.util.Scanner;

//Display sum of natural numbers until n entered by the user
public class Practice2 
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        
        System.out.println(sum);
        
        //Not really needed but just to stop any memory leak.
        sc.close();
    }    
}
