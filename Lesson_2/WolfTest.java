public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        String name = "Вольфыч";
        String color = "серый";
        String gender = "звеерь";
        int age = 33;
        int weight = 70;

        System.out.println("name = " + wolfOne.name);
        System.out.println("name = " + wolfOne.color);
        System.out.println("name = " + wolfOne.gender);
        System.out.println("name = " + wolfOne.age);
        System.out.println("name = " + wolfOne.weight);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
