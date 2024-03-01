
//Display Odd numbers from 1 to 99 as 5 numbers per lines by using for statements
public class Practice5 
{
    public static void main(String[] args) 
    {
        
        for(int i = 0; i <= 99; i+=10)
        {
            for(int j = 1; j<10; j+=2)
            {
                System.out.printf("%5d", i+j);
            }
            System.out.println();
        }
        
    }
}
