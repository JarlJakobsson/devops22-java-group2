package Y;

abstract class Main {
    

    public static void main( String[] args )
    {
        Player player = new Player("Milkman");
        Cow cow = new Cow();
        player.buyAnimal(cow);
        MainMenu.runMenu(player, player.getAnimal(0));
    }
}
