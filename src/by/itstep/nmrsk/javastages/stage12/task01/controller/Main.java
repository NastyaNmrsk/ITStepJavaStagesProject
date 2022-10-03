//package by.itstep.nmrsk.javastages.stage12.task01.controller;
//
//import by.itstep.nmrsk.javastages.stage12.task01.model.logic.ChessPiecesLogic;
//import by.itstep.nmrsk.javastages.stage12.task01.view.Printer;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Printer.print("Input four numbers: ");
//        int x1 = scanner.nextInt();
//        int y1 = scanner.nextInt();
//        int x2 = scanner.nextInt();
//        int y2 = scanner.nextInt();
//
////        boolean result = ChessPiecesLogic.checkRookStep(x1, y1, x2, y2);
////
////        boolean result = ChessPiecesLogic.checkKingStep(x1, y1, x2, y2);
////
////        boolean result = ChessPiecesLogic.checkBishopStep(x1, y1, x2, y2);
////
////        boolean result = ChessPiecesLogic.checkQueenStep(x1, y1, x2, y2);
//
//        boolean result = ChessPiecesLogic.checkKnightStep(x1, y1, x2, y2);
//
//        String msg = (x1 > 0 && x1 < 9 && x2 > 0 && x2 < 9 && y1 > 0 && y1 < 9 && y2 > 0 && y2 < 9) ?
//                (result ? "YES" : "NO") : "Please, input correct data.";
//        Printer.print(msg);
//
//        scanner.close();
//    }
//}
