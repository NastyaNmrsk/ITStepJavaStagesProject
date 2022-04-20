package by.itstep.nmrsk.javastages.task01.model.logic;

public class FibonacciLogic {
    public static int getFibonacciLogic(int index) {
//        if (index <= 0) {
//            return -1;
//        }
//        int first = 0;
//        int second = 1;
//        if (index == 1 || index == 2) {
//            return index - 1;
//        }
//        int fib = second + first;
//        for (int i = 3; i < index; i++) {
//
//            first = second;
//            second = fib;
//            fib = second + first;
        if (index <= 2) {
            return index - 1;
        }
        return getFibonacciLogic(index - 1) + getFibonacciLogic(index - 2);
    }
//        return fib;

}

//}
