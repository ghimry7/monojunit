package com.monocept.model;

import java.awt.FlowLayout;

import javax.swing.*;


public class FirstGUI extends JFrame {
	public FirstGUI(){
		
		JLabel l=new JLabel("Hello World");
		JLabel l1=new JLabel("Hello Bikash");
		add(l);
		add(l1);
		
		
		
		setLayout(new FlowLayout());//FlowLayout GridLayout
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
