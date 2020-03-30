package timduex.minesweeper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameboardTest {

    private static final int TEST_GAMEBOARD_HEIGHT = MinesweeperConstants.EASY_GAMEBOARD_HEIGHT;
    private static final int TEST_GAMEBOARD_WIDTH = MinesweeperConstants.EASY_GAMEBOARD_WIDTH;
    private static final int TEST_NUM_OF_MINES = MinesweeperConstants.EASY_GAMEBOARD_NUM_OF_MINES;

    @Test
    public void shouldCreateANewGameboard() {
        Cell[][] testCellArray = initializeNewCellArray();
        Gameboard gameboard = new Gameboard(testCellArray, TEST_NUM_OF_MINES);
        assertEquals(Gameboard.class, gameboard.getClass());
    }

    private Cell[][] initializeNewCellArray() {
        Cell[][] newCellArray = new Cell[TEST_GAMEBOARD_WIDTH][TEST_GAMEBOARD_HEIGHT];
        for(int i = 0; i < TEST_GAMEBOARD_WIDTH; i++) {
            for(int j = 0; j < TEST_GAMEBOARD_HEIGHT; j++) {
                newCellArray[i][j] = new Cell();
            }
        }
        return newCellArray;
    }

}
