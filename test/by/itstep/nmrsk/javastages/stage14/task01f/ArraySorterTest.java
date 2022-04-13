package by.itstep.nmrsk.javastages.stage14.task01f;

import org.junit.Test;

import static org.junit.Assert.*

public class ArraySorterTest {
    private static final int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
    @Test
    public void testsortBeforeFirstZeroElement() {
        int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
        int[] expectedArray = {2, 4, 5, 9, 0, 7, 5, 1, 0, 8};

        ArraySorter.sortBeforeFirstZeroElement(ARRAY);
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expectedArray[i]) {
                fail();
            }
        }
    }

    @Test
    public void testsortBeforeLastZeroElement() {
        int[] array = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
        int[] expectedArray = {0, 1, 2, 4, 5, 5, 7, 9, 0, 8};

        ArraySorter.sortBeforeLastZeroElement(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expectedArray[i]) {
                fail();
            }
        }
    }

    @Test
    public void testsortBeforeLastZeroElementWithoutZeroElements() {
        int[] array = {5, 9, 2, 4, 7, 5, 1, 8};
        int[] expectedArray = {5, 9, 2, 4, 7, 5, 1, 8};

        ArraySorter.sortBeforeLastZeroElement(array);
        assertArrayEquals(expectedArray, array);
    }
}