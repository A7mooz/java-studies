
import java.util.Scanner;

//Display all natural numbers from 1 to 100 as 10 numbers perline by using for statements
public class Practice4 
{
    public static void main(String[] args) 
    {
        
        for(int i = 0; i < 100; i+=10)
        {
            for(int j = 1; j<11; j++)
            {
                System.out.printf("%5d", i+j);
            }
            System.out.println();
        }
        
        StopAtInput();
    }
    static void StopAtInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        for(int i = 0; i < num; i+=10)
        {
            for(int j = 1; j<=10 && i+j <= num; j++)
            {
                System.out.printf("%5d", i+j);
            }
            System.out.println();
        }
        
        
        scanner.close();
    }
    
}
