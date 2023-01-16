package Y;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AnimalStoreTest {
    Player player = new Player("Milkman");
    Almond almond = new Almond();
    MilkStore animalStore = new MilkStore();

    @Test
    public void createAnimalStoreList() {
        assertEquals(animalStore.getBuyableAnimalsList().size(), 7);
    }
    
    @Test
    public void removeAnimalTest() {
        animalStore.removeAnimal(0);
        assertEquals(animalStore.getBuyableAnimalsList().size(), 6);
    }
    
    @Test
    public void intCheckTestWithDigits() {
        assertTrue(animalStore.intCheck("1234", 4));
    }

    @Test
    public void intCheckTestWithLetters() {
        assertFalse(animalStore.intCheck("abcd", 4));
    }

    @Test 
    public void intCheckTestWith0() {
        assertFalse(animalStore.intCheck("0", 1));
    }


}
