package timduex.minesweeper;

import lombok.Getter;

/**
 * Difficulty configurations for input into the MinesweeperGame.
 */
public enum Difficulty {

    EASY (MinesweeperConstants.EASY_GAMEBOARD_WIDTH,
          MinesweeperConstants.EASY_GAMEBOARD_HEIGHT,
          MinesweeperConstants.EASY_GAMEBOARD_NUM_OF_MINES);

    @Getter
    private final int boardWidth;

    @Getter
    private final int boardHeight;

    @Getter
    private final int numOfMines;

    /**
     * Constructor.
     *
     * @param boardWidth width of the board represented by the number of cells
     * @param boardHeight height of the board represented by the number of cells
     * @param numOfMines number of mines to place inside the game
     */
    Difficulty(final int boardWidth, final int boardHeight, final int numOfMines) {
        this.boardWidth = boardWidth;
        this. boardHeight = boardHeight;
        this.numOfMines = numOfMines;
    }

}
