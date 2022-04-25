package by.itstep.nmrsk.javastages.lesson32.task0101;

public class NumberLogic {
    public static boolean check(int number, int degree) {
        if (number == degree) {
            return true;
        }
        if (number % degree != 0) {
            return false;
        }
        return check(number / degree, degree);
    }

    public static void main(String[] args) {
        System.out.println(check(20, 2));
    }

}
