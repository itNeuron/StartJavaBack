import java.util.Scanner;

public class CalculatorTest {
//отвечать за создание объектов, их инициализацию, ввод математического выражения и запуск вычислений
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        System.out.println("Введите первое число:");
        int setA = scanner.nextInt();

        System.out.println("Введите второе число:");
        int setB = scanner.nextInt();

        System.out.println("Введите знак математической операции:");

        String setOperation = scanner.nextLine();
        switch(setOperation) {
            case "+":
                System.out.println(setA + setB);
                break;
            case "-":
                System.out.println(setA - setB);
                break;
            case "*":
                System.out.println(setA * setB);
                break;
            case "/":
                System.out.println(setA / setB);
                break;
            case "%":
                System.out.println(setA % setB);
                break;
            case "^":
                int c = setA;
                for (int i = 1; i < setB; i++) {
                    c *= setA;
                }
                System.out.print(c);
                break;
            default:
                System.out.println("Введите допустимую мат. операцию!");
        }
    }
}
