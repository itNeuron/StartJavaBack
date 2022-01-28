public class MyFirstGame {

    public static void main(String[] args) {
        int numUser = 52;
        int numMem = 52;

        if (numUser < numMem) {
            System.out.println("Данное число меньше того, что загадал компьютер!");
        } else if (numUser > numMem) {
            System.out.println("Данное число больше того, что загадал компьютер!");
        } else if (numUser == numMem) {
            System.out.println("Поздравляю, число угадано!");
        }
    }
}
