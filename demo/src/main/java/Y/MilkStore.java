package Y;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MilkStore {
    private List<Milkables> buyableAnimals = new ArrayList<Milkables>();
    private String storeName = "The Milkshop";

    public MilkStore() {
        Goat goat = new Goat();
        this.buyableAnimals.add(goat);

        Sheep sheep = new Sheep();
        this.buyableAnimals.add(sheep);

        Buffalo buffalo = new Buffalo();
        this.buyableAnimals.add(buffalo);

        Yak yak = new Yak();
        this.buyableAnimals.add(yak);

        Camel camel = new Camel();
        this.buyableAnimals.add(camel);

        Coconut coconut = new Coconut();
        this.buyableAnimals.add(coconut);

        Almond almond = new Almond();
        this.buyableAnimals.add(almond);
    }

    public List<Milkables> getBuyableAnimalsList() {
        return this.buyableAnimals;
    }

    public String getStorename() {
        return storeName;
    }

    public void removeAnimal(int i) {
        this.buyableAnimals.remove(i);
    }

    static boolean intCheck(String str, int len) {
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) < '1'
                    || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public void openShop(Player player) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = 1;
            System.out.println("############ ANIMAL STORE ############");
            System.out.println("You have: " + player.getBucket() + " milk. \n");
            for (Milkables animal : getBuyableAnimalsList()) {
                System.out.println("[" + i + "]Buy " + animal.getName() + ". Price: " + animal.getPrice());
                i++;
            }
            System.out.println("\nPress q to exit store.");
            System.out.println(("##################################"));
            System.out.println("\nEnter your choice: ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("q")) {
                break;
            }
            int len = choice.length();
            if (intCheck(choice, len)) {
                int intChoice = Integer.parseInt(choice);
                if (intChoice <= getBuyableAnimalsList().size() && getBuyableAnimalsList().size() != 0) {
                    if (player.buyAnimal(buyableAnimals.get(intChoice - 1))) {
                        this.removeAnimal(intChoice - 1);
                        break;
                    } else {
                        break;
                    }

                } else {
                    System.out.println("Thats not an option.");
                    break;
                }
            } else {
                System.out.println("That not a valid input.");
                break;
            }
        }
    }

}