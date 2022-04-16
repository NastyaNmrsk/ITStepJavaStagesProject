package by.itstep.nmrsk.javastages.stage12.task01.model.logic;


import org.junit.Test;
import static org.junit.Assert.*;


public class ChessPiecesLogicTest {
    @Test
    public void checkRookStepReturnTrue() {
        int x1 = 4, y1 = 4;
        int[][] points = {{1, 4}, {2, 4}, {3, 4}, {5, 4}, {6, 4}, {7, 4}, {8, 4}, {4, 1}, {4, 2}, {4, 3}, {4, 5},
                {4, 6}, {4, 7}, {4, 8}};
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            boolean actual = ChessPiecesLogic.checkRookStep(x1, y1, x2, y2);

            String error = String.format("Error with chess cell: (%d, %d)", x2, y2);
            assertTrue(error, actual);
        }
    }

    @Test
    public void checkKingStepReturnTrue() {
        int x1 = 5, y1 = 3;
        int[][] points = {{4, 2}, {4, 3}, {4, 4}, {5, 2}, {5, 4}, {6, 2}, {6, 3}, {6, 4}};
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            boolean actual = ChessPiecesLogic.checkKingStep(x1, y1, x2, y2);

            String error = String.format("Error with chess cell: (%d, %d)", x2, y2);
            assertTrue(error, actual);
        }
    }

    @Test
    public void checkBishopStepReturnTrue() {
        int x1 = 6, y1 = 4;
        int[][] points = {{3, 1}, {4, 2}, {5, 3}, {8, 2}, {7, 3}, {5, 5}, {4, 6}, {3, 7}, {2, 8}, {7, 5}, {8, 6}};
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            boolean actual = ChessPiecesLogic.checkBishopStep(x1, y1, x2, y2);

            String error = String.format("Error with chess cell: (%d, %d)", x2, y2);
            assertTrue(error, actual);
        }
    }

    @Test
    public void checkQueenStepReturnTrue() {
        int x1 = 6, y1 = 4;
        int[][] points = {{1, 4}, {2, 4}, {2, 8}, {3, 1}, {3, 4}, {3, 7}, {4, 2}, {4, 4}, {4, 6}, {5, 3}, {5, 4},
                {5, 5}, {6, 1}, {6, 2}, {6, 3}, {6, 5}, {6, 6}, {6, 7}, {6, 8}, {7, 3}, {7, 4}, {7, 5}, {8, 2},
                {8, 4}, {8, 6}};
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            boolean actual = ChessPiecesLogic.checkQueenStep(x1, y1, x2, y2);

            String error = String.format("Error with chess cell: (%d, %d)", x2, y2);
            assertTrue(error, actual);
        }
    }

    @Test
    public void checkKnightStepReturnTrue() {
        int x1 = 3, y1 = 6;
        int[][] points = {{1, 5}, {1, 7}, {2, 4}, {2, 8}, {4, 4}, {4, 8}, {5, 5}, {5, 7}};
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            boolean actual = ChessPiecesLogic.checkKnightStep(x1, y1, x2, y2);

            String error = String.format("Error with chess cell: (%d, %d)", x2, y2);
            assertTrue(error, actual);
        }
    }
}
