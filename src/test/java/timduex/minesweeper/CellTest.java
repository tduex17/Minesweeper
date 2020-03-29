package timduex.minesweeper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

    private static final int TEST_NO_SURROUNDING_MINES = 0;
    private static final int TEST_NUM_SURROUNDING_MINES = 1;

    @Test
    public void constructionOfCellShouldReturnDefaultValues() {
        Cell testCell = new Cell();
        assertFalse(testCell.isFlag());
        assertFalse(testCell.isMine());
        assertFalse(testCell.isRevealed());
        assertEquals(0, testCell.getNumOfSurroundingMines());
    }

    @Test
    public void shouldNotPlaceFlagIfCellIsRevealed() {
        Cell testCell = new Cell();
        testCell.reveal();
        testCell.placeFlag();
        assertFalse(testCell.isFlag());
    }

    @Test
    public void shouldPlaceFlagIfCellIsNotRevealed() {
        Cell testCell = new Cell();
        testCell.placeFlag();
        assertTrue(testCell.isFlag());
    }

    @Test
    public void shouldRemoveFlag() {
        Cell testCell = new Cell();
        testCell.placeFlag();
        testCell.removeFlag();
        assertFalse(testCell.isFlag());
    }

    @Test
    public void shouldPlaceMine() {
        Cell testCell = new Cell();
        testCell.placeMine();
        assertTrue(testCell.isMine());
    }

    @Test
    public void shouldRevealCell() {
        Cell testCell = new Cell();
        testCell.reveal();
        assertTrue(testCell.isRevealed());
    }

    @Test
    public void shouldUpdateNumberOfSurroundingMinesIfCellIsNotMine() {
        Cell testCell = new Cell();
        testCell.setNumOfSurroundingMines(TEST_NUM_SURROUNDING_MINES);
        assertEquals(TEST_NUM_SURROUNDING_MINES, testCell.getNumOfSurroundingMines());
    }

    @Test
    public void shouldNotUpdateNumberOfSurroundingMinesIfCellIsMine() {
        Cell testCell = new Cell();
        testCell.placeMine();
        testCell.setNumOfSurroundingMines(TEST_NUM_SURROUNDING_MINES);
        assertEquals(TEST_NO_SURROUNDING_MINES, testCell.getNumOfSurroundingMines());
    }

}
