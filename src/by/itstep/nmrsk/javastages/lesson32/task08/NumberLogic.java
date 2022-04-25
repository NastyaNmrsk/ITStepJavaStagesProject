package by.itstep.nmrsk.javastages.lesson32.task08;

public class NumberLogic {
    public static boolean equals(int n, int m) {
        if (n == 0) {
            if (m != 0) {
                return false;
            }
            return true;
        }
        int t = n % 10;
        return equals(n / 10, m - t);

    }

    public static void main(String[] args) throws Exception {
        System.out.println(equals(1234567, 28));
        System.out.println(equals(100, 28));
    }
}
