public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 33;
        char maleGender = 'm';
        float height = 1.76f;
        char firstLetterName = 'A';

        if (age > 20) {
            System.out.println("Ты становишься мудрее!");
        }
        if (maleGender == 'm') {
            System.out.println("На тебе больше ответственности!");
        }
        if (maleGender != 'm') {
            System.out.println("Здоровья тебе!");
        }
        if (height < 1.80f) {
            System.out.println("Средний рост!");
        } else {
            System.out.println("Иногда в автобусах неудобно сидеть!");
        }
        if (firstLetterName == 'M') {
            System.out.println("Как название остановки метро");
        } else if (firstLetterName == 'I') {
            System.out.println("Ингвар? :)");
        } else {
            System.out.println("С неё начинается алфавит..");
        }
    }
}