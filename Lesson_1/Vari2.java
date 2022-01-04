public class Vari2 {
    public static void main(String[] args) {
        byte coresCpu = 6;
        short maxfrequencyCpu = 4;
        int ram = 16;
        //заглавную L поставил в конце числа
        long ssdGb = 811L;
        //заглавную F поставил в конце числа
        float displayDiagonal = 15.6F;
        //заглавную D поставил в конце числа
        double gpuTi = 1_660D;
        char h = 'z';
        boolean like = true;

        // знаю что всё превратилось в текст из за сложения со строкой
        System.out.println("CoresCpu = " + coresCpu);
        System.out.println("MaxFrequencyCpu = " + maxfrequencyCpu + "GHz");
        System.out.println("RAM = " + ram + "Gb");
        System.out.println("SSD = " + ssdGb);
        System.out.println("Display = " + displayDiagonal + "'");
        System.out.println("GeForce = " + gpuTi + "Ti");
        System.out.println(h);
        System.out.println("LikeNotebook " + like);
    }
}