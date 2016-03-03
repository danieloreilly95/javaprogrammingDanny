package com.lab6.test;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyScreen extends JFrame

	{
		
		JButton button1, button2, safebutton, cancelbutton;
		JLabel myLabel1;
		
		//Constructors
		public MyScreen(String title)
		{
			super(title);
			setLayout(new GridLayout());
			myLabel1 = new JLabel("DT211/C class");
			add(myLabel1);
			
			button1 = new JButton("Click here");
			add(button1);
			setVisible(true);
		}

	}

