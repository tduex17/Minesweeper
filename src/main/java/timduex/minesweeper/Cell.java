package timduex.minesweeper;

import lombok.Getter;

/**
 * A cell of the Minesweeper game board.
 */
public class Cell {

    @Getter
    private boolean flag;

    @Getter
    private boolean mine;

    @Getter
    private boolean revealed;

    @Getter
    private int numOfSurroundingMines;

    /**
     * Constructor.
     */
    public Cell() {
        flag = false;
        mine = false;
        revealed = false;
        numOfSurroundingMines = 0;
    }

    /**
     * Place a flag on the cell. Only if the cell is not revealed.
     */
    public void placeFlag() {
        if(!isRevealed()) {
            flag = true;
        }
    }

    /**
     * Remove flag from the cell.
     */
    public void removeFlag() {
        flag = false;
    }

    /**
     * Place a mine in the cell.
     */
    public void placeMine() {
        mine = true;
    }

    /**
     * Reveal the contents of the cell.
     */
    public void reveal() {
        revealed = true;
    }

    /**
     * Update the number of mines that surround a cell. Only if the cell does not contain a mine.
     *
     * @param num number of adjacent mines to the cell
     */
    public void setNumOfSurroundingMines(final int num) {
        if(!isMine()) {
            numOfSurroundingMines = num;
        }
    }

}
