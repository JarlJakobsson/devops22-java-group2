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

    public void setBucket(int i) {
        this.bucket = i;
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

    public int getBucketsize() {
        return this.bucketSize;
    }

    public void upgradeBucketSize() {
        if (getBucket() == getBucketsize()) {
            this.bucketSize *= 2;
            System.out.println("\nBucket size increased to " + getBucketsize());
            this.bucket = 0;
        }
        else {
            System.out.println("\nYou can't afford that.");
        }
    }

    public int getMilkingSkill() {
        return this.milkingSkill;
    }

    public void upgradeMilkingSkill() {
        {
            if (getBucket() >= (getBucketsize()/2)) {
                this.milkingSkill += 1;
                System.out.println("\nMilking skill increased to: " + getMilkingSkill());
                this.bucket -= (getBucketsize()/2);
            } else {
                System.out.println("\nYou can't afford that.");
            }
        }

    }

    public void milkAnimal(Animal animal) {
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

    public Animal bestAnimal () {
        Animal bestAnimal = getAnimalList().get(0);
        for (Animal animal : getAnimalList()) {
            if (animal.getMilkValue() > bestAnimal.getMilkValue()) {
                bestAnimal = animal;
            }
        }
        return bestAnimal;
    }

    public boolean buyAnimal(Animal animal) {
        Scanner scanner = new Scanner(System.in);
        if (getBucket() >= animal.getPrice()) {
            this.ownedAnimals.add(animal);
            Main.clearScreen();
            setBucket(getBucket() - animal.getPrice());
            System.out.println("You bought a " + animal.getName());
            scanner.nextLine();
            return true;
        } else {
            Main.clearScreen();
            System.out.println("You can't afford that.");
            scanner.nextLine();
            return false;
        }
    }

}
