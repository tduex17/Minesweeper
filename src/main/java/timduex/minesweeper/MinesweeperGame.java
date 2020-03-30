package timduex.minesweeper;

import lombok.Getter;

/**
 * Minesweeper Game logic.
 */
public class MinesweeperGame {

    @Getter
    private final Cell[][] cellArray;

    @Getter
    private final Gameboard gameboard;

    public MinesweeperGame(final Difficulty difficulty) {
        cellArray = initializeCellArray(difficulty);
        gameboard = new Gameboard(cellArray, difficulty.getNumOfMines());
    }

    private Cell[][] initializeCellArray(final Difficulty difficulty) {
        final int boardWidth = difficulty.getBoardWidth();
        final int boardHeight = difficulty.getBoardHeight();
        final Cell[][] newCellArray = new Cell[boardWidth][boardHeight];
        for(int i = 0; i < boardWidth; i++) {
            for(int j = 0; j < boardHeight; j++) {
                newCellArray[i][j] = new Cell();
            }
        }
        return newCellArray;
    }

}
