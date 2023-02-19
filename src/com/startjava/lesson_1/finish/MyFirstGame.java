package com.startjava.lesson_1.finish;

public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 35;
        int hiddenNum = 6;
        while (playerNum != hiddenNum) {
            if (playerNum > hiddenNum) {
                System.out.println(playerNum + " Данное число больше того, что загадал компьютер!");
                playerNum--;
            }
            if (playerNum < hiddenNum) {
                System.out.println(playerNum + " Данное число меньше того, что загадал компьютер!");
                playerNum++;
            }
        }
        System.out.println("Число угадано. Победа!");
        System.out.println("Попробуйте ещё раз!");
    }
}
