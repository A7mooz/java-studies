// Code the program that sorts and displays the elements of a one-dimensional array from the lowest to the highest
public class Practice1 {
    public static void main(String[] args) {
        int array[] = {2,4,9,7,6,1,13,8,-8,-5};
        int temp;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
    }    
}