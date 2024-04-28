// Add the fifth dimension (faculties: A,B) to the fourth example.
public class Practice7 {
    public static void main(String[] args) {
        double[][][][][] Array = {
            {{{{1, 25, 96, 85, 74, 0}, {2, 52, 75, 95, 86, 0}, {3, 85, 96, 41, 76, 0}, {4, 52, 61, 53, 85, 0}, {5, 86, 94, 75, 86, 0}},
            {{1, 75, 84, 96, 52, 0}, {2, 15, 42, 96, 85, 0}, {3, 75, 41, 85, 94, 0}, {4, 25, 65, 74, 85, 0}, {5, 75, 84, 96, 42, 0}},
            {{1, 74, 85, 96, 41, 0}, {2, 15, 45, 85, 96, 0}, {3, 25, 68, 45, 75, 0}, {4, 52, 75, 96, 75, 0}, {5, 45, 86, 95, 74, 0}}},
            {{{6, 25, 96, 85, 74, 0}, {7, 52, 75, 95, 86, 0}, {8, 85, 96, 41, 76, 0}, {7, 52, 61, 53, 85, 0}, {8, 86, 94, 75, 86, 0}},
            {{6, 75, 84, 96, 52, 0}, {7, 15, 42, 96, 85, 0}, {8, 75, 41, 85, 94, 0}, {7, 25, 65, 74, 85, 0}, {8, 75, 84, 96, 42, 0}},
            {{6, 74, 85, 96, 41, 0}, {7, 15, 45, 85, 96, 0}, {8, 25, 68, 45, 75, 0}, {7, 52, 75, 96, 75, 0}, {8, 45, 86, 95, 74, 0}}},
            {{{9, 25, 96, 85, 74, 0}, {10, 52, 75, 95, 86, 0}, {11, 85, 96, 41, 76, 0}, {12, 52, 61, 53, 85, 0}, {13, 86, 94, 75, 86, 0}},
            {{9, 75, 84, 96, 52, 0}, {10, 15, 42, 96, 85, 0}, {11, 75, 41, 85, 94, 0}, {12, 25, 65, 74, 85, 0}, {13, 75, 84, 96, 42, 0}},
            {{9, 74, 85, 96, 41, 0}, {10, 15, 45, 85, 96, 0}, {11, 25, 68, 45, 75, 0}, {12, 52, 75, 96, 75, 0}, {13, 45, 86, 95, 74, 0}}},
            {{{14, 25, 96, 85, 74, 0}, {15, 52, 75, 95, 86, 0}, {16, 85, 96, 41, 76, 0}, {17, 52, 61, 53, 85, 0}, {18, 86, 94, 75, 86, 0}},
            {{14, 75, 84, 96, 52, 0}, {15, 15, 42, 96, 85, 0}, {16, 75, 41, 85, 94, 0}, {17, 25, 65, 74, 85, 0}, {18, 75, 84, 96, 42, 0}},
            {{14, 74, 85, 96, 41, 0}, {15, 15, 45, 85, 96, 0}, {16, 25, 68, 45, 75, 0}, {17, 52, 75, 96, 75, 0}, {18, 45, 86, 95, 74, 0}}}},
            {{{{1, 25, 96, 85, 74, 0}, {2, 52, 75, 95, 86, 0}, {3, 85, 96, 41, 76, 0}, {4, 52, 61, 53, 85, 0}, {5, 86, 94, 75, 86, 0}},
            {{1, 75, 84, 96, 52, 0}, {2, 15, 42, 96, 85, 0}, {3, 75, 41, 85, 94, 0}, {4, 25, 65, 74, 85, 0}, {5, 75, 84, 96, 42, 0}},
            {{1, 74, 85, 96, 41, 0}, {2, 15, 45, 85, 96, 0}, {3, 25, 68, 45, 75, 0}, {4, 52, 75, 96, 75, 0}, {5, 45, 86, 95, 74, 0}}},
            {{{6, 25, 96, 85, 74, 0}, {7, 52, 75, 95, 86, 0}, {8, 85, 96, 41, 76, 0}, {7, 52, 61, 53, 85, 0}, {8, 86, 94, 75, 86, 0}},
            {{6, 75, 84, 96, 52, 0}, {7, 15, 42, 96, 85, 0}, {8, 75, 41, 85, 94, 0}, {7, 25, 65, 74, 85, 0}, {8, 75, 84, 96, 42, 0}},
            {{6, 74, 85, 96, 41, 0}, {7, 15, 45, 85, 96, 0}, {8, 25, 68, 45, 75, 0}, {7, 52, 75, 96, 75, 0}, {8, 45, 86, 95, 74, 0}}},
            {{{9, 25, 96, 85, 74, 0}, {10, 52, 75, 95, 86, 0}, {11, 85, 96, 41, 76, 0}, {12, 52, 61, 53, 85, 0}, {13, 86, 94, 75, 86, 0}},
            {{9, 75, 84, 96, 52, 0}, {10, 15, 42, 96, 85, 0}, {11, 75, 41, 85, 94, 0}, {12, 25, 65, 74, 85, 0}, {13, 75, 84, 96, 42, 0}},
            {{9, 74, 85, 96, 41, 0}, {10, 15, 45, 85, 96, 0}, {11, 25, 68, 45, 75, 0}, {12, 52, 75, 96, 75, 0}, {13, 45, 86, 95, 74, 0}}},
            {{{14, 25, 96, 85, 74, 0}, {15, 52, 75, 95, 86, 0}, {16, 85, 96, 41, 76, 0}, {17, 52, 61, 53, 85, 0}, {18, 86, 94, 75, 86, 0}},
            {{14, 75, 84, 96, 52, 0}, {15, 15, 42, 96, 85, 0}, {16, 75, 41, 85, 94, 0}, {17, 25, 65, 74, 85, 0}, {18, 75, 84, 96, 42, 0}},
            {{14, 74, 85, 96, 41, 0}, {15, 15, 45, 85, 96, 0}, {16, 25, 68, 45, 75, 0}, {17, 52, 75, 96, 75, 0}, {18, 45, 86, 95, 74, 0}}}}
        };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 3; ++k)
                    for (int l = 0; l < 5; ++l)
                        Array[i][j][k][l][5] = 0.1 * Array[i][j][k][l][1] + 0.1 * Array[i][j][k][l][2] + 0.4 * Array[i][j][k][l][3] + 0.4 * Array[i][j][k][l][4];
        
        for (int i = 0; i < 2; i++) {
            System.out.printf("\n\nFaculty %c scores:\n", 'A' + i);

            for (int j = 0; j < 4; j++) {
                System.out.printf("\n\nDepartment %c scores:\n", 'A' + j);
                for (int k = 0; k < 3; ++k) {
                    System.out.printf("\nCourse %c scores:\n", 'A' + k);
                    System.out.printf("%-12s%-12s%-15s%-14s%-14s%s\n", "Std.Number", "Homework 1", "Homework 2", "Midterm", "Final", "TAG");

                    for (int l = 0; l < 5; ++l) {
                        System.out.printf("%10.0f", Array[i][j][k][l][0]);
                        for (int m = 1; m < 6; ++m)
                            System.out.printf("%12.2f", Array[i][j][k][l][m]);

                        System.out.println();   
                    }
                }
            }
        }
    }
}