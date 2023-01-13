package Y;

class Cow extends Animal {
    public Cow() {
        setName("Cow");
        setMilkValue(1);
        System.out.println("----YEAH-----");
        System.out.println(this.getMilkValue());
    }
}