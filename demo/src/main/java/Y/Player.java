package Y;

public class Player {
    private String name;
    private int bucket = 0;
    private int milkingSkill = 1;

    public Player(String name){
        this.name = name;
    }

    public int getMilk() {
        return this.bucket;
    }

    public int getMilkingSkill() {
        return this.milkingSkill;
    }

    public void setMilkingSkill(int upgradeValue){
        this.milkingSkill += upgradeValue;
    }
    
    public void milkAnimal(Animal animal){
        this.bucket += animal.getMilkValue() * this.milkingSkill;
    }



}
