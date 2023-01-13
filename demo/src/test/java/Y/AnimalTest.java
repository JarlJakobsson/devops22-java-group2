package Y;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AnimalTest {
    /**
     * Rigorous Test :-)
     */
    Player player = new Player("Milkman");
    Cow cow = new Cow();
    GigaGoat gigaGoat = new GigaGoat();


    // Tests if buyAnimal function works
    boolean working = false;
    @Test
    public void testBuyAnimal() {
        player.buyAnimal(cow);

        for(Animal animal: player.getAnimalList()) {
            if (animal.getName() == "Cow") {
                this.working = true;
            }
        }
        if (this.working == false) {
            fail("Test failed.");
        }
    }

    
}
