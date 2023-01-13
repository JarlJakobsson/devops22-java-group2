package Y;

import java.util.*;

public class Player {
    private String name;
    private int bucket = 0;
    private int bucketSize = 10;
    private int milkingSkill = 1;
    private List<Animal> ownedAnimals = new ArrayList<Animal>();

    public Player(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalList() {
        return this.ownedAnimals;
    }

    public int getAnimalsLen() {
        return ownedAnimals.size();
    }

    public Animal getAnimal(int animalIndex) {
        return this.ownedAnimals.get(animalIndex);
    }

    public int getBucket() {
        return this.bucket;
    }

    public int getBucketSize() {
        return this.bucketSize;
    }

    public void upgradeBucketSize() {
        this.bucketSize *= 2;
        System.out.println("Bucket size = " + this.bucketSize);
    }

    public int getMilkingSkill() {
        return this.milkingSkill;
    }

    public void upgradeMilkingSkill(int upgradeValue) {
        this.milkingSkill += upgradeValue;
    }

    public void milkAnimal(Animal animal) {
        int milk = animal.getMilkValue() * this.milkingSkill;
        if (milk + this.bucket > bucketSize) {
            this.bucket = this.bucketSize;
            System.out.println();
            System.out.println("The bucket is full.");
        } else {
            this.bucket += milk;
            System.out.println(animal.getName() + " have been milked for " + milk + " milk.");
            System.out.println("Milkbucket = " + bucket);
            System.out.println();
        }
    }

    public void buyAnimal(Animal animal) {
        this.ownedAnimals.add(animal);
        System.out.println("You bought a " + animal.getName());
    }

}
