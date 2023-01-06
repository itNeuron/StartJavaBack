package StartJava.Lesson_1;

public class VariablesTheme {
    public static void main(String[] args) {
        // TODO: 15.08.2022 1. Создание переменных и вывод их значений на консоль (это название задачи)
        //● объявите переменные всех существующих в Java примитивных
        //типов данных, присвоив им значения
        //● в качестве значений используйте информацию о своем
        //компьютере: количество ядер, частота процессора и тд.
        //● выведите эти данные на консоль
        System.out.println("\nЗадание №1");
        byte pcCore = 6;
        short c = 700;
        int memary = 756;
        long frequency = 3200L;
        float d = 5512.389887f;
        double f = 2888888888.333555d;
        char e = 'a';
        boolean lovePc = true;
        System.out.println(" pcCorea = " + pcCore);
        System.out.println(" memary = " + memary);
        System.out.println(" frequency = " + frequency);
        System.out.println(c);
        System.out.println(d);
        System.out.println("не понятное число - " + f);
        System.out.println(e);
        System.out.println(" lovePc = " + lovePc);

        // TODO: 15.08.2022 2. Расчет стоимости товара со скидкой
        //○ товар X стоит 100 руб, а товар Y — 200 руб.
        //○ вместе на них действует скидка 11%
        //○ отобразите в консоли:
        //i. сумму скидки
        //ii. общую стоимость товаров со скидкой

        System.out.println("\nЗадание №2");
        int saks = 100;
        int shor = 200;
        double sale = 0.11;
        double resul = (saks + shor) * sale;
        System.out.println(resul);
        System.out.println(saks + shor - resul);

        // TODO: 15.08.2022 3. Вывод на консоль слова JAVA
        //Отобразите в консоли слово JAVA, как в примере ниже:
        //J a v v a
        //J a a v v a a
        //J J aaaaa V V aaaaa
        //JJ a a V a a
        //4.

        System.out.println("\nЗадание №3");
        System.out.println();
        System.out.println("    J     a   v     v   a");
        System.out.println("    J    a a   v   v   a a");
        System.out.println("J   J   aaaaa   V V   aaaaa");
        System.out.println(" J J   a     a   V   a     a");

        // TODO: 15.08.2022 4. Отображение min и max значений числовых типов данных
        //● создайте переменные всех целых числовых типов
        //● присвойте им самые большие числа, которые они могут хранить
        //● инкрементируйте, а затем декрементируйте все значения на
        //единицу
        //● выводите данные на консоль для каждой переменной в
        //следующей последовательности:
        //○ первоначальное значение
        //○ значение после инкремента
        //○ значение после декремента
        System.out.println("\nЗадание №4");
        byte g = 127;
        short k = 32_767;
        int h = 2_147_483_647;
        long i = 9_223_372_036_854_775_807L;
        float l = 3.1455555f;
        double n = 3.1456552889656326d;
        System.out.println(g);
        System.out.println(g++);
        System.out.println(g--);
        System.out.println(k);
        System.out.println(k++);
        System.out.println(k--);
        System.out.println(h);
        System.out.println(h++);
        System.out.println(h--);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i--);
        System.out.println(l);
        System.out.println(l++);
        System.out.println(l--);
        System.out.println(n);
        System.out.println(n++);
        System.out.println(n--);

        // TODO: 16.08.2022 5. !!!!! Перестановка значений переменных
        //○ создайте две переменные типа double, присвоив им значения 1.1 и
        //2.2
        //○ поменяйте значения переменных местами разными способами:
        //i. с помощью третьей переменной
        //ii. с помощью арифметических операций
        //iii. с помощью побитовой операции ^ (при этом дробная часть
        //не должна теряться)
        //○ перед началом очередных перестановок присваивать переменным
        //исходные значения не нужно
        //○ отобразите в консоли:
        //i. информацию о применяемом способе перестановки
        //значений
        //ii. исходные значения переменных
        //iii. новые значения переменных
        System.out.println("\nЗадание №5");
        double one = 1.1;
        double two = 2.2;

        System.out.println("с помощью третьей переменной");
        double three = -1.1;
        System.out.println("Исходное число :" + one);
        System.out.println("Исходное число :" + two);
        System.out.println(one = one - three);
        System.out.println(two = two + three);

        System.out.println("с помощью арифметических операций");
        System.out.println("Исходное число :" + one);
        System.out.println("Исходное число :" + two);
        System.out.println(one = one - two);
        System.out.println(two = two + one);

        System.out.println("с помощью побитовой операции ^");
        System.out.println("Исходное число: " + one);
        System.out.println("Исходное число: " + two);

