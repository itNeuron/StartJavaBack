public class Wolf {

    String name;
    String color;
    String gender;
    int age;
    int weight;

    public void walk() {
        System.out.println("Идёт!");
    }

    boolean sit() {
        System.out.println("Сидит!");
        return true;
    }

    String run() {
        System.out.println("Бежит!");
        return "go";
    }

    public void howl() {
        System.out.println("Воет!");
    }

    public void hunt() {
        System.out.println("Охотится!");
    }
}
