public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 80;
        for (int i = 80; i >= 40; i--) {
            playerNum--;
        }
        int hiddenNum = 53;

        if (playerNum < hiddenNum) {
            System.out.println(playerNum + " Данное число меньше того, что загадал компьютер!");
        } else if (playerNum > hiddenNum) {
            System.out.println(playerNum + " Данное число больше того, что загадал компьютер!");
        } else if (playerNum == hiddenNum) {
            System.out.println(playerNum + " Поздравляю, число угадано!");
        }
    }
}
