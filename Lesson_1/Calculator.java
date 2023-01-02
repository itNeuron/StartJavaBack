package StartJava.Lesson_1;

public class Calculator {

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        char operation = '^';

        if (operation == '+') {
            System.out.println(a + b);
        } else if (operation == '-') {
            System.out.println(a - b);
        } else if (operation == '*') {
            System.out.println(a * b);
        } else if (operation == '/') {
            System.out.println(a / b);
        } else if (operation == '%') {
            System.out.println(a % b);
        } else if (operation == '^') {
            int c = a;
            for (int i = 1; i < b; i++) {
                c *= a;
            }
            System.out.print(c);
        } else {
            System.out.println("Введите допустимую мат. операцию!");
        }
    }
}
