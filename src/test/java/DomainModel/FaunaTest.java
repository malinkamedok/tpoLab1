package DomainModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaunaTest {

    @Test
    void basicFaunaTest() {
        Animal a = new Animal("Lexa", 20, false, true);
        Fauna f = new Fauna();
        f.addAnimal(a);
        assertTrue(f.hasFauna());
        assertTrue(f.deleteAnimal(a));
        assertEquals(f.getCountsOfAnimals(), 0);
        assertFalse(f.deleteAnimal(a));
        assertFalse(f.deleteAnimal(null));
    }

}