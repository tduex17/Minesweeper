package timduex.minesweeper;

import java.util.Random;

/**
 * The Minesweeper game board.
 */
public class Gameboard {

    final private int numOfMinesInGame;

    final private Cell[][] cellArray;

    /**
     * Constructor.
     */
    public Gameboard(final Cell[][] cellArray, final int numOfMinesInGame) {
        this.cellArray = cellArray;
        this.numOfMinesInGame = numOfMinesInGame;
        setupGameBoard();
    }

    /**
     * Sets up the game board for the start of the game.
     */
    private void setupGameBoard() {
        distributeMines(numOfMinesInGame);
    }

    /**
     * Randomly distribute a set number of mines across a game board.
     *
     * @param numOfMinesToPlace number of mines to place in the game board
     */
    private void distributeMines(final int numOfMinesToPlace) {
        final Random random = new Random();
        int minesPlaced = 0;
        while(minesPlaced <= numOfMinesToPlace) {
            int randomXAxis = (int) Math.floor(random.nextDouble() * cellArray.length);
            int randomYAxis = (int) Math.floor(random.nextDouble() * cellArray[0].length);
            if(!cellArray[randomXAxis][randomYAxis].isMine()) {
                cellArray[randomXAxis][randomYAxis].placeMine();
                minesPlaced += 1;
            }
        }
    }

}
