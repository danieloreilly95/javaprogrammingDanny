package com.lab6.test;

import javax.swing.JFrame;

public class Control 
{
	
	public static void main(String[] args)
	{
		MyScreen newScreen = new MyScreen("Lab6");
		newScreen.setLocation(500,100);
		newScreen.setSize(500,500);
		newScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	

}
