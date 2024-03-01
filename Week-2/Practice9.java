
//Display the multiplication table until 10(as 10x10 table).
public class Practice9 {
    public static void main(String[] args) 
    {
        
        //Homework: Print it like an actual table the current way isn't accepted.
        
        System.out.print("       ");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%-12d",i);
        }
        
        System.out.println();
        
        for(int i = 1; i <= 10; i++)
        {   
            System.out.printf("%2d| ",i);
            for(int j = 1; j <= 10; j++)
            {
                System.out.printf("%2d x %d = %2d ",i, j, i*j);
            }
            System.out.println();
        }
    }
}
