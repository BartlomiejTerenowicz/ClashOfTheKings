package main.java;

public class Pawn {
    private int x, y;
    private Colors color;
    private boolean isMoved = false;

    public Pawn(int x, int y, Colors color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Check is move Like this figure
    public boolean makeMove(int xMove, int yMove) {

        if (outOfBoard(xMove,yMove)) {
            return false;
        }

        if (Colors.WHITE.equals(this.color)) {
            // Is not attack
            if (this.x == xMove) {
                if ((yMove - y) == 1) {
                    // is field control by enemy - TO Do
                    return true;
                } else if ((yMove - y) == 2) {
                    if (!isFirstMove()) {
                        makeFirstMove();
                        return true;
                    }
                }
            }
        } else {

        }
        return false;
    }

    private boolean isFirstMove() {
        return isMoved;
    }

    private void makeFirstMove() {
        isMoved = true;
    }

    private boolean outOfBoard(int xMove, int yMove) {
        if ((xMove >= 8) || ((yMove >= 8))) {
            return true;
        }

        if ((xMove < 0) || ((yMove < 0))) {
            return true;
        }

        return false;
    }
}
