package fibHeap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "FibonacciHeap tests")
class FibonacciHeapTest {

    private FibonacciHeap fibonacciHeap;

    @BeforeEach
    void setup() {
        this.fibonacciHeap = new FibonacciHeap();
    }

    @ParameterizedTest(name = "Add tests")
    @ValueSource(ints = {1,2,5,-3,0})
    void fibHeapTest(int value) {
        int fibonacciHeapCount = fibonacciHeap.getCount();
        assertEquals(fibonacciHeapCount + 1,fibonacciHeap.insert(value));
    }

    @ParameterizedTest(name = "Leafs tests")
    @ValueSource(ints = {1,0,4,2,1})
    void fibHeapRootTest(int value) {
        fibonacciHeap.insert(value);
        assertNotNull(fibonacciHeap.getRoot());
    }

    @Test
    void fibHeapQueueTest() {
        fibonacciHeap.insert(2);
        fibonacciHeap.insert(3);
        fibonacciHeap.insert(6);
        assertEquals(2,fibonacciHeap.getRoot().element);
        fibonacciHeap.insert(1);
        assertEquals(1, fibonacciHeap.getRoot().element);
        fibonacciHeap.clear();
        assertNull(fibonacciHeap.getRoot());
        assertTrue(fibonacciHeap.isEmpty());
    }

    @Test
    void fibHeapLeafTest() {
        fibonacciHeap.insert(2);
        fibonacciHeap.insert(3);
        fibonacciHeap.insert(6);
        assertEquals(3, fibonacciHeap.getRoot().getLeft().element);
        assertEquals(6, fibonacciHeap.getRoot().getRight().element);
    }

}