package com.monocept.test;

import java.util.Scanner;


import com.monocept.model.*;


public class TicTacToeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Player[] player = new Player[2];

		for (int i = 0; i < player.length; i++) {
			System.out.println("Enter player " + (i + 1) + " Name: ");
			player[i] = new Player(sc.next());
		}

		Board board = new Board();
		ResultAnalyzer resultAnalyze = new ResultAnalyzer(board);
		Game game = new Game(player, board, resultAnalyze);

		while (true) {
			resultAnalyze.analyzeResult();
			if (resultAnalyze.getResult() == ResultType.PROGRESS) {
				System.out.println(
						"Select Position " + game.getCurrentPlayer().getName() + " with " + game.getCurrentPlayer().getMark());
				int pos = sc.nextInt() - 1;
				try {
					game.play(pos);
					disp(board);
				} catch (InavlidCellLocationException e) {
				
				} catch (CellAlreadyMarkedException e) {
			
				}

			}
			if (resultAnalyze.getResult() == ResultType.DRAW) {
				System.out.println("Game Draw");
				System.exit(0);
			}
			if (resultAnalyze.getResult() == ResultType.WIN) {
				System.out.println(game.getCurrentPlayer().getName() + " Wins!!!");
				System.exit(0);
			}

		}

	}

	public static void disp(Board board) {
		for (int i = 0; i < board.getCells().length; i++) {
			System.out.print(board.getCells()[i].getMark() != MarkType.Empty ?board.getCells()[i].getMark() + "|" : " |");
			if (i == 2 || i == 5) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
