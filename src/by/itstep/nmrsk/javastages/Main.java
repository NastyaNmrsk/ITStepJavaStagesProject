package by.itstep.nmrsk.javastages;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }

    private static int count;

    public static long factorial(int number) throws WrongNumberArgsException {
        LOG.debug("count = " + count);
        LOG.debug("method starts with args = ");
        if (number < 0) {
            LOG.debug("Exception.");
            throw new WrongNumberArgsException("Wrong number!");
        }
        long factorial = 1;
        LOG.debug("" + factorial);
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        LOG.info("method ends");
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        try {
            long result = factorial(number);
            String s = String.format("\n%d = %d", number, result);
            System.out.printf(s);
            LOG.info(s);
        } catch (WrongNumberArgsException exception) {
            LOG.warn("Exception", exception);

        }
    }
}

