package StartJava.Lesson_2;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт!");
        return true;
    }

    public void move() {
        System.out.println("Он прошёл 5 шагов!");
    }

    public String scanKaiju() {
        return "Now othing.";
    }

    public void useAbility() {
        System.out.println("He Attak!!");
    }

    @Override
    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", speed=" + speed +
                ", strength=" + strength +
                ", armor=" + armor +
                '}';
    }
}