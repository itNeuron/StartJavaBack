public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 35;

        int b = 5;
        int hiddenNum = 0;
        do {
            if (b % 2 != 0) {
                hiddenNum += b;
            }
            b++;
        } while (b < 13);
        hiddenNum -= 3;
        if (playerNum == hiddenNum) {
            System.out.println(playerNum + " Поздравляю, число угадано!");
        } else if (playerNum > hiddenNum) {
            System.out.println(playerNum + " Данное число больше того, что загадал компьютер!");
            System.out.println("   Попробуйте ещё раз!");
        } else if (playerNum < hiddenNum) {
            System.out.println(playerNum + " Данное число меньше того, что загадал компьютер!");
            System.out.println("   Попробуйте ещё раз!");
        }
    }
}
