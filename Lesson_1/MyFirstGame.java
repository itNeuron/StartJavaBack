public class MyFirstGame {

    public static void main(String[] args) {
        int playerNum = 35;
        int hiddenNum = 6;
        while (playerNum != hiddenNum) {
            if (playerNum > hiddenNum) {
                System.out.println(playerNum + " Данное число больше того, что загадал компьютер!");
                System.out.println("   Попробуйте ещё раз!");
                playerNum--;
            }
            else if (playerNum < hiddenNum) {
                System.out.println(playerNum + " Данное число меньше того, что загадал компьютер!");
                System.out.println("   Попробуйте ещё раз!");
                playerNum++;
            }
        }
        System.out.println("Число угаданно. Победа!");
    }
}
