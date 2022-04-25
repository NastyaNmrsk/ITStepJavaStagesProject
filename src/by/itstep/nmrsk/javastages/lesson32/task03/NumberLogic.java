package by.itstep.nmrsk.javastages.lesson32.task03;

public class NumberLogic {
    public static int sumAllElements2(int[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception();
        }
        return sumElements(array, 0);
    }

    private static int sumElements(int[] array, int index) {
        if (index == array.length - 1) {
            return array[array.length - 1];
        }
        return array[index] + sumElements(array, ++index);
    }

    public static int sumAllElements(int[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception();
        }
        if (array.length == 1) {
            return array[0];
        }
        int size = array.length - 1;
        int[] temp = new int[array.length - 1];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        return array[size] + sumAllElements(temp);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sumAllElements2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) == 45);

        try {
            sumAllElements(null);
        } catch (Exception exception) {
            System.out.println(true);
        }
    }

}
