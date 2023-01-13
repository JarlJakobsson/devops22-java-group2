package Y;

abstract class Main {
    

    public static void main( String[] args )
    {
        Player player = new Player("Milkman");
        // Cow cow = new Cow();
        Goat goat = new Goat();
        System.out.println("Milk value:" + goat.getMilkValue());
        player.buyAnimal(goat);
        MainMenu.runMenu(player, player.getAnimal(0));
    }
}
