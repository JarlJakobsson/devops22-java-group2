package Y;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void upgradeMilkingSkillCantAffor() {
        player.upgradeMilkingSkill();
        assertEquals(player.getMilkingSkill(), 1);
    }

    // Tests if bucket will be set to bucket size if getting more milk than bucket
    // size
    @Test
    public void testFullBucket() {
        player.milkAnimal(almond);
        assertEquals(player.getBucket(), player.getBucketsize());
    }

    @Test
    public void testMilkValue() {
        player.buyAnimal(cow);
        assertEquals(player.getMilkingSkill(), 1);
    }

    // Tests if buyAnimal function works
    @Test
    public void testBuyAnimal() {
        assertTrue("Test failed", player.buyAnimal(cow));
    }

    @Test
    public void testCantAffordAnimal() {
        assertFalse("Test failed", player.buyAnimal(almond));
    }

    @Test
    public void testBuyAnimalAllBought() {
    }

    @Test
    public void testUpgradeBucket() {
        player.setBucket(10);
        player.upgradeBucketSize();
        assertEquals(player.getBucketsize(), 20);
    }

    @Test
    public void testUpgradeBucketAboveMax() {
        player.setBucketsize(1600000);
        player.setBucket(1600000);
        System.out.println(player.getBucket());
        player.upgradeBucketSize();
        assertEquals(player.getBucketsize(), 1600000);
    }

    @Test
    public void upgradeBucketCantAffordTest() {
        player.upgradeBucketSize();
        assertEquals(player.getBucketsize(), 10);
    }

    @Test
    public void testBestAnimal() {
        player.buyAnimal(cow);
        player.setBucket(1000000);
        player.buyAnimal(almond);
        assertEquals(player.bestAnimal(), almond);
    }
}
