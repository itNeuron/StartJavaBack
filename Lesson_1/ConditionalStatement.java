public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 33;
        if (age > 20) {
            System.out.println("Ты становишься мудрее!");
        }

        boolean isMaleGender = true;
        if (isMaleGender == true) {
            System.out.println("На тебе больше ответственности!");
        }
        if (isMaleGender != true) {
            System.out.println("Здоровья тебе!");
        }

        float height = 1.76f;
        if (height < 1.80f) {
            System.out.println("Средний рост!");
        } else {
            System.out.println("Иногда в автобусах неудобно сидеть!");
        }

        char firstLetterName = 'A';
        if (firstLetterName == 'M') {
            System.out.println("Как название остановки метро");
        } else if (firstLetterName == 'I') {
            System.out.println("Ингвар? :)");
        } else {
            System.out.println("С неё начинается алфавит..");
        }
    }
}