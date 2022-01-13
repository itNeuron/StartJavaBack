public class Cycle {

    public static void main(String[] args) {
        // Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.print (i + " ");
        }
        System.out.println ("");

        // Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        int j = 6;
        while (j >= -6) {
            System.out.print (j + " ");
            j--;
        }
        System.out.println ("");

        // Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        int k = 10;
        do{
            if (k % 2 ==0) {
                k++;
                System.out.print(k + " + ");
            } else if (k % 2 !=0) {
                k+=2;
                System.out.print(k + " + ");
            }
            if (k==19) {
                System.out.print("= 75");
            }
        } while(k < 18 );
    }
}
