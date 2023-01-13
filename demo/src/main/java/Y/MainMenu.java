package Y;

import java.util.Scanner;

public class MainMenu {

    public static void runMenu(Player player, Animal cow) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Milk animal");
            System.out.println("2. Buy animal");
            System.out.println("3. Upgrade milking skill.");
            System.out.println("4. Upgrade bucket size.");
            System.out.println("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.milkAnimal(player.getAnimalList().get(player.getAnimalsLen() - 1));
                    break;
                case 2:
                    BuyAnimalMenu.runMenu(player);
                    break;
                case 3:
                    player.upgradeMilkingSkill(1);
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
