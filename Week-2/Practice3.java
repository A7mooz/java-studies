
import java.util.Scanner;

//Display the factorial calue of n entered by the user.
public class Practice3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int fact=1, n = sc.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        
        System.out.println(fact);
        
        //Not need just to prevent any memeory leak.
        sc.close();
    }
}
