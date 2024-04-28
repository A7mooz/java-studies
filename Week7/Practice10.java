// Code a class having four different functions under itself to calculate for four basic mathimatical operations among two numbers.

class mathop {
    int sum(int a, int b) {
        return a+b;
    }
    int subt(int a, int b) {
        return a-b;
    }
    int mult(int a, int b) {
        return a*b;
    }
    int div(int a, int b) {
        return a/b;
    }
}

public class Practice10 {
    public static void main(String[] args) {
        mathop m = new mathop();

        int x=4, y=5;

        System.out.println(m.sum(x, y));
    }
}
