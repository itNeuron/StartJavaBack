public class Calculator {


    private int a;
    private int b;
    String operation;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a < 0 || a > 100) {
            System.out.println("Некорректное число. Введите другое");
        } else {
            this.a = a;
        }
    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b < 0 || b > 100) {
            System.out.println("Некорректное число. Введите другое");
        } else {
            this.b = b;
        }
    }



    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}


