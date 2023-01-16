package Y;

import java.util.*;

public class Player {
    private String name;
    private int bucket;
    private int bucketSize = 10;
    private int milkingSkill = 1;
    private List<Milkables> ownedAnimals = new ArrayList<Milkables>();

    public Player(String name) {
        this.name = name;
    }

    public List<Milkables> getAnimalList() {
        return this.ownedAnimals;
    }
    
    public int getAnimalsLen() {
        return ownedAnimals.size();
    }
    
    public Milkables getAnimal(int animalIndex) {
        return this.ownedAnimals.get(animalIndex);
    }
    
    public void setBucket(int i) {
        this.bucket = i;
    }

    public int getBucket() {
        return this.bucket;
    }

    public int getBucketsize() {
        return this.bucketSize;
    }

    public void setBucketsize(int i) {
        this.bucketSize = i;
    }

    public void upgradeBucketSize() {
        if (getBucket() == getBucketsize() && (getBucketsize() * 2) < 160000) {
                setBucketsize(getBucketsize() * 2);
                System.out.println("\nBucket size increased to " + getBucketsize());
                setBucket(0);
        } else {
            System.out.println("\nYou can't afford that or the bucket is fully upgraded.");
        }
    }

    public int getMilkingSkill() {
        return this.milkingSkill;
    }

    public void upgradeMilkingSkill() {
        {
            if (getBucket() >= (getBucketsize() / 2)) {
                this.milkingSkill += 1;
                System.out.println("\nMilking skill increased to: " + getMilkingSkill());
                this.bucket -= (getBucketsize() / 2);
            } else {
                System.out.println("\nYou can't afford that.");
            }
        }

    }

    public void milkAnimal(Milkables animal) {
        int milk = animal.getMilkValue() * this.milkingSkill;
        if (milk + getBucket() > getBucketsize()) {
            setBucket(getBucketsize());
            System.out.println();
            System.out.println("The bucket is full.");
        } else {
            this.bucket += milk;
            System.out.println(animal.getName() + " have been milked for " + milk + " milk.");
            System.out.println("Milkbucket = " + bucket);
            System.out.println();
        }
    }

    public Milkables bestAnimal() {
        Milkables bestAnimal = getAnimalList().get(0);
        for (Milkables animal : getAnimalList()) {
            if (animal.getMilkValue() > bestAnimal.getMilkValue()) {
                bestAnimal = animal;
            }
        }
        return bestAnimal;
    }

    public boolean buyAnimal(Milkables animal) {
        if (getBucket() >= animal.getPrice()) {
            this.ownedAnimals.add(animal);
            setBucket(getBucket() - animal.getPrice());
            System.out.println("You bought a " + animal.getName());
            return true;
        } else {
            System.out.println("You can't afford that.");
            return false;
        }
    }

}
