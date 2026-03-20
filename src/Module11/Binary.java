package Module11;

public class Binary {
    static void generate(int n, String str) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        generate(n, str + "0");
        generate(n, str + "1");
    }

        public static void main(String[] args) {
        generate(3, "");

    }
}
