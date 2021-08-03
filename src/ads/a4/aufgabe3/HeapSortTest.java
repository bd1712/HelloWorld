package ads.a4.aufgabe3;

import ads.a4.InputGenerator;
import ads.a4.SortTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HeapSortTest extends SortTest {

    private HeapSort s;

    @BeforeEach
    void setUp() throws Exception {
        s = new HeapSort();
    }

    @RepeatedTest(10)
    void testCorrectness() {
        int[] a = InputGenerator.randomSequence(25);
        s.sort(a);
        assertTrue(isSorted(a));
    }

}
