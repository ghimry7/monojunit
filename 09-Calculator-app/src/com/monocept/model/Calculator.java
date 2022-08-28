package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator extends JFrame implements ActionListener {

	private String[] symbols = { "AC", "+/-", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "0",
			".", "=" };

	private char operator;
	private JPanel panel = new JPanel(new BorderLayout(5, 5));
	private JPanel btnPanel = new JPanel(new GridLayout(5, 4, 2, 2));
	private JButton[] btns = new JButton[19];
	private JTextArea screen = new JTextArea(2, 40);
	private double firstNum = 0, secondNum = 0;

	public Calculator() {
		Cal();
		setVisible(true);
		setSize(340, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void Cal() {
		setTitle("Calculator");
		screen.setFont(new Font("Times New Roman", Font.BOLD, 30));
		screen.setBackground(Color.GRAY);
		panel.setBackground(Color.black);
		btnPanel.setBackground(Color.black);

		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(symbols[i]);
			btns[i].setBorderPainted(false);
			btns[i].setBackground(Color.BLACK);
			btns[i].setForeground(Color.WHITE);
			btns[i].addActionListener(this);
			btnPanel.add(btns[i]);
		}

		add(panel);
		panel.add(screen, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String op = e.getActionCommand().toString();

		switch (op) {
		case ".":
			if (!screen.getText().contains(".")) {
				screen.setText(screen.getText() + ".");
			}
			break;
		case "0":
			screen.setText(screen.getText() + "0");
			break;
		case "1":
			screen.setText(screen.getText() + "1");
			break;
		case "2":
			screen.setText(screen.getText() + "2");
			break;
		case "3":
			screen.setText(screen.getText() + "3");
			break;
		case "4":
			screen.setText(screen.getText() + "4");
			break;
		case "5":
			screen.setText(screen.getText() + "5");
			break;
		case "6":
			screen.setText(screen.getText() + "6");
			break;
		case "7":
			screen.setText(screen.getText() + "7");
			break;
		case "8":
			screen.setText(screen.getText() + "8");
			break;
		case "9":
			screen.setText(screen.getText() + "9");
			break;
		case "+":
			if (!screen.getText().isEmpty()) {
				firstNum = Double.parseDouble(screen.getText().toString());
				operator = '+';
				screen.setText("");
			}
			break;
		case "-":
			if (!screen.getText().isEmpty()) {
				firstNum = Double.parseDouble(screen.getText().toString());
				operator = '-';
				screen.setText("");
			}
			break;
		case "x":
			if (!screen.getText().isEmpty()) {
				firstNum = Double.parseDouble(screen.getText().toString());
				operator = '*';
				screen.setText("");
			}
			break;
		case "/":
			if (!screen.getText().isEmpty()) {
				firstNum = Double.parseDouble(screen.getText().toString());
				operator = '/';
				screen.setText("");
			}
			break;
		case "AC":
			screen.setText("");
			break;
		case "%":
			screen.setText(String.valueOf(Double.parseDouble(screen.getText()) / 100));
			break;
		case "+/-":
			screen.setText(String.valueOf(Double.parseDouble(screen.getText()) * -1));
			break;

		}

		if (op.equalsIgnoreCase("=")) {
			if (!screen.getText().isEmpty()) {
				secondNum = Double.parseDouble(screen.getText().toString());

				switch (operator) {
				case '+':
					screen.setText(String.valueOf(firstNum + secondNum));
					break;
				case '-':
					screen.setText(String.valueOf(firstNum - secondNum));
					break;
				case '*':
					screen.setText(String.valueOf(firstNum * secondNum));
					break;
				case '/':
					screen.setText(String.valueOf(firstNum / secondNum));
					break;
				}

			}
		}
	}

}
