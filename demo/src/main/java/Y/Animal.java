package Y;

import java.util.Random;

/**
 * Animal superclass
 */
abstract class Animal {
    private String name;
    private boolean isShiny = false;
    private int milkValue = 1;

    public Animal() {
        Random rand = new Random();
        int chanceOfShiny = rand.nextInt(1);
        if (chanceOfShiny == 1) {
            this.isShiny = true;
            System.out.println("Wow! You got a shiny");
            this.milkValue = 2;
        }

        // this.isShiny = 2;
        // System.out.println("Wow! You got a shiny");

    }

    public boolean getIsShiny() {
        return isShiny;
    }

    public int getMilkValue() {
        return milkValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMilkValue(int milkValue) {
        this.milkValue = milkValue;
    }
}