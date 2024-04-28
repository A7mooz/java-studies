// Array[99] has 99 different, random, positive numbers between 1-100. Code the program that finds and displays the missing number in Array[99];
public class Practice5 {
    public static void main(String[] args) {
        int array[] = {45, 1, 86, 56, 32, 38, 92, 47, 51, 66, 48, 3, 31, 11, 7, 97, 82, 10, 88, 64, 74, 65, 6, 41, 78, 98, 54, 8, 99, 5, 34, 67, 69, 12, 93, 27, 58, 75, 89, 81, 17, 30, 36, 28, 40, 61, 9, 79, 84, 100, 22, 53, 77, 18, 20, 90, 13, 26, 94, 16, 63, 68, 46, 33, 50, 76, 49, 23, 73, 35, 21, 91, 72, 96, 39, 87, 29, 59, 83, 80, 52, 14, 62, 71, 4, 55, 19, 2, 44, 70, 60, 43, 25, 85, 24, 95, 15, 42, 57};
        int temp;

        for (int i = 0; i < 98; i++)
            for (int j = i; j < 99; j++)
            if(array[i]>array[j]) {
                temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }

        for (int i = 0; i < array.length-1; i++)
            if (array[i+1]-array[i]>1) {
                System.out.printf("Missing number is %d\n", i+2);
                break;
            }
    }    
}