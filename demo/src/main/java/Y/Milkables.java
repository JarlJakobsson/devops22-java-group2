package Y;

/**
 * Milkables abstract superclass
 */
abstract class Milkables {
    private String name;
    private int milkValue;
    private int price;
 

    public Milkables() {
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

    // Not used but method for old animals to become usefull
    public void upgradeAnimal() {
        setMilkValue(getMilkValue() * 2);
    }
}