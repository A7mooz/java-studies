/*
 * Exam Scores of a class for three courses are given in the following table. 
 * First, assign the grades to a three dimensional array (third dimension: Courses, second dimension: students, first dimension: exam scores). 
 * Then, calculate the Term Average Grade and display all of the scores as tables given in Practice4.png.
 */
public class Practice4 {
    public static void main(String[] args) {
        double[][][] Array = {
            {{1, 25, 96, 85, 74, 0}, {2, 52, 75, 95, 86, 0}, {3, 85, 96, 41, 76, 0}, {4, 52, 61, 53, 85, 0}, {5, 86, 94, 75, 86, 0}},
            {{1, 75, 84, 96, 52, 0}, {2, 15, 42, 96, 85, 0}, {3, 75, 41, 85, 94, 0}, {4, 25, 65, 74, 85, 0}, {5, 75, 84, 96, 42, 0}},
            {{1, 74, 85, 96, 41, 0}, {2, 15, 45, 85, 96, 0}, {3, 25, 68, 45, 75, 0}, {4, 52, 75, 96, 75, 0}, {5, 45, 86, 95, 74, 0}}
        };

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < 5; ++j)
                Array[i][j][5] = 0.1 * Array[i][j][1] + 0.1 * Array[i][j][2] + 0.4 * Array[i][j][3] + 0.4 * Array[i][j][4];

        for (int i = 0; i < 3; ++i) {
            System.out.printf("\nCourse %c scores: \n", 'A' + i);
            System.out.printf("%-12s%-12s%-15s%-14s%-14s%s\n", "Std.Number", "Homework 1", "Homework 2", "Midterm", "Final", "TAG");

            for (int j = 0; j < 5; ++j) {
                System.out.printf("%10.0f", Array[i][j][0]);
                for (int k = 1; k < 6; ++k)
                    System.out.printf("%12.2f", Array[i][j][k]);

                System.out.println();
            }
        }
    }
}