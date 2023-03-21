package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
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
            System.out.print(numbers1[numbers1.length-1 - i] + " ");
            if (i==6) {
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
        for (int i = 1; i < arrNum.length-1; i++) {
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
        int sum=0;
        int i=1;
        while (i < arrNum.length-1 ) {
            int k = arrNum[i] * (i+1);



        }


       /* int k=0;
        int sum=0;
        for (int i = 1; i < arrNum.length-1; i++) {
            k = arrNum[i] * (i+1);
            System.out.print(k + " ");
        }
        System.out.print(k + " ");*/























        //  for (int i = 0; i < numbers1.length / 2; i++) {
        //      int temp = numbers1[i];
        //      numbers1[i] = numbers1[numbers1.length - i - 1];
        //      numbers1[numbers1.length - i - 1] = temp;
        //  }

      /*  String str2 = "abcdabcd";
        boolean quadric = quadric(str2);
        System.out.println(quadric);
    }

    public static boolean quadric(String str2) {
        if (str2.length() % 2 != 0) {
            return false;
        }
        int middle = str2.length() / 2;
        for (int i = 0; i < middle; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(middle+i);
            System.out.println(i + " " + a + " " + b);
            if (a != b) {
                return false;
            }
        }
        return true;

     /*
     1.


робеерт касымов



     int a = numbers1.length;
       int i = 0;
       do {


           System.out.print(numbers1[a] -1 + " ");
         a--;
       } while (a > 0);
        int o = 10;
        for (int k = 0; k < numbers1.length; k++) {
            if ( o < numbers1.length) {
                System.out.print(numbers1[o] + " ");
            } else {break;}

        }
        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
		//Выводим изначальный массив в консоль
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
		System.out.println();

		int n = a.length;
		//Переменная, которая будет использоваться при обмене элементов
		String temp;

		for (int i = 0; i < n/2; i++) {
		    temp = a[n-i-1];
		    a[n-i-1] = a[i];
		    a[i] = temp;
		}
		//Выводим конечный массив в консоль
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
	}
}*/


    }
}
