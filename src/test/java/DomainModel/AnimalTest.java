package DomainModel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Animal test")
class AnimalTest {

    @Test
    void checkIsAlive(){
        Fauna f = new Fauna();
        f.addAnimal(new Animal("sobaka", 20, true, false));
        Planet planet = new Planet(false, true, false, "Pluto", f);
        assertFalse(planet.isAlive());
    }

    @Test
    void checkIsPredator(){
        Animal a = new Animal("kot", 20, true, true);
        assertTrue(a.getAlive());
        assertTrue(a.getPredator());
    }

    @Test
    void checkName() {
        Animal nanimal = new Animal("Egorich", 19,false,true);
        assertEquals("Egorich",nanimal.getName());
    }
}