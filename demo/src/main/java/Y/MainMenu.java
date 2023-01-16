package Y;

import java.util.Scanner;

public class MainMenu {

    public static void runMenu(Player player, MilkStore animalStore) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Main.clearScreen();
            System.out.println("Bucket = " + player.getBucket() + " / " + player.getBucketsize() + " Milk.");
            System.out.println("\n1. Milk your " + player.bestAnimal().getName());
            System.out.println("2. Buy animal");
            System.out.println("3. Upgrade milking skill. Price: " + player.getBucketsize()/2 +" milk.");
            System.out.println("4. Upgrade bucket size. Price: " + player.getBucketsize() + " milk.");
            System.out.println("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.milkAnimal(player.getAnimalList().get(player.getAnimalsLen() - 1));
                    break;
                case 2:
                    animalStore.openShop(player);
                    break;
                case 3:
                    player.upgradeMilkingSkill();
                    break;
                case 4:
                    player.upgradeBucketSize();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
