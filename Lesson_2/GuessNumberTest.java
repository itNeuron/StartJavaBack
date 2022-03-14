import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        Player oneGame = new Player();
        GuessNumber game = new GuessNumber();

        int answer = rnd.nextInt(101);
        game.setAnswer(answer);

        System.out.println("Компьютер загадал число " + game.getAnswer());

        System.out.print("Введите имя первого игрока: ");
        String oneP = sc.nextLine();
        oneGame.setOneP(oneP);
        System.out.print("Введите имя второго игрока: ");
        String twoP = sc.nextLine();
        oneGame.setTwoP(twoP);

        String d = "yes";
        while (d.equals("yes")) {

            int number = 0;
            do {
                if (number % 2 == 0) {
                    System.out.print(oneGame.getOneP() + ", введите своё число: ");
                    int playerNum = sc.nextInt();
                    game.setPlayerNum(playerNum);
                    System.out.println(oneGame.getOneP() + ", Вы ввели число  " + game.getPlayerNum());
                    game.game();

                }
                if (number % 2 == 1) {
                    System.out.print(oneGame.getTwoP() + ", введите своё число: ");
                    int playerNum = sc.nextInt();
                    game.setPlayerNum(playerNum);
                    System.out.print(oneGame.getTwoP() + ",Вы ввели число  " + game.getPlayerNum());
                    game.game();
                }
                number += 1;
            } while (game.getPlayerNum() != game.getAnswer());

            System.out.println("Поздравляем, Вы одержали величайшую победу всех времён и народов!");

            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                d = sc.next();
            } while(!d.equals("yes") && !d.equals("no"));
        }

        System.out.print("Игра окончена. Удачного дня!");
    }
}
