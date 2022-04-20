package by.itstep.nmrsk.javastages.task01.controller;

import by.itstep.nmrsk.javastages.task01.model.logic.FibonacciLogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the serial number: ");
        int index = scanner.nextInt();

        System.out.println(FibonacciLogic.getFibonacciLogic(index));
        scanner.close();
    }

}
