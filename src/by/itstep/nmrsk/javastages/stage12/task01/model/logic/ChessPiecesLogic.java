package by.itstep.nmrsk.javastages.stage12.task01.model.logic;

public class ChessPiecesLogic {
    public static boolean checkRookStep(int x1, int y1, int x2, int y2) {
        return (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2);
    }

    public static boolean checkKingStep(int x1, int y1, int x2, int y2) {
        boolean y = (y2 == (y1 + 1)) || (y2 == (y1 - 1)) || (y2 == y1);
        boolean resultKing = ((x2 == (x1 + 1)) && y) || ((x2 == (x1 - 1)) && y) || ((x2 == x1) && ((y2 == (y1 + 1))
                || (y2 == (y1 - 1))));
        return resultKing;
    }

    public static boolean checkBishopStep(int x1, int y1, int x2, int y2) {
        boolean resultBishop = ((((x2 - x1) == (y2 - y1)) || ((x2 - x1) == (y1 - y2)))
                && ((x2 != x1) && (y2 != y1)));
        return resultBishop;
    }

    public static boolean checkQueenStep(int x1, int y1, int x2, int y2) {
        return checkRookStep(x1, y1, x2, y2) || checkBishopStep(x1, y1, x2, y2);
    }

    public static boolean checkKnightStep(int x1, int y1, int x2, int y2) {
        boolean resultKnight = (((x2 == x1 - 2) && ((y2 == y1 - 1) || (y2 == y1 + 1))) || ((x2 == x1 - 1)
                && ((y2 == y1 - 2) || (y2 == y1 + 2))) || ((x2 == x1 + 1) && ((y2 == y1 - 2) || (y2 == y1 + 2)))
                || ((x2 == x1 + 2) && ((y2 == y1 - 1) || (y2 == y1 + 1)))) && ((x2 != x1) && (y2 != y1));
        return resultKnight;
    }
}
