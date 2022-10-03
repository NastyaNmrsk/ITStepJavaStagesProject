package by.itstep.nmrsk.javastages;

public class Test {

    public static long factorial(long n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
