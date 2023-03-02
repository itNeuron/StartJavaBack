package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char operation;

    public void setA(int a) {
        if (a < 0 || a > 100) {
            System.out.println("Некорректное число. Введите другое");
        } else {
            this.a = a;
        }
    }

    public void setB(int b) {
        if (b < 0 || b > 100) {
            System.out.println("Некорректное число. Введите другое");
        } else {
            this.b = b;
        }
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calcul() {
        switch (operation) {
            case '+':
                System.out.println("Ответ: " + (a + b));
                break;
            case '-':
                System.out.println("Ответ: " + (a - b));
                break;
            case '*':
                System.out.println("Ответ: " + a * b);
                break;
            case '/':
                System.out.println("Ответ: " + a / b);
                break;
            case '%':
                System.out.println("Ответ: " + a % b);
                break;
            case '^':
                pow();
                break;
            default:
                System.out.println("Введите допустимую мат. операцию!");
        }
    }

    private void pow() {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        System.out.println("Ответ: " + c);
    }
}