
import java.util.Scanner;

//Calculate and display (n/k) by using for loop
public class Practice10 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 1;
        
        for(int i=n; i>(n-k); i--)
        {
            result*=i;
        }
        
        for(int i = k; i>1;i--)
        {
            result/=i;
        }
        
        System.out.println(result);
        
    }
}
