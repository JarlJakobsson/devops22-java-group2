package Y;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnimalTest {

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
}
