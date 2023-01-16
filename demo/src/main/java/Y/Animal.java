package Y;

import java.util.Random;

import javax.xml.transform.Source;

/**
 * Animal superclass
 */
abstract class Animal {
    private String name;
    // private boolean isShiny = false;
    private int milkValue = 1;

    public Animal() {
        // Random rand = new Random();
        // int chanceOfShiny = rand.nextInt(2);
        // System.out.println(chanceOfShiny);
        // if (chanceOfShiny == 1) {
        // this.isShiny = true;
        // System.out.println("Wow! You got a shiny");
        // this.milkValue = milkValue * 2;
        // System.out.println(this.milkValue);
        // } else {
        // System.out.println("You got a normal milk value");
        // }

    }

    // public boolean getIsShiny() {
    // return isShiny;
    // }

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
