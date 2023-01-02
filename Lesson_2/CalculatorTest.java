package StartJava.Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();

        String d = "yes";
        while (d.equals("yes")) {
            System.out.print("Введите первое число: ");
            int setA = scanner.nextInt();
            calculatorOne.setA(setA);

            System.out.print("Введите знак математической операции: ");
            char setOperation = scanner.next().charAt(0);
            calculatorOne.setOperation(setOperation);

            System.out.print("Введите второе число: ");
            int setB = scanner.nextInt();
            calculatorOne.setB(setB);

            calculatorOne.calcul();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                d = scanner.next();
            } while (!d.equals("yes") && !d.equals("no"));
        }

        System.out.print("Калькулятор закрылся.");

    }
}
