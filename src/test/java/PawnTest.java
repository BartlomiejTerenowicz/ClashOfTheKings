package test.java;

import main.java.Colors;
import main.java.Pawn;
import org.junit.Test;
import static org.junit.Assert.*;

public class PawnTest {

    @Test
    public void randomMove() throws Exception {
        // arrange
        Pawn pawn = new Pawn(5, 6, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 2);

        // assert
        assertFalse(move);
    }

    @Test
    public void randomMoveBack() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 1, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 0);

        // assert
        assertFalse(move);
    }

    @Test
    public void outOfBoardMinusX() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 1, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(-1, 2);

        // assert
        assertFalse(move);
    }

    @Test
    public void outOfBoardPlusX() throws Exception {
        // arrange
        Pawn pawn = new Pawn(7, 7, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(8, 8);

        // assert
        assertFalse(move);
    }

    @Test
    public void outOfBoardMinusY() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 0, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, -1);

        // assert
        assertFalse(move);
    }

    @Test
    public void outOfBoardPlusY() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 7, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 8);

        // assert
        assertFalse(move);
    }

    @Test
    public void makeMoveInCorrectWay() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 1, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 2);

        // assert
        assertTrue(move);
    }

    @Test
    public void makeMoveInCorrectWayTwoFields() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 1, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 3);

        // assert
        assertTrue(move);
    }

    @Test
    public void makeMoveNotCorrectWayTwoFields() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 1, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 2);
        move = pawn.makeMove(0, 4);

        // assert
        assertFalse(move);
    }

    @Test
    public void makeTwoMove() throws Exception {
        // arrange
        Pawn pawn = new Pawn(0, 1, Colors.WHITE);

        // act
        boolean move = pawn.makeMove(0, 2);
        move = pawn.makeMove(0, 4);

        // assert
        assertFalse(move);
    }
}
