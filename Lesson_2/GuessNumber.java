package StartJava.Lesson_2;

public class GuessNumber {
    int answer;

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public boolean game(int playerNum) {

        if (playerNum > answer) {
            System.out.println("Ваше число (" + playerNum + ") больше того, что загадал компьютер!");
            return false;
        } else if (playerNum < answer) {
            System.out.println("Ваше число (" + playerNum + ") меньше того, что загадал компьютер!");
            return false;
        } else {
            System.out.println("Поздравляем, Вы одержали величайшую победу всех времён и народов!");
            return true;
        }
    }
}