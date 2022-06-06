package mathFunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Arccos Tests")
class ArccosCalcTest {

    private ArccosCalc arccosCalc;

    @BeforeEach
    void setup() {
        this.arccosCalc = new ArccosCalc();
    }


    @ParameterizedTest(name = "Basic test")
    @CsvFileSource(resources = "arrcos_test_cases.csv")
    void asrcosBasicFunctionality(String inputText, String expectedText) {
        double inputValue = Arrays.stream(inputText.replaceAll(" ", "").split(";"))
                .mapToDouble(Double::parseDouble)
                .toArray()[0];
        double expectedValue = Arrays.stream(expectedText.replaceAll(" ", "").split(";"))
                .mapToDouble(Double::parseDouble)
                .toArray()[0];
        double ACCURACY = 1e-3D;
        double functionResult = arccosCalc.arccos(inputValue);
        assertEquals(expectedValue, functionResult, ACCURACY);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1323123.123, 123.03494, 8288.23})
    void arccosExceptionTest(double value) {
        assertThrows(ArithmeticException.class, () -> {
            arccosCalc.arccos(value);
        });
    }

    @ParameterizedTest
    @ValueSource(doubles = {Double.NaN})
    void arrcosNanTest(double value) {
        assertThrows(ArithmeticException.class, () -> {
            arccosCalc.arccos(value);
        });
    }
}
