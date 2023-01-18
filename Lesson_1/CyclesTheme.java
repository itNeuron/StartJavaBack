package StartJava.Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {

        // TODO: 06.09.2022 1. !!! Подсчет суммы четных и нечетных чисел
        //○ подсчитайте с помощью do-while сумму четных и нечетных чисел в
        //промежутке [-10, 21]
        //○ отобразите эти значения в формате:
        //i. в промежутке [-10, 21] сумма четных чисел = X, а нечетных = Y

         System.out.println("\nЗадание №1");//80 96
        int a1 = -10;
        int sumX = 0;//80
        int sumY = 0;//96
        int i=0;
        do {
            if (i % 2 != 0) {
                if (a1 % 2 != 0) {
                    sumY += a1;
                    a1++;
                } else {
                    sumX += a1;
                }
            }  else {
                sumX += a1;
                a1++;
            }
            i++;
        } while (a1 <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumX + ",\n а нечетных = " + sumY);

        // TODO: 06.09.2022 2. Вывод чисел в интервале между (max и min)
        //○ даны значения 10, 5, -1
        //○ найдите среди них max и min число
        //○ отобразите в консоль, с помощью for, все числа в интервале (max, min) 
        System.out.println("\nЗадание №2");
        int a2 = 5;
        int b2 = -1;
        int c2 = 10;
        if (a2>b2&a2>c2&b2>c2) {
            int max = a2;
            int min = c2;
            System.out.println("max  число" + max);
            System.out.println("min число" + min);
            for (i = max; i >= min; i--) {
                System.out.println(i);
            }
        } else if (b2>a2&b2>c2&a2>c2) {            
            int max = b2;
            int min = c2;
            System.out.println("max  число" + max);
            System.out.println("min число" + min);
            for (i = max; i >= min; i--) {
                System.out.println(i);
            }
        } else if (c2>a2&c2>b2&a2>b2) {
            int max = c2;
            int min = b2;
            System.out.println("max  число" + max);
            System.out.println("min число" + min);
            for (i = max; i >= min; i--) {
                System.out.println(i);
            }
        } else if (a2>b2&a2>c2&c2>b2) {
            int max = a2;
            int min = b2;
            System.out.println("max  число" + max);
            System.out.println("min число" + min);
            for (i = max; i >= min; i--) {
                System.out.println(i);
            }
        } else if (b2>a2&b2>c2&c2>a2) {
            int max = b2;
            int min = a2;
            System.out.println("max  число" + max);
            System.out.println("min число" + min);
            for (i = max; i >= min; i--) {
                System.out.println(i);
            }
        } else if (c2>a2&c2>b2&b2>a2) {
            int max = c2;
            int min = a2;
            System.out.println("max  число" + max);
            System.out.println("min число" + min);
            for (i = max; i >= min; i--) {
                System.out.println(i);
            }
        }



        // TODO: 06.09.2022 3. Вывод реверсивного числа и суммы его цифр
        //○ дано число 1234
        //○ в цикле while выделите каждую его цифру
        //○ подсчитайте сумму полученных цифр
        //○ отобразите в консоли:
        //i. исходное число в обратном порядке
        //ii. сумму его цифр
        System.out.println("\nЗадание №3");

        int tishi, b3, sotni,c9, desjatki, edinizi;
        int a3 = 1234;
        int rev = 0, sum = 0;
        while (a3>0) {
            tishi = a3 /1000;
            b3 = a3%1000;
            sotni = b3 /100;
            c9 = b3 % 100;
            desjatki = (c9 / 10);
            edinizi = (c9 % 10);
            rev = edinizi *1000 + desjatki * 100 + sotni*10  + tishi ;
            sum = edinizi  + desjatki + sotni  + tishi;
            break;
        }
        System.out.println("Обратное число " + rev);
        System.out.println("Сумма " +sum);


        // TODO: 06.09.2022 4. Вывод чисел на консоль в несколько строк
        //○ выведите с помощью for на консоль числа в полуинтервале [1, 24)
        //○ шаг итерации 2
        //○ отображайте в каждой строке по 5 чисел
        //○ отделяйте их друг от друга необходимым количеством пробелов
        //○ не указывайте впереди числа нули
        //○ выравнивайте числа в каждом столбце по правому краю, используя
        //форматированный вывод
        //○ недостающее в последней строке до 5 количество чисел заполните
        //нулями
        //○ число нулей определяйте программно. Не считайте их в уме и не
        // пишите сами
        System.out.println("\nЗадание №4");
        for (int i4=1;i4<24;i4+=2) {
            System.out.print(i4 + "  ");
            if (i4 < 9) {
                System.out.print(" ");
            }
            if (i4 % 9 == 0 | i4 % 19 == 0) {
                System.out.println();
            }
            if (i4 == 23) {
                for (int a4 = 1; a4 <= 3; a4++) {
                    System.out.print("0   ");
                }
            }
        }

        // TODO: 06.09.2022 5. Проверка количества единиц на четность
        //○ дано число 3141591
        //○ проверьте в цикле while, является ли количество единиц четным
        //○ отобразите результат:
        //i. число X содержит N (четное/нечетное) количество единиц
        System.out.println("\nЗадание №5");
        int a5;
        int v5 = 5141591;
        while (v5>0) {
            a5 = v5 % 10;
            if (v5 % 2 == 0) {
                System.out.println("Число " + v5 + "содержит " + a5 + "чётное количество единиц");
            } else {
                System.out.println("Число " + v5 + " содержит " + a5 + " нечётное количество единиц");
            }
            break;
        }

        // TODO: 06.09.2022 6. Отображение фигур в консоли
        //○ отобразите геометрические фигуры, используя:
        //i. для прямоугольника только for
        //ii. для прямоугольного треугольника только while
        //iii. для второго треугольника только do-while
        //○ каждую фигуру выводите на новой строке
        /* ********** ##### $
           ********** ####  $$
           ********** ###   $$$
           ********** ##    $$
           ********** #     $     */
        /*Создал два цикла do while, в
         которых по одному вложенному циклу do while. Я поделил
          треугольник на две части, на возрастание и убывание.
           Все работает. Кто-то делал так же?

           Я делал также, но мне сказали сделать иначе. Это можно
           сделать одним внешним циклом с одним циклом внутри. Всё получилось.
           оператор if
           */
        System.out.println("\nЗадание №6");
        int i6;
        for (i6 = 1; i6 < 51; i6++ ) {
            System.out.print("*");
            if (i6%10==0) {
                System.out.println("");
            }
        }
        System.out.println("");

        int k6=5;
        while (k6 >0 ) {
            System.out.printf("%1." +  k6 + "s%n","#####");
            k6--;
        }
        System.out.println("");

        int o6=0;
        do {
            System.out.printf("%1." +  o6 + "s%n","$$$");
            o6++;
        } while (o6 < 3);
        int o7=3;
        do {
            System.out.printf("%1." +  o7 + "s%n","$$$");
            o7--;
        }
        while (o7 > 0);

        // TODO: 06.09.2022 *7. Отображение ASCII-символов
        //○ отобразите, используя for, данные столбцов Dec и Char (и названия
        //столбцов) из таблицы
        //○ выводите на консоль:
        //i. символы, идущие до цифр и имеющие нечетные коды
        //ii. маленькие английские буквы, имеющие четные коды
        //○ данные каждого столбца должны быть выровнены по правому краю
        System.out.println("\nЗадание №7");
        System.out.println("Dec        Char");
        for (int i7 = 1; i7 <= 47; i7+=2) {
            if (i7<10) {
                System.out.print("  " + i7 + "          ");
            } else {
                System.out.print(" " + i7 + "          ");
            }
            System.out.println((char) i7);
        }
        for (int i7 = 98; i7 <= 122; i7+=2) {
            if (i7<99) {
                System.out.print(" " + i7 + "          ");
            } else {
                System.out.print(i7 + "          ");
            }
            System.out.println((char) i7);
        }

        // TODO: 06.09.2022 8. Проверка, является ли число палиндромом
        //○ дано число 1234321
        //○ проверьте, является ли оно палиндромом (читается одинаково с любой
        //стороны)
        //○ использовать Math.pow нельзя
        //○ отобразите в консоли:
        //i. число X является палиндромом
        System.out.println("\nЗадание №8");
        int num = 1234321;
        int million, m8, tisha3,t83,s8,tisha2,t82, tisha1,t31,sotni8, desjatki8, edinizi8;
        int rev8 = 0;
        while (num>0) {
            million = num/1000000;
            m8 = num % 1000000;
            tisha3 = m8 / 100000;
            t83 = num % 100000;
            tisha2 = t83 /10000;
            t82 = num % 10000;
            tisha1 = t82 / 1000;
            t31 = num % 1000;
            sotni8 = t31 /100;
            s8 = num % 100;
            desjatki8 = s8 / 10;
            edinizi8 = s8 % 10;
            rev8 = edinizi8 * 1000000 + desjatki8 * 100000 + sotni8 * 10000  + tisha1 * 1000 + tisha2 * 100 + tisha3 * 10 + million;
            break;
        }
        if (num==rev8) {
            System.out.println("число 1234321 является палиндромом");
        }

        // TODO: 06.09.2022 9. Определение, является ли число счастливым
        //○ счастливым называется число, сумма первых трех цифр которого
        //равна сумме последних
        //○ возьмите любое шестизначное число
        //○ подсчитайте сумму каждой тройки его цифр
        //○ отобразите в консоли:
        //i. каждую тройку цифр в формате “Сумма цифр abc = sum”
        //ii. является число счастливым или нет 
        System.out.println("\nЗадание №9");
        int num9 = 4328531;
        int million9, m9, tisha93,t93,s9,tisha92,t92, tisha91,t91,sotni9, desjatki9, edinizi9;
        int sum91 = 0;
        int sum92 = 0;
        while (num9>0) {
            million9 = num9/1000000;
            m9 = num % 1000000;
            tisha93 = m9 / 100000;
            t93 = num % 100000;
            tisha92 = t93 /10000;
            t91 = num % 1000;
            sotni9 = t91 /100;
            s9 = num % 100;
            desjatki9 = s9 / 10;
            edinizi9 = s9 % 10;
            sum91 = million9 + tisha93 + tisha92;
            sum92 = edinizi9 + desjatki9 + sotni9;
            System.out.println("Сумма цифр abc = " + sum91);
            break;
        }
        if (sum91 == sum92) {
            System.out.println(" Число является счастливым");
        } else {
            System.out.println(" Число  не является счастливым");
        }

        // TODO: 06.09.2022 10.Вывод таблицы умножения Пифагора
        //○ отобразите таблицу умножения в точности, как в образце, включая
        //горизонтальные и вертикальные линии
        //○ не добавляйте между строками и столбцами лишние пустоты
        //○ используйте цикл for
        System.out.println("\nЗадание №10");
        for (int k = 2; k < 10; k++) {
            if (k < 3) {
                System.out.print(" " + "|" + " " + k + " ");
            } else {
                System.out.print(k + "  ");
            }
            if (k == 9) {
                System.out.println("------------------------");
            }
        }
        for (int i10 = 2; i10 < 10; i10++) {
            if (i10 < 3) {
                System.out.print(i10 + "|");
                System.out.println();
            } else {
                System.out.println(i10 + "|");
            }
        }










    }
}
