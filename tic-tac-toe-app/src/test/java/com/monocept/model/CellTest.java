package com.monocept.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {
	
	Cell cell;
	MarkType mark;
	
	@BeforeEach
	void createObj() {
		cell=new Cell(mark.Empty);
	}

	@Test
	void testCreatedCellIsEmpty() {
		assertEquals(cell.getMark(),mark.Empty);
	}
	
	@Test
	void testSetMark_checkIfcanMarkX() {
		cell.setMark(mark.X);
		assertEquals(cell.getMark(),mark.X);
	}
	
	@Test
	void testSetMark_checkIfcanMarkO() {
		cell.setMark(mark.O);
		assertEquals(cell.getMark(),mark.O);
	}
	
	@Test
	void testSetMark_throwCellAlreadyMarkedExceptionWhenMarkedTwice() {
		cell.setMark(mark.X);
		assertThrows(CellAlreadyMarkedException.class,()->cell.setMark(mark.O));
	}

}
