package by.itstep.nmrsk.javastages.stage14.task01a;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayLogicTest {
    @Test
    public void testcountNonZeroElementsBasic() {
        int[] array = {2, 3, -4, 5, 0, 6, 0, -2};
        int expected = 6;

        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);

    }

    @Test
    public void testcountNonZeroElementsWithoutZeroElements() {
        int[] array = {2, 3, -4, 5, 6, -2};
        int expected = 6;

        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testcountNonZeroElementsWithAllZeroElements() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;

        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testcountNonZeroElementsWithNull() {
        int expected = -1;
        int actual = ArrayLogic.countNonZeroElements(null);
        assertEquals(expected, actual);
    }
    @Test
    public void testcountNonZeroElementsWithN() {
        int expected = -1;
        int actual = ArrayLogic.countNonZeroElements(new int[0]);
        assertEquals(expected, actual);
    }
    @Test
    public void testcountNonZeroElementsOneZero() {
        int[] array = {0};
        int expected = 0;

        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testcountNonZeroElementsOneNoZero() {
        int[] array = {5};
        int expected = 1;

        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }
}
