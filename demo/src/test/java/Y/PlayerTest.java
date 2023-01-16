package Y;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PlayerTest {

    Player player = new Player("Milkman");
    Cow cow = new Cow();
    Almond almond = new Almond();

    @Test
    public void milkTest() {
        player.milkAnimal(cow);
        assertEquals(player.getBucket(), 1);
    }

    @Test
    public void upgradeMilkingSkillTest() {
        player.setBucket(5);
        player.upgradeMilkingSkill();
        assertEquals(player.getMilkingSkill(), 2);
    }

    // Tests if bucket will be set to bucket size if getting more milk than bucket
    // size
    @Test
    public void testFullBucket() {
        player.milkAnimal(almond);
        assertEquals(player.getBucket(), player.getBucketsize());
    }

    // Tests if buyAnimal function works
    boolean working = false;

    @Test
    public void testBuyAnimal() {
        player.buyAnimal(cow);

        for (Animal animal : player.getAnimalList()) {
            if (animal.getName() == "Cow") {
                this.working = true;
                assertTrue(this.working);
            }
        }
    }
}
