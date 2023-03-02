package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setName("Вольфыч");
        wolfOne.setColor("серый");
        wolfOne.setGender("звеерь");
        wolfOne.setAge(-7);
        wolfOne.setWeight(77);

        System.out.println("Name = " + wolfOne.getName());
        System.out.println("Color = " + wolfOne.getColor());
        System.out.println("Gender = " + wolfOne.getGender());
        System.out.println("Age = " + wolfOne.getAge());
        System.out.println("Weight = " + wolfOne. getWeight());
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
        System.out.println("Коканый");
    }
}
