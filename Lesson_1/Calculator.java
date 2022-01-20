public class Calculator {

    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        char c = '/';

        if (c == '+') {
            int u = a+b;
            System.out.println(u);
        } else if (c == '-') {
            int u = a-b;
            System.out.println(u);
        } else if (c == '*') {
            int u = a*b;
            System.out.println(u);
        } else if (c == '/') {
            int u = a/b;
            System.out.println(u);
        } else if (c == '%') {
            int u = a%b;
            System.out.println(u);
        } else if (c == '^') {
            int u = a*a;
            System.out.println(u);
        } else {
            System.out.println("Введите знак!");
        }
    }
}
