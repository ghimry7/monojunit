package com.monocept.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer(Board board) {
		this.board = board;
		this.result = result.PROGRESS;
	}

	public ResultType getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}

	public ResultType analyzeResult() {

		horizontalWinCheck();
		verticalWinCheck();
		diagonalWinCheck();

		if (board.isBoardFull() && result != result.WIN) {
			result = result.DRAW;
		}

		return result;

	}

	private void horizontalWinCheck() {
		for (int i = 0; i < board.cell.length; i++) {
			if (board.cell[i].getMark() == board.mark.X || board.cell[i].getMark() == board.mark.O) {
				if (board.cell[i].getMark() == board.cell[i + 1].getMark()
						&& board.cell[i + 1].getMark() == board.cell[i + 2].getMark()) {
					result = result.WIN;
					break;
				}
			}
			i = i + 2;
		}
	}

	private void verticalWinCheck() {
		for (int i = 0; i < (board.cell.length / 3); i++) {
			if (board.cell[i].getMark() == board.mark.X || board.cell[i].getMark() == board.mark.O) {
				if (board.cell[i].getMark() == board.cell[i + 3].getMark()
						&& board.cell[i + 3].getMark() == board.cell[i + 6].getMark()) {
					result = result.WIN;
					break;
				}
			}
		}
	}

	private void diagonalWinCheck() {
		for (int i = 0; i < (board.cell.length / 3); i++) {
			if (board.cell[i].getMark() == board.mark.X || board.cell[i].getMark() == board.mark.O) {
				if (i == 0) {
					if (board.cell[i].getMark() == board.cell[i + 4].getMark()
							&& board.cell[i + 4].getMark() == board.cell[i + 8].getMark()) {
						result = result.WIN;
						break;
					}
				} else if (i == 2) {
					if (board.cell[i].getMark() == board.cell[i + 2].getMark()
							&& board.cell[i + 2].getMark() == board.cell[i + 4].getMark()) {
						result = result.WIN;
						break;
					}
				}
			}
		}

	}
}
