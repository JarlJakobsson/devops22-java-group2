package Y;


import java.util.*;


abstract class Main {
    
    // Found solution to clear screen at
    // https://stackoverflow.com/questions/2979383/how-to-clear-the-console

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main( String[] args )
    {
        clearScreen();
        Player player = new Player("Milkman");
        Cow cow = new Cow();
        MilkStore animalStore = new MilkStore();
        player.buyAnimal(cow);
        MainMenu.runMenu(player, animalStore);
    }
}
