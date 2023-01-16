package Y;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MilkablesTest {

    // Not used function, but was added for upgrading animals making old animals still relevant
    @Test
    public void upgradeAnimalTest() {
        Almond almond = new Almond();
        almond.upgradeAnimal();
        assertEquals(almond.getMilkValue(), 22);
    }

    // Might be unessesary testing
    @Test
    public void sheepPropertiesTest() {
        Sheep sheep = new Sheep();
        assertEquals("Sheep", sheep.getName());
        assertEquals(3, sheep.getMilkValue());
        assertEquals(1000, sheep.getPrice());
    }

    @Test
    public void goatPropertiesTest() {
        Goat goat = new Goat();
        assertEquals("Goat", goat.getName());
        assertEquals(2, goat.getMilkValue());
        assertEquals(200, goat.getPrice());
    }

    @Test
    public void cowPropertiesTest() {
        Cow cow = new Cow();
        assertEquals("Cow", cow.getName());
        assertEquals(1, cow.getMilkValue());
        assertEquals(0, cow.getPrice());
    }

    @Test
    public void yakPropertiesTest() {
        Yak yak = new Yak();
        assertEquals("Yak", yak.getName());
        assertEquals(5, yak.getMilkValue());
        assertEquals(50000, yak.getPrice());
    }

    @Test
    public void buffaloPropertiesTest() {
        Buffalo buffalo = new Buffalo();
        assertEquals("Buffalo", buffalo.getName());
        assertEquals(4, buffalo.getMilkValue());
        assertEquals(10000, buffalo.getPrice());
    }

    @Test
    public void camelPropertiesTest() {
        Camel camel = new Camel();
        assertEquals("Camel", camel.getName());
        assertEquals(6, camel.getMilkValue());
        assertEquals(100000, camel.getPrice());
    }

    @Test
    public void almondPropertiesTest() {
        Almond almond = new Almond();
        assertEquals("Almond", almond.getName());
        assertEquals(11, almond.getMilkValue());
        assertEquals(1000000, almond.getPrice());
    }

    @Test
    public void coconutPropertiesTest() {
        Coconut coconut = new Coconut();
        assertEquals("Coconut", coconut.getName());
        assertEquals(7, coconut.getMilkValue());
        assertEquals(500000, coconut.getPrice());
    }
}
