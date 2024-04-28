// Ch[] = {'a', 'S', 'd', ........'Y'} is char array with random letters. Convert the lowercase letters to uppercase letters and uppercase letters to lowercase letters.
public class Practice6 {
    public static void main(String[] args) {
        char ch[] = {'a', 'S', 'd', 'e', 'q', '/', 'B', '$', 'L', '+', 'X', '\\', 'q', 'Y'};
        
        for (int i = 0; i < ch.length; i++)
            if (ch[i]>='A'&&ch[i]<='Z')
                ch[i]+='a'-'A';
            else if (ch[i]>='a'&&ch[i]<='z')
                ch[i]-='a'-'A';
        
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
