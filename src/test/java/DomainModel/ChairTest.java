package DomainModel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testirovanie stula")
public class ChairTest {

    @ParameterizedTest
    @ValueSource(ints = {19, 11, 99})
    void checkChairDurability(int weight) throws RuntimeException {
        try {
            Chair kreslo = new Chair("DXRacer", 100);
            Character chel = new Character("Tape", "zeleniy", weight);
            kreslo.placeCharacter(chel);
            assertTrue(kreslo.getDurability() > 0 && chel.getWeight() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
