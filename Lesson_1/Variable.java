package com.company;
import java.lang.String;

public class Variable {

    public static void main(String[] args) {
        byte coresCpu = 6;
        short maxfrequencyCpu = 4;
        int ram = 16;
        long ssdGb = 811L;                                                    //заглавную L поставил в конце числа
        float displayDiagonal = 15.6F;                                        //заглавную F поставил в конце числа
        double gpuTi = 1_660D;                                                //заглавную D поставил в конце числа
        char h = 'z';
        boolean Like = true;
        String os = "Windows_10_64";

        System.out.println("CoresCpu = " + coresCpu);    // знаю что всё превратилось в текст из за сложения со строкой
        System.out.println("MaxFrequencyCpu = " + maxfrequencyCpu + "GHz");
        System.out.println("RAM = " + ram + "Gb");
        System.out.println("SSD = " + ssdGb);
        System.out.println("Display = " + displayDiagonal + "'");
        System.out.println("GeForce = " + gpuTi + "Ti");
        System.out.println(h);
        System.out.println(Like);
        System.out.println(os);
    }

}