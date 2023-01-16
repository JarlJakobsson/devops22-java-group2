package Y;

class GigaGoat extends Animal {
    public GigaGoat() {
        setName("Goat");
        // setMilkValue(10000000);
        setMilkValue(this.getMilkValue() * 10000);
        System.out.println(this.getMilkValue());
    }
}