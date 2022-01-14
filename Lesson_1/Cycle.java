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
            j--;
        }
        System.out.println("");

        // Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        int k = 10;
        int a = k + 1;
        do {
            if (a % 2 !=0) {
                a += 2;
            }
        } while (a < 74);
        System.out.print(a);
    }
}
