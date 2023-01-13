package Y;

import java.util.Scanner;

public class BuyAnimalMenu {

    public static void runMenu(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Buy a Goat");
            System.out.println("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if ((player.getAnimalsLen() == 1)) {
                        GigaGoat goat = new GigaGoat();
                        System.out.println();
                        player.buyAnimal(goat);
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            break;
        }
    }
}
