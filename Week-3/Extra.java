public class Extra {
  public static void main(String[] args) {
    int a = 5, b = 10;

    a += ++b - a;
    b -= --b + b;
    a = a + b++;
    b = b++ + a;

    // -4
    System.out.println(a + b);
    one();
    two();
  }

  private static void one() {
    int a = 2, b = 5;

    a += b++;
    b -= b-- - b;
    a = --b + a;
    b += b-- - a++;

    // 9
    System.out.println(a + b);
  }

  private static void two() {
    int a = 3, b = 1;

    a += a-- - b++;
    a += --b + a;
    a = a-- * ++b;

    // 24
    System.out.println(a + b);
  }
}
