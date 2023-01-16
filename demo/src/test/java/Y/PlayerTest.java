package Y;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PlayerTest {
    /**
     * Rigorous Test :-)
     */
    Player player = new Player("Milkman");
    Cow cow = new Cow();
    GigaGoat gigaGoat = new GigaGoat();

    @Test
    public void milkTest() {
        player.milkAnimal(cow);
        assertEquals(player.getBucket(), 1);
    }

    @Test
    public void upgradeMilkingSkill() {
        player.upgradeMilkingSkill(1);
        player.milkAnimal(cow);
        assertEquals(player.getBucket(), 2);
    }

    // Tests if bucket will be set to bucket size if getting more milk than bucket
    // size
    @Test
    public void testFullBucket() {
        player.milkAnimal(gigaGoat);
        assertEquals(player.getBucket(), player.getBucketSize());
    }

    // Tests if buyAnimal function works
    boolean working = false;

    @Test
    public void testBuyAnimal() {
        player.buyAnimal(cow);

        for (Animal animal : player.getAnimalList()) {
            if (animal.getName() == "Cow") {
                this.working = true;
            }
        }
        if (this.working == false) {
            fail("Test failed.");
        }
    }

    @Test
    public void testUpgradeBucketSize() {
        player.upgradeBucketSize();
        assertEquals(player.getBucketSize(), 20);
    }

}
