import java.util.Scanner;

// Calculate and display (n/k) by using while loops
public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and k:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int result = 1;

        int i = n;
        
        while (i>(n-k))
            result*=i++;

        i = k;
        
        while (i>1)
            result/=i++;
        
        System.out.println(result);
        sc.close();
    }
}
