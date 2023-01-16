package Y;

import java.util.Scanner;
import java.util.Random;

/**
 * Animal superclass
 */
abstract class Animal {
    private String name;
    private int milkValue;
    private int price;
    // private int shinyMultiplier = 1;
    // private boolean isShiny = false;

    public Animal() {
        }

    public int getMilkValue() {
        return milkValue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public void upgradeAnimal(int milkValue) {
        setMilkValue(getMilkValue() * 2);
    }
}