package com.assignment.test;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;


public class MyScreen2 extends JFrame implements ActionListener

	{
		
		JButton button1;
		JLabel myLabel1;
		JTextField text1;
	
		
		//Constructors
		public MyScreen2(String title)
		{
			super(title);
			setLayout(new FlowLayout());
			myLabel1 = new JLabel("Enter a file name");
			add(myLabel1);
			myLabel1.setLocation(40,100);
			
			text1 = new JTextField("Enter a file ");
			add(text1);
			text1.setColumns(20);
	
			button1 = new JButton("Click here");
			button1.addActionListener(this);
			add(button1);
			
			
			setVisible(true);
			
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JOptionPane.showMessageDialog(this, "My Assignment");
			
		}

	}

