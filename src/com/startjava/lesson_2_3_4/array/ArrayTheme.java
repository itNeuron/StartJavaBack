package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

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
        for (int i = 0; i < arrNum.length; i++) {  // создаёт цикл
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
        //c.	перезапишите в массиве нулями все числа, которые больше этого значения
        //d.	отобразите:
        //    i.	исходный и измененный массив по 8 и 7 чисел в строке
        //    ii.	при этом после запятой отображайте только три знака
        //    iii.	выделяйте под каждое число с помощью форматирования одинаковое количество позиций,
        //           чтобы числа были выровнены в каждом столбце по правому краю
        //    iv.	количество обнуленных ячеек

        System.out.println("3.Удаление элементов массива");


        float[] arrayDel = new float[15];
        for (int q = 0; q < arrayDel.length; q++) {  // создаёт цикл
            float a = (float) Math.random();
            arrayDel[q] = a;
            if (q == 8) {
                System.out.println();
            }
            System.out.printf("%.3f", arrayDel[q]);
            System.out.print(" ");
            if (q == 14) {
                int w = arrayDel.length / 2;
                System.out.println();
                System.out.printf("%.3f", arrayDel[w]);
                System.out.println();

                if (arrayDel[w] > arrayDel[q]) {
                    for (int t = 0; t < arrayDel.length; t++) {
                        System.out.printf("%.3f", arrayDel[q]);;
                    }
                }

            }

        }
       /* for(i = 0, j = 0; i < x; i++)
        {
            if(a[i]<0)
                a[i]=0;
            else if(a[i] > 0)
            {
                b[j] = a[i];
                j++;
            }
        }
        /*
        System.out.println();
        int w = arrayDel.length / 2;                  //8ой, с которым нужно сравнивать остальные
        System.out.printf("%.3f", arrayDel[w]);
        System.out.println();

        //сверху всё ок
        System.out.println(Arrays.toString(arrayDel));
        for (int i = 0; i < arrayDel.length; i++) {
            if (w < arrayDel[i]) {                    // не получается заменить элементы
                                                       // массива, которые больше w
                arrayDel[i] = 0;
                System.out.print(arrayDel[i]);
            }

        }
        //System.out.println(Arrays.toString(arrayDel));*/
    }
}