        int one1 = (int) ( one );
        int two1 = (int) ( two );
        int de = one1 ^ 11;
        int de1 = two1 ^ 11;
        System.out.println(Integer.toBinaryString(two1^10));
        //System.out.println(Integer.toBinaryString(ne));
        //System.out.println(de1);
        //System.out.println(ne);
        float re1 = (float) (one % 1);
        float ne1 = (float) ( two % 2);
        System.out.println("тренировка " + re1);
        System.out.println("тренировка " + ne1);
        //2-10===1-01
        //перевести цифры в десятичные, отзеркалить их, перевести  в десятичные, прибавить десятые доли

        // TODO: 16.08.2022 6.Вывод символов и их кодов
        //○ создайте 5 переменных, присвоив им значения: 35, 38, 64, 94, 95
        //○ отобразите в консоли:
        //i. код символа
        //ii. напротив кода соответствующий ему символ (делайте это программно, а не написав его самим) из ASCII-таблицы
        System.out.println("\nЗадание №6");
        int digit1 = 35;
        int digit2 = 38;
        int digit3 = 64;
        int digit4 = 94;
        int digit5 = 95;
       // System.out.println((char) dig1 + перевод символа в ASCII);
        System.out.println((char) digit1);
        System.out.println((char) digit2);
        System.out.println((char) digit3);
        System.out.println((char) digit4);
        System.out.println((char) digit5);

        // TODO: 22.08.2022 7. Произведение и сумма цифр числа
        //○ имеется число 345
        //○ найдите произведение, а затем сумму его цифр
        //○ не используйте цикл
        //○ выделяйте каждую цифру числа программно, а не написав их самим
        //○ используйте для этого только операции / и %
        //○ выведите результат в следующем формате:
        //i. сумма цифр числа N = столько-то
        //ii. произведение цифр числа N = столько-то

        System.out.println("\nЗадание №7");
        int a = 345;
        int b5 = a / 100;
        int c5 = a % 300;
        int c6 = c5 /10;
        int d5 = a % 34;
        int e1 = b5 + c6 + d5;
        int f1 = b5 * c6 * d5;
        System.out.println("Сумма цифр числа 345 = " + e1);
        System.out.println("Произведение цифр числа 345 = " + f1);

        // TODO: 22.08.2022 8.Вывод на консоль ASCII-арт Дюка
        //○ отобразите в консоли Java-талисман, используя символы из
        System.out.println("\nЗадание №8");
        //примера ниже:
        int q1 = 47;
        int q2 = 92;
        int q3 = 95;
        int q4 = 40;
        int q5 = 41;
        System.out.println("     " + (char)q1 + " " + (char)q2 + "    ");
        System.out.println("    " + (char)q1 +"   " + (char)q2 + "   ");
        System.out.println("   " + (char)q1 + (char)q3 + (char)q4 + "  " + (char)q5 + (char)q2);
        System.out.println("  " + (char)q1 + "       " + (char)q2);
        System.out.println(" " + (char)q1 + "____" + (char)q3 +  (char)q1 + (char)q2 + "__"  + (char)q2);

        // TODO: 22.08.2022 9.	Отображение количества сотен, десятков и единиц числа
        //○	имеется число 123
        //○	выделите у него программно сотни, десятки и единицы
        //○	используйте для этого только операции / и %
        //○	отобразите результат, как “Число N содержит:”
        //i.	X сотен
        //ii.	Y десятков
        //iii.	Z единиц
        System.out.println("\nЗадание №9");
        int a3 = 123;
        int b3 = a3 /100;
        int c3 = a3 % 100;
        int d3 = c3 / 10;
        int e3 = a3 % 12;
        if (b3 > 2) {
            System.out.println(b3 + " сотен");
        } else {
            System.out.println(b3 + " сотня");
        }
        System.out.println(d3 + " десятков");
        System.out.println(e3 + " единиц");

        // TODO: 22.08.2022 10.	Преобразование секунд
        //○	имеется количество секунд 86399
        //○	переведите его в часы, минуты и секунды
        //○	используйте для этого только операции / и %
        //○	отобразите полученные значения в формате ЧЧ:ММ:СС
        System.out.println("\nЗадание №10");
        float w1 = 86_399;
        int w2 = (int) (w1 / 3600);
        float w3 = (w1 / 3600) % 23 * 60;
        float w4 = (w1 / 3600) % 23 * 60 % 59*60;
        System.out.println(w2 + ":" + (int) w3 + ":"  + (int) w4);
    }
}
