package Y;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainMenu {

    public static void runMenu(Player player, MilkStore milkStore) throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (player.getBucket() == 1500000) {
                System.out.println("You won the game.");
                scanner.nextLine();
                break;
            }
            System.out.println("############### Main Menu ##################");
            System.out.println("Bucket = " + player.getBucket() + " / " + player.getBucketsize() + " Milk.");
            System.out.println("\n[1] Milk your " + player.bestAnimal().getName());
            System.out.println("[2] Buy animal");
            System.out.println("[3] Upgrade milking skill. Price: " + player.getBucketsize() / 2 + " milk.");
            System.out.println("[4] Upgrade bucket size. Price: " + player.getBucketsize() + " milk.");
            System.out.println("[q] Quit");
            System.out.println("############################################");
            System.out.println("Select an option: ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("q")) {
                break;
            }
            int len = choice.length();
            if(MilkStore.intCheck(choice, len)){
                int intChoice = Integer.parseInt(choice);
                switch (intChoice) {
                    case 1:
                        player.milkAnimal(player.getAnimalList().get(player.getAnimalsLen() - 1));
                        break;
                    case 2:
                        milkStore.openShop(player);
                        break;
                    case 3:
                        player.upgradeMilkingSkill();
                        break;
                    case 4:
                        player.upgradeBucketSize();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
