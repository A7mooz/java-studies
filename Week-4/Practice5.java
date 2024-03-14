import java.util.Scanner;

// Code the program that displays the letter grades of the students' grades in the 4-point system.
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grade;
        do {
            System.out.print("Enter the grade: ");
            grade = sc.nextFloat();
        } while (grade < 0 || grade > 4);

        if (grade == 4.0) System.out.println("AA");
        else if (grade >= 3.5) System.out.println("BA");
        else if (grade >= 3.0) System.out.println("BB");
        else if (grade >= 2.5) System.out.println("CB");
        else if (grade >= 2.0) System.out.println("CC");
        else if (grade >= 1.5) System.out.println("DC");
        else if (grade >= 1.0) System.out.println("DD");
        else if (grade >= 0.5) System.out.println("FD");
        else System.out.println("FF");

        sc.close();
    }
}
