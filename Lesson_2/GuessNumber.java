public class GuessNumber {

    int answer;

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    private int playerNum;

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void game() {
        while (playerNum != answer) {
            if (playerNum > answer) {
                System.out.println("Ваше число (" + playerNum + ") больше того, что загадал компьютер!");
            }
            if (playerNum < answer) {
                System.out.println("Ваше число (" + playerNum + ") меньше того, что загадал компьютер!");
            }
            break;
        }
    }
}