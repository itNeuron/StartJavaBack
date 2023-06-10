package com.startjava.lesson_2_3_4.array;
import java.util.Arrays;

import java.util.function.ToDoubleBiFunction;

public class ArrayTheme {
    public static void main(String[] args) {
    /*
        Код, записанный в традиционном стиле:
         int[] nums = new int[10];
         for (int i = 0; i < nums.length; i++) {
             System.out.print(nums[i]);
         }

         Тот же самый код, но с использованием for-each:
         int[] nums = new int[10];
         for (int num : nums) {
             System.out.print(num);
         }
    */
        // TODO: 11.03.2023 1.	Реверс значений массива
        // a.	заполните массив числами вразнобой в промежутке [1, 7], используя сокращенную форму инициализации
        // b.	переставьте значения в исходном массиве в обратном порядке
        // c.	при этом берите значения для перезаписи из самого массива
        // d.	не используйте сортировку
        // e.	отобразите значения массива в две строки до модификации и после, отделяя числа друг от друга пробелом
        System.out.println("1.Реверс значений массива");
        int[] numbers1 = {7, 3, 6, 4, 5, 1, 2};
        for (int j : numbers1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i <= numbers1.length - 1; i++) {
            System.out.print(numbers1[numbers1.length - 1 - i] + " ");
            if (i == 6) {
                break;
            }
        }
        System.out.println();
        System.out.println();

        // TODO: 17.03.2023 2.	Вывод произведения элементов массива
        //a.	заполните массив в цикле цифрами в промежутке [0, 9] по возрастанию
        //b.	подсчитайте их произведение (без учета 0 и 9). Числа берите из массива
        //c.	отобразите:
        //i.	в цикле произведение в формате 1 * 2 *… * 8 = R  //40320
        //ii.	0 и 9 (берите из массива) отдельной строкой, указав их индексы
        //d.	для вывода произведения используйте тернарный оператор вместо if
        System.out.println("2.Вывод произведения элементов массива");

        int[] arrNum = new int[10];
        for (int i = 0; i < arrNum.length; i++) {  // создаёт массив
            arrNum[i] = i;
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
        System.out.println("корректировка цикла");
        int sumArr = 1;
        for (int i = 1; i < arrNum.length - 1; i++) {
            int d = arrNum[i];
            sumArr = sumArr * d;
            if (i == 1) {
                System.out.print(arrNum[0] + " " + arrNum[9]);
                System.out.println();
            }
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
        System.out.print("1 * 2 *… * 8 = " + sumArr);
        System.out.println();
        System.out.println();

        // TODO: 25.03.2023 3.	Удаление элементов массива
        //a.	+заполните массив размерностью 15 случайными вещественными числами в полуинтервале [0, 1)
        //b.	+вычислите индекс средней ячейки массива, а затем возьмите из нее число
        //c.	+перезапишите в массиве нулями все числа, которые больше этого значения
        //d.	отобразите:
        //    i.	исходный и измененный массив по 8 и 7 чисел в строке
        //    ii.	при этом после запятой отображайте только три знака
        //    iii.	выделяйте под каждое число с помощью форматирования одинаковое количество позиций,
        //           чтобы числа были выровнены в каждом столбце по правому краю
        //    iv.	количество обнуленных ячеек

        System.out.println("3.Удаление элементов массива");

        float[] arrayDel = new float[15];
        for (int q = 0; q < arrayDel.length; q++) {
            float a = (float) Math.random();
            arrayDel[q] = a;
            if (q == 8) {
                System.out.println();
                System.out.print("      ");
            }
            System.out.printf("%.3f", arrayDel[q]);
            System.out.print(" ");
            if (q == 14) {
                int w = arrayDel.length / 2;
                System.out.println();
                System.out.printf("%.3f", arrayDel[w]);
                System.out.println();
            }
        }
        int w = arrayDel.length / 2;
        int sumArrDell = 0;
        for (int q = 0; q < arrayDel.length; q++) {
            if (arrayDel[w] >= arrayDel[q]) {
                System.out.printf("%.3f", arrayDel[q]);
                System.out.print(" ");
            } else if (arrayDel[w] < arrayDel[q]) {
                arrayDel[q] = 0;
                System.out.printf("%.3f", arrayDel[q]);
                System.out.print(" ");
                sumArrDell ++;
            }
            if (q == 7) {
                System.out.println();
                System.out.print("      ");
            }
        }
        System.out.println();
        System.out.println("Количество обнулённых ячеек: " + sumArrDell + " из 15");
        System.out.println();

        // TODO: 28.05.2023  4.	Вывод элементов массива лесенкой в обратном порядке
        //a.	создайте массив, заполнив его в цикле большими анг. буквами по возрастанию
        //b.	отобразите его содержимое лесенкой в обратном порядке в следующем формате:
        // Z
        //ZY   [90;65]
        //ZYX
        //ZYXW

        System.out.println("4.Вывод элементов массива лесенкой в обратном порядке");
        System.out.println();

        char[] arrChar = new char[26];
        for (char d = 0; d <= arrChar.length-1; d++) {
            for ( int k = 0; k <= arrChar.length-1; k++) {
                arrChar [d] = (char) (90-d);
                System.out.print(arrChar[k]);
                if (k==d) {
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");

        // TODO: 28.05.2023 5.	Генерация уникальных чисел
        // a.	создайте массив из 30 чисел, заполнив его в цикле случайными значениями в промежутке [60, 100)
        // b.	при этом числа повторяться не должны
        // c.	если число уже есть в массиве, сгенерите новое
        // d.	делайте это до тех пор, пока не сгенерится число, которого еще нет в массиве
        // e.	отобразите полученный массив по 10 чисел в строке, отсортировав его по возрастанию

        int[] rendArray = new int[30];
        for (int i = 0; i <= rendArray.length - 1; i++) {
            boolean liken;
            int rendomNumber;
            do {
                rendomNumber = 60 +(int) ( Math.random() * 40);
                liken = false;
                for (int j=0;j<i;j++) {
                    if (rendArray[i] == rendomNumber){
                        liken = true;
                        break;
                    }
                }
            } while (liken);
            rendArray[i] = rendomNumber;
            System.out.print(rendArray[i] + " ");
            if (i == 9 | i == 19) {
                System.out.println("");
            }
        }





























    }
}