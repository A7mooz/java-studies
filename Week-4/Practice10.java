import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the operation:");
        String operation = scan.nextLine().replaceAll(" ", "");

        int a = 0,b = 0;

        char op = 0;

        for (int i = 0; i < operation.length(); i++) {
            if (operation.charAt(i) <= '9' && operation.charAt(i) >= '0') {
                if (op == 0) a = a*10 + Integer.valueOf(operation.charAt(i) - '0');
                else b = b*10 + Integer.valueOf(operation.charAt(i) - '0');
            } else {
               if (op == 0) op = operation.charAt(i);
               else i = operation.length();
            }
        }

        switch (op) {
            case '*': System.out.println(a * b); break;
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '/': System.out.println(a / b); break;
            case 0: System.out.println(a); break;
            default: System.out.println("Invalid operation");
        }

        scan.close();
    }
}
