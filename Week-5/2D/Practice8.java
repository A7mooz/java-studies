/*
    Code the program that saves the names of the students of a class as a string
    array and homework (1-2). midterms and ﬁnal exams as a two-dimensional
    array. Then, calculate the term average grade as the last column of the notes
    array, and display all of them line by line on the screen like a table with the
    headers.
 */
public class Practice8 {
    public static void main(String[] args) {
        double[][] scores = {{25, 96, 85, 74, 0},
                            {52, 75, 95, 86, 0},
                            {85, 96, 41, 76, 0},
                            {52, 61, 53, 85, 0},
                            {86, 94, 75, 86, 0}};
        String[] names = {"Ali Mavi", "Merve Turuncu", 
                            "Ahmet Sarı", "Cansu Beyaz", "Deniz Turkuaz"};
        
        for (int i = 0; i < scores.length; i++)
            scores[i][4] = scores[i][0] * 0.1 +  scores[i][1] * 0.1 + scores[i][2] * 0.4 + scores[i][3] * 0.4;

        System.out.printf("%-15s%-12s%-12s%-12s%-12s%-12s\n", "Name Surname",
                "Homework 1", "Homework 2", "Midterm", "Final", "TAG");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-15s", names[i]);
            for (int j = 0; j < scores.length-1; j++)
                System.out.printf("%-12.0f", scores[i][j]);

            System.out.printf("%-12.2f\n", scores[i][4]);
        }
    }
}
