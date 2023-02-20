package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор запущен!");
        Calculator calc = new Calculator();

        String d = "yes";
        while (d.equals("yes")) {
            System.out.print("Введите первое число: ");
            int setA = scanner.nextInt();
            calc.setA(setA);

            System.out.print("Введите знак математической операции: ");
            char setOperation = scanner.next().charAt(0);
            calc.setOperation(setOperation);

            System.out.print("Введите второе число: ");
            int setB = scanner.nextInt();
            calc.setB(setB);

            calc.calcul();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                d = scanner.next();
            } while (!d.equals("yes") && !d.equals("no"));
        }

        System.out.print("Калькулятор закрылся.");
        scanner.close();
    }
}
