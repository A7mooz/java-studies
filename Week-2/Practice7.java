
import java.util.Scanner;

//Display the base-2 system equivalent of the number entered by the user as base-10 system in reverse order.
public class Practice7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = n; i > 0; i /= 2){
            System.out.print(i%2);
        }
        
        sc.close();
    }
}
