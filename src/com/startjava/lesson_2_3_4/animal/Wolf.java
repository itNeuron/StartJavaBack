package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String name;
    private String color;
    private String gender;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
        if (age < 0) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean sit() {
        System.out.println("Сидит!");
        return true;
    }

    public void walk() {
        System.out.println("Идёт!");
    }

    public String run() {
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
