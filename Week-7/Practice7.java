// Code the program that ranks an array from the lowest to the highest by using a function.

public class Practice7 {
    static int[] rank(int array[]) {
        int rankedArray[] = array;
        for (int i = 0; i < rankedArray.length; i++)
            for (int j = 0; j < rankedArray.length; j++)
                if (rankedArray[i] < rankedArray[j]) {
                    int temp = rankedArray[i];
                    rankedArray[i] = rankedArray[j];
                    rankedArray[j] = temp;
                }

        return rankedArray;
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 5, 6, 1, 9, 8, 7, 10, 3 };

        int rankedArray[] = rank(array);

        for (int i = 0; i < rankedArray.length; i++) {
            System.out.println(rankedArray[i]);
        }
    }
}
