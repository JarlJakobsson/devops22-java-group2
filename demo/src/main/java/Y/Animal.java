package Y;

/**
 * Animal superclass
 */
abstract class Animal {
    private String name;
    private int milkValue;

    public Animal() {
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