package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark 6");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.98f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        Jaeger сoyoteTango = new Jaeger("Coyote Tango", "Mark 1", "Japan", 85.34f, 2.312f, 5, 7, 4);

        сoyoteTango.setModelName("Coyote Tango");
        сoyoteTango.setMark("Mark 1");
        сoyoteTango.setOrigin("Japan");
        сoyoteTango.setHeight(85.34f);
        сoyoteTango.setWeight(2.312f);
        сoyoteTango.setSpeed(5);
        сoyoteTango.setStrength(7);
        сoyoteTango.setArmor(4);

        System.out.println(jaegerOne);
        System.out.println(сoyoteTango);

        System.out.println(jaegerOne.drift());
        jaegerOne.move();
        System.out.println(jaegerOne.scanKaiju());
        jaegerOne.useAbility();

        System.out.println(сoyoteTango.drift());
        jaegerOne.move();
        System.out.println(сoyoteTango.scanKaiju());
        jaegerOne.useAbility();
    }
}