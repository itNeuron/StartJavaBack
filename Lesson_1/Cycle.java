package StartJava.Lesson_1;

public class Cycle {

    public static void main(String[] args) {
        // Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        int j = 6;
        while (j >= -6) {
            System.out.print(j + " ");
            j -= 2;
        }
        System.out.println("");

        // Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        int b = -10;
        int sumOdd = 0;
        do {
            if (b % 2 != 0) {
                sumOdd += b;
            }
            b++;
            System.out.println(sumOdd);
        } while (b <= 21);
        //System.out.println(sumOdd);
    }
}
