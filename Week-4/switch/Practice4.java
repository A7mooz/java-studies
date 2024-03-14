import java.util.Scanner;

// Code the program that displays the letter grades of the students' grades in the 4-point system.
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade;
        do {
            System.out.print("Enter the grade: ");
            grade = sc.nextDouble();
        } while (grade < 0 || grade > 4);

        
        switch ((int)(grade*2)) {
            case 8: System.out.println("AA"); break;
            case 7: System.out.println("BA"); break;
            case 6: System.out.println("BB"); break;
            case 5: System.out.println("CB"); break;
            case 4: System.out.println("CC"); break;
            case 3: System.out.println("DC"); break;
            case 2: System.out.println("DD"); break;
            case 1: System.out.println("FD"); break;
            default: System.out.println("FF");
        }

        sc.close();
    }
}
