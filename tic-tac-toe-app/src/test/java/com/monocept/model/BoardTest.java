package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	Board board;
	MarkType mark;

	@BeforeEach
	void createObj() {
		board = new Board();
	}

	@Test
	void testCreatedBoard_allNineCellsAreEmpty() {
		assertTrue(isBoardEmpty());
	}
	
	public boolean isBoardEmpty() {
		for (int i = 0; i < board.cell.length; i++) {
			if (board.cell[i].getMark() != mark.Empty) {
				return false;
			}
		}
		return true;
	}

	@Test
	void testSetCellMark_ableToMarkAtSpecificLoaction() {
		board.setCellMark(7, mark.X);
		assertEquals(board.cell[7].getMark(), mark.X);

		board.setCellMark(8, mark.O);
		assertEquals(board.cell[8].getMark(), mark.O);
	}

	@Test
	void testSetCellMark_throwsInvalidLoactionCellException() {
		assertThrows(InavlidCellLocationException.class, () -> board.setCellMark(9, mark.X));
	}

	@Test
	void testIsBoardFull_checkTrueIfBoardIsFull() {
		assertFalse(board.isBoardFull());
	}

	@Test
	void testSetCellMark_throwsCellAlreadyMarkedExcpetionIfCellMarkedTwice() {
		board.setCellMark(1, mark.X);
		assertThrows(CellAlreadyMarkedException.class, () -> board.setCellMark(1, mark.X));

	}

}
