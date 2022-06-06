package DomainModel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing character methods")
public class CharacterTest {
    @Test
    void checkReletionships() throws Exception {

        Character chel2 = new Character("chelovek", "green", 70);
        assertFalse(chel2.isBullied());
    }

    @Test
    void checkSelfScream() throws Exception {
        try {
            Character chel = new Character("chelovek", "green", 70);
            assertEquals(chel.getWeight(), 70);
            assertEquals(chel.getName(), "chelovek");

            chel.isBullied();
        } catch (RuntimeException ex) {
            assertEquals("Same person", ex.getMessage());

        }
    }

    @Test
    void checkWeight(){
        try {
            Character chel = new Character("chelovek", "green", -10);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            assertEquals("Не имеешь веса", ex.getMessage());
        }

    }

    @Test
    void checkCharacter() {
        Character c =  new Character("chelovek", "green", -10);
        Character b =  new Character("chelovek", "green", -10);
        c.screamOnSomebody(b);
        assertTrue(c.isBullied());
    }

    @Test
    void exceptionTest() {
        Character c =  new Character("chelovek", "green", -10);
        Character b =  new Character("chelovek1", "green", -10);
        assertThrows(IllegalArgumentException.class, () -> {
            c.screamOnSomebody(b);
        });
    }

}
