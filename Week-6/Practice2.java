// Code the program that finds and displays the difference between the highest and the lowest values of the array.
public class Practice2 {
    public static void main(String[] args) {
        int array[]={2,4,9,7,6,1,13,8,-8,-5};
        int max=array[0], min=array[0];

        for (int i = 0; i < array.length; i++) {
            if (max<array[i])
                max=array[i];
            else if (min>array[i]) 
                min=array[i];
        }

        System.out.println("The difference is " + (max-min));
    }
}
