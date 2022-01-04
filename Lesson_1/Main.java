public class Main {
    public static void main(String[] args) {
        String str = "abcdabcd";
        boolean quadric = quadric(str);
        System.out.println(quadric);
    }

    public static boolean quadric(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        int middle = str.length() / 2;
        for (int i = 0; i < middle; i++) {
            char a = str.charAt(i);
            char b = str.charAt(middle+i);
            System.out.println(i + " " + a + " " + b);
            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
