package com.monocept.model;

public class Game {
	private Player currentPlayer;
	private Player[] players;
	private Board board;
	private ResultAnalyzer analyzer;
	private ResultType result = ResultType.PROGRESS;
	private MarkType mark;

	public Game(Player[] players, Board board, ResultAnalyzer analyzer) {
		this.players = players;
		this.board = board;
		this.analyzer = analyzer;
		currentPlayer = this.players[0];
		this.players[0].setMark(mark.X);
		this.players[1].setMark(mark.O);
	}

	

	public void play(int loc) {
		board.setCellMark(loc, currentPlayer.getMark());
		if(analyzer.analyzeResult()!=result.WIN) {
		switchCurrentPlayer();
		}
	}

	private void switchCurrentPlayer() {
		if (currentPlayer.equals(players[0])) {
			currentPlayer = players[1];
		} else {
			currentPlayer = players[0];
		}
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}
}
