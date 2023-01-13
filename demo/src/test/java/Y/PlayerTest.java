package Y;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PlayerTest 
{
    /**
     * Rigorous Test :-)
     */
    Player player = new Player("Milkman");
    Cow cow = new Cow();

    @Test
    public void milkTest()
    {
        player.milkAnimal(cow);
        assertEquals(player.getMilk(), 1);
    }

    @Test
    public void upgradeMilkingSkill() {
        player.setMilkingSkill(1);
        player.milkAnimal(cow);
        assertEquals(player.getMilk(), 2);
    }
}
