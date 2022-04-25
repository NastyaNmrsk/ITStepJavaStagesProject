package by.itstep.nmrsk.javastages.lesson32.task02;


public class NumberLogic {
    public static int sumAllDigits(int number) {
        number = number >= 0 ? number : -number;
        if (number < 10) {
            return number;
        }
        return number % 10 + sumAllDigits(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumAllDigits(123456789));
        System.out.println(sumAllDigits(-123456789));
        System.out.println(sumAllDigits(0));
        System.out.println(sumAllDigits(9));
    }

}

