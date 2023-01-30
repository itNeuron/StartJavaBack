package StartJava.Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        GuessNumber game = new GuessNumber();

        int answer = rnd.nextInt(101);
        game.setAnswer(answer);
        System.out.println("Компьютер загадал число " + game.getAnswer());

        System.out.print("Введите имя первого игрока: ");
        String oneP = sc.nextLine();
        Player playerOne = new Player(oneP);
        System.out.print("Введите имя второго игрока: ");
        String twoP = sc.nextLine();
        Player playerTwo = new Player(twoP);

        String d = "yes";
        while ("yes".equals(d)) {
            int number = 0;
            boolean gameResult;
            do {
                if (number % 2 == 0) {
                    gameResult = chekNum(playerOne, sc, game);
                } else {
                    gameResult = chekNum(playerTwo, sc, game);
                }
                number += 1;

            } while (gameResult != true);
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                d = sc.next();
            } while (!d.equals("yes") && !d.equals("no"));
        }
        System.out.print("Игра окончена. Удачного дня!");
        sc.close();
    }
    private static boolean chekNum(Player playerOne, Scanner sc, GuessNumber game) {
        System.out.print(playerOne.getName() + ", введите своё число: ");
        int playerNum = sc.nextInt();

        System.out.println(playerOne.getName() + ",Вы ввели число  " + playerNum);
        boolean gameResult = game.game(playerNum);
        return gameResult;
    }
}
