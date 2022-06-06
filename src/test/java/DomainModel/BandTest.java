package DomainModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandTest {

    @Test
    void bandBasicTest() {
        Band band = new Band("Ipad_Pahan", new Universe());
        assertTrue(band.conquerePlaner(new Planet(true, false, false, "Superchel228", null)));
        assertFalse(band.conquerePlaner(new Planet(false, false, false, "Superchel228", null)));
    }

}