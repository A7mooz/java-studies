
//Display even numbers from 2 to 100 as 5 numbers per lines by using for statements
public class Practice6 {
    public static void main(String[] args) 
    {
        for(int i = 0; i < 100; i+=10)
        {
            for(int j = 2; j<=10; j+=2)
            {
                System.out.printf("%5d", i+j);
            }
            System.out.println();
        }
    }
}
