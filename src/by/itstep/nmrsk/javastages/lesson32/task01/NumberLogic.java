package by.itstep.nmrsk.javastages.lesson32.task01;

public class NumberLogic {


    public static int zero() {
        return 1;
    }

    public static int first() {
        return 1;
    }

    public static int second() {
        return 2 * first();
    }

    public static int third() {
        return 3 * second();
    }

    public static int fourth() {
        return 4 * third();
    }

    public static int fifth() {
        return 5 * fourth();
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }



    public static void main(String[] args) {
        System.out.println(fifth());
    }
}
