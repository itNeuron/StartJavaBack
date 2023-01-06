package StartJava.Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //TODO: 29.08.2022 1. Перевод псевдокода на язык Java (это название задачи)
        //● перепишите псевдокод, приведенный ниже, с помощью Java
        //● используйте переменные, условные операторы, логическое НЕ
        //● придумайте сообщения и отобразите в консоли
        System.out.println("\nЗадание №1");
        int alt = 34;
        if (alt > 20) {
            System.out.println("Тебе повезло");
        } else {
            System.out.println("Есть куда рости!");
        }
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Здоровья тебе!");
        }
        if (isMaleGender) {
            System.out.println("На тебе больше ответственности!");
        }
        float height = 1.76f;
        if (height < 1.80f) {
            System.out.println("Средний рост!");
        } else {
            System.out.println("Иногда в автобусах неудобно сидеть!");
        }
        char firstLetterName = "A".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Как название остановки метро");
        } else if (firstLetterName == 'I') {
            System.out.println("Ингвар? :)");
        } else {
            System.out.println("С неё начинается алфавит..");
        }

        // TODO: 30.08.2022 2. Поиск max и min числа
        //○ создайте две переменные, присвоив им любые числа
        //○ найдите максимальное и минимальное число
        //○ выведите числа на консоль, указав какое из них max и min
        System.out.println("\nЗадание №2");
        int a = 5;
        int b = 2;
        if (a>b) {
            System.out.println(a + " max число");
            System.out.println(b + " min число");
        } else {
            System.out.println(b + " max число");
            System.out.println(a + " min число");
        }

        // TODO: 31.08.2022 3. Работа с числом
        //○ создайте переменную с любым числом
        //○ определите, являться ли оно:
        //i. нулем
        //ii. четным (нечетным)
        //iii. отрицательным (положительным)
        //○ если число равно 0, то остальные проверки не должны
        //осуществляться
        //○ отобразите полученные результаты
        System.out.println("\nЗадание №3");
        int a3 = -1;
        if (a3 == 0) {
            System.out.println("Число a3 равно 0");
        } else  {
            System.out.println("Число a3 не равно 0");
            if ((a3 % 2) == 0) {
                System.out.println("Число a3 чётное");
            } else {
                System.out.println("Число a3 не чётное");
            }
            if (a3 > 0) {
                System.out.println("Число a3 больше 0");
            } else {
                System.out.println("Число a3 меньше 0");
            }
        }

        // TODO: 01.09.2022 4. Поиск одинаковых цифр в числах
        //○ создайте две переменные, присвоив им два трехзначных целых
        //числа
        //○ найдите в них одинаковые цифры, стоящие в одном и том же
        //разряде
        //○ отобразите результат в формате:
        //i. в числах N и M одинаковые цифры A, B, C стоят в X, Y, Z
        //разрядах
        System.out.println("\nЗадание №4");
        int N = 326;
        int M = 318;
        int N1 = N / 100;
        int M1 = M / 100;
        int N2 = N % 100;
        int M2 = M % 100;
        int N11 = N2 / 10;
        int M11 = M2 / 10;
        int N111 = N % 10;
        int M111 = M % 10;
        if (N1 == M1 & N11 == M11 & N111==M111) {
            System.out.println("В числах " + N + " и " + M + " одинаковые цифры " + N1 + " и " + N11 + "" + N111 + " стоят в 1,2,3 разрядах");
        } else if (N1 == M1 & N11 == M11) {
            System.out.println("В числах " + N + " и " + M + " одинаковые цифры " + N1 + " и " + N11 + " стоят в 1,2 разрядах");
        } else if (N1 == M1 & N111 == M111) {
            System.out.println("В числах " + N + " и " + M + " динаковые цифры " + N1 + " и " + N111 + " стоят в 1,3 разрядах");
        } else if (N11 == M11 & N111 == M111) {
            System.out.println("В числах " + N + " и " + M + " одинаковые цифры " + N11 + " и " + N111 + " стоят в 2,3 разрядах");
        }  else if (N1 == M1) {
            System.out.println("В числах " + N + " и " + M + " одинаковые цифры " + N1 + " стоят в 1 разряде");
        }  else if (N11 == M11) {
            System.out.println("В числах " + N + " и " + M + " одинаковые цифры " + N11 + " стоят в 2 разряде");
        }  else if (N111 == M111) {
            System.out.println("В числах " + N + " и " + M + " одинаковые цифры " + N111 + " стоят в 3 разряде");
        }

        // TODO: 03.09.2022 5. Определение буквы, числа или символа по их коду
        //○ создайте переменную типа char
        //○ присвойте ей значение ‘\u0057’
        //○ определите — это код буквы, числа или другого символа
        //○ использовать для этого методы классов Java запрещено!
        //○ выведите в консоль сам символ и информацию о нем:
        //i. маленькая (большая) буква
        //ii. это число
        //iii. не буква и не число
        System.out.println("\nЗадание №5");
        char a5 = '\u0057';
        System.out.print((int) a5);




        // TODO: 03.09.2022 6. Определение суммы вклада и начисленных банком %
        //○ сумма вклада равна 300_000 руб.
        //○ если она:
        //i. меньше 100 000, то банк начисляет 5% годовых
        //ii. от 100 000 до 300 000, то — 7%
        //iii. больше 300 000, то — 10%
        //○ отобразите в консоли:
        //i. сумму вклада
        //ii. начисленный %
        //iii. итоговую сумму с %
        System.out.println("\nЗадание №6");
        int a6 = 300000;
        int a66 = (int) (a6*0.05);
        if (a6 < 100000) {
            System.out.println("Сумма вклада - " + a6);
            System.out.println("Начисленный процент - " + (int) (a6*0.05));
            System.out.println("Итоговая сумму с % " + (a6 + (int) (a6*0.05)));
        } else if (100000 < a6 | a6 < 300000) {
            System.out.println("Сумма вклада - " + a6);
            System.out.println("Начисленный процент - " + ((int) (a6*0.07)));
            System.out.println(a6 + (int) (a6*0.07));
        } else if (a6 > 300000) {
            System.out.println("Сумма вклада - " + a6);
            System.out.println("Начисленный процент - " + (int)(a6 * 0.1));
            System.out.println("Итоговая сумму с % " + a6 + (int)(a6 * 0.1));
        }

        // TODO: 03.09.2022 7. Определение оценки по предметам
        //○ студент получил итоговые % по предметам:
        //i. история 59%
        //ii. программирование 91%
        //○ определите оценки по каждому предмету:
        //i. <= 60% — 2
        //ii. > 60% - 3
        //iii. > 73% - 4
        //iv. > 91% - 5
        //○ выведите в консоль:
        //i. оценку и напротив предмет
        //ii. средний балл оценок по предметам
        //iii. средний % по предметам
        System.out.println("\nЗадание №7");
        int histori = 59;
        int programming = 91;
        System.out.println(histori);
        System.out.println(programming);
        if (histori <= 60) {
            System.out.println("2 - " + "история");
        } else if (histori > 60 & histori < 73) {
            System.out.println("3 - " + "история");
        } else if (histori > 73 & histori <91) {
            System.out.println("4 - " + "история");
        } else if (histori > 91) {
            System.out.println("5 - история");
        }
        if (programming <= 60) {
            System.out.println("2 - " + "программирование");
        } else if (programming > 60 & programming < 73) {
            System.out.println("3 - " + "программирование");
        } else if (programming > 73 & programming < 91) {
            System.out.println("4 - " + "программирование");
        } else if (programming > 91) {
            System.out.println("5 - программирование");
        }
        if (histori <= 60 & programming <= 60) {
            System.out.println("Средний бал 2");
        } else if (histori <= 60 & programming > 60 & programming < 73 | programming <= 60 & histori > 60 & histori < 73) {
            System.out.println("Средний бал 2.5");
        } else if (histori > 60 & histori < 73 & programming > 60 & programming < 73) {
            System.out.println("Средний бал 3");
        } else if (histori > 60 & histori < 73 & programming > 73 & programming < 91 | histori > 73 & histori < 91 & programming > 60 & programming < 73) {
            System.out.println("Средний бал 3.5");
        } else if (histori > 73 & histori < 91 & programming > 73 & programming < 91) {
            System.out.println("Средний бал 4");
        } else if (histori > 73 & histori < 91 & programming > 91 | histori > 91 & programming > 73 & programming < 91) {
            System.out.println("Средний бал 4.5");
        } else if (histori > 91 & programming > 91) {
            System.out.println("Средний бал 5");
        }
        System.out.println("Средний % по предметам - " + ((histori + programming) /2));

        // TODO: 03.09.2022 8. Расчет прибыли
        //○ продавец снимает помещение за 5 000 руб. в месяц
        //○ в среднем в месяц он продает товара на 13 000 руб.
        //○ при этом его себестоимость равна 9 000 руб.
        //○ подсчитайте годовую прибыль
        //○ отобразите ее в консоли в следующем формате, например:
        //i. прибыль за год: -1000 руб.
        //ii. прибыль за год: +3000 руб.
        //○ если прибыль положительная, то рядом с числом необходимо
        //отображать +
        System.out.println("\nЗадание №8");
        int arenda = 5000;
        int viruchka = 13000;
        int sebes = 9000;
        int prib= viruchka - arenda - sebes;
        int pribGod = prib * 12;
        System.out.println("прибыль за год:" + pribGod);

        // TODO: 03.09.2022 9. Подсчет количества банкнот
        //○ из банкомата вам необходимо снять 567 USD
        //○ подсчитайте, с помощью какого количества банкнот номиналом 1,
        //10, 100 банкомат может выдать необходимую сумму
        //○ при этом в банкомате осталось только 5 банкнот номиналом 10
        //○ проведите обратный расчет начальной суммы по полученному
        //количеству банкнот, чтобы убедиться в правильности вычислений
        //○ если каких-то банкнот не хватает, то их нужно заменить
        //банкнотами другого номинала
        //○ выведите в консоль:
        //i. номиналы банкнот
        //ii. требуемое их количество
        //iii. посчитанную исходную сумму
        System.out.println("\nЗадание №9");
        int a9 = 567;
        int sotni = a9 /100;
        int c9 = a9 % 100;
        int desjatki = (c9 / 10)-1;
        int edinizi = (c9 % 10) + 10;
        System.out.println("Сотни - " + sotni);
        System.out.println("Десятки - " + desjatki);
        System.out.println("Единицы - " + edinizi);
        int p9 = sotni *100 + desjatki * 10 + edinizi;
        System.out.println(p9);
    }
}
