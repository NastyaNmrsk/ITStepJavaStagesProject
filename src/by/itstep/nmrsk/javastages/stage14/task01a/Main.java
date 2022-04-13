package by.itstep.nmrsk.javastages.stage14.task01a;

import by.itstep.nmrsk.javastages.stage14.task01a.util.ArrayInitializer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = ArrayInitializer("Input size of array: ");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min: ");
        int max = ArrayInitializer.inputIntValue("Input max: ");
        ArrayInitializer.randomInit(array, min, max);
        int count = ArrayLogic.countNonZeroElements(array);
        String msg = String.format("Count of non zero array elements = %d", count);
        Printer.print("Array: " + Arrays.toString(array));
        Printer.print(msg);
    }
}
