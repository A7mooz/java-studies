public class Practice9 {
    public static void main(String[] args) {
        char chars[][] = {{'a', 'H', '_'}, {'!', 't', 'g'}};

        int diff = 'a' - 'A';

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] >= 'A' && chars[i][j] <= 'Z') System.out.print((char)(chars[i][j]+diff) + "\t");
                else if (chars[i][j] >= 'a' && chars[i][j] <= 'z') System.out.print((char)(chars[i][j]-diff) + "\t");
                else System.out.print(chars[i][j] + "\t");
            }
        }
    }
}
