package com.monocept.model;

public class Board {
	MarkType mark;
	Cell[] cell = new Cell[9];

	public Board() {
		for (int i = 0; i < cell.length; i++) {
			cell[i] = new Cell(mark.Empty);
		}
	}

	public boolean isBoardFull() {
		int flag = 0;
		for (int i = 0; i < cell.length; i++) {
			if (cell[i].getMark() == mark.Empty) {
				flag = 1;
			}
		}
		if (flag == 1) {
			return false;
		} else
			return true;

	}

	public Cell[] getCells() {
		return cell;
	}

	public void setCellMark(int loc, MarkType mark) {
		if (loc > cell.length - 1) {
			throw new InavlidCellLocationException("Invalid Location");
		}

		if (cell[loc].getMark() == mark.Empty) {
			cell[loc].setMark(mark);
		} else {
			throw new CellAlreadyMarkedException("Cell already marked");
		}
	}

	

}
