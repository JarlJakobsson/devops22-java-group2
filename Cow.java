import java.util.Random;

public class Cow implements Animals {
    int milk;

    public Cow(int milkValue) {
        milk = milkValue;
    }

    public static void main(String[] args) {
        Cow shinnyCow = new Cow(100);
        System.out.println(shinnyCow.milk);
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating.");
    }

    @Override
    public void die() {
        System.out.println("Cow is dead...");
    }

}
