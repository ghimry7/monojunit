package com.monocept.guitest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TicTacToeUserNameUITest {

	JLabel lblPlayer1;
	JLabel lblPlayer2;
	JTextField txtPlayer1Name, txtPlayer2Name;
	JButton btnStart;
	JFrame f = new JFrame("Tic-Tac-Toe");
	JPanel panel = new JPanel();
	GameUI page;
	String player1;
	String player2;

	@BeforeEach
	void createObj() {

		panel.setBounds(40, 40, 200, 300);

		this.lblPlayer1 = new JLabel("Player 1 name :");
		lblPlayer1.setBounds(50, 100, 100, 40);

		txtPlayer1Name = new JTextField(15);
		txtPlayer1Name.setBounds(170, 100, 200, 40);

		this.lblPlayer2 = new JLabel("Player 2 name :");
		lblPlayer1.setBounds(50, 140, 100, 40);

		txtPlayer2Name = new JTextField(15);
		txtPlayer2Name.setBounds(170, 140, 200, 40);

		btnStart = new JButton("Start Game");

		btnStart.setBounds(100, 350, 200, 40);

		panel.add(lblPlayer1);
		panel.add(txtPlayer1Name);
		panel.add(lblPlayer2);
		panel.add(txtPlayer2Name);
		panel.add(btnStart);

		f.add(panel);
		btnStart.addActionListener(e -> {
			player1 = txtPlayer1Name.getText();
			player2 = txtPlayer2Name.getText();
			page = new GameUI(player1, player2);

			// f.setVisible(false);
			f.dispose();
			page.setVisible(true);

		});

		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Test
	void testPlayer1Name() {
		txtPlayer1Name.setText("Raju");
		assertEquals("Raju", txtPlayer1Name.getText());
	}

	@Test
	void testPlayer2Name() {
		txtPlayer2Name.setText("Raj");
		assertEquals("Raj", txtPlayer2Name.getText());
	}

	@Test
	void testJLabelPlayer1() {
		assertEquals("Player 1 name :", lblPlayer1.getText());
	}

	@Test
	void testJLabelPlayer2() {
		assertEquals("Player 2 name :", lblPlayer2.getText());
	}

	@Test
	void testJPanelBoundsWidth() {
		assertEquals(panel.getWidth(), 200);
	}

	@Test
	void testJPanelBoundsHeight() {
		assertEquals(panel.getHeight(), 300);
	}

	@Test
	void testJButtonClicked() {
		btnStart.doClick();
		assertEquals(page.getClass(),new GameUI(player1,player2).getClass());
	}
	
	@Test
	void testJButtonClicked1() {
		txtPlayer1Name.setText("Raju");
		btnStart.doClick();
		assertEquals(player1, txtPlayer1Name.getText());
	}

	@Test
	void testJButtonClicked2() {
		txtPlayer2Name.setText("Raj");
		btnStart.doClick();
		assertEquals(player2, txtPlayer2Name.getText());
	}
	

	
	
}
