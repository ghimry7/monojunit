package com.monocept.model;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JFrame;

public class MouseEventDemo extends JFrame {
	public MouseEventDemo() {
		mouseMethod();
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mouseMethod() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				
				System.out.println(x+" , "+y);
			}
		});
	}
}
