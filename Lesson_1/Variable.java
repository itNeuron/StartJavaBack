public class Variable {

    public static void main(String[] args) {
        byte coresCpu = 6;
        short maxfrequencyCpu = 4;
        int ram = 16;
        long ssdGb = 811L;
        float displayDiagonal = 15.6F;
        double gpuTi = 1_660;
        char h = 'x';
        boolean like = true;

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
