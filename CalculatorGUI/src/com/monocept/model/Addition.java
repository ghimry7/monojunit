package com.monocept.model;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Addition extends JFrame{
	JTextField t1,t2;
	JButton b1;
	JLabel l1;
	public Addition() {
		Cal();
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void Cal() {
		t1=new JTextField(20);
	    t2=new JTextField(20);
		b1=new JButton("OK");
		l1=new JLabel("Result");
		add(t1);
		add(t2);
		add(b1);
		add(l1);
		
//		ActionListener add=new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int num1=Integer.parseInt(t1.getText());
//				int num2=Integer.parseInt(t2.getText());
//				
//				int result=num1+num2;
//				l1.setText(result+"");
//			}
//		};
//		b1.addActionListener(add);
		
		b1.addActionListener(e->{
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			
			int result=num1+num2;
			l1.setText(result+"");
		});
		
	}

	
}
