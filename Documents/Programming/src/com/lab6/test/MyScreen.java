package com.lab6.test;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MyScreen extends JFrame implements ActionListener

	{
		
		JButton button1, button2;
		JLabel myLabel1;
		JTextField text1;
		JRadioButton RadioButton1;
		JComboBox ComboBox;
		
		//Constructors
		public MyScreen(String title)
		{
			super(title);
			setLayout(new FlowLayout());
			myLabel1 = new JLabel("DT211/C class");
			add(myLabel1);
			myLabel1.setLocation(20,100);
			
			button1 = new JButton("Click here");
			button1.addActionListener(this);
			add(button1);
			
			button2 = new JButton("Click Here");
			add(button2);
			
			text1 = new JTextField("Write Here");
			add(text1);
			
			RadioButton1 = new JRadioButton();
			add(RadioButton1);
			
			ComboBox = new JComboBox();
			add(ComboBox);
			
			setVisible(true);
			
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JOptionPane.showMessageDialog(this, "MyFirst event!");
			
		}

	}

