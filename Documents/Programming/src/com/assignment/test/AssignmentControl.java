package com.assignment.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

import com.assignment.test.MyScreen2;

public class AssignmentControl  extends AssignmentMyMain
{
	public static void main(String[] args)
	{
		
		System.out.println("Please enter a text file (.txt) to be read: ");
        Scanner Input = new Scanner(System.in);
        String textFile;
        textFile = Input.nextLine();
        
        
        /*
         * I tried to allow the user to enter a word to exclude from the
         * list of words but the list doesn't print at all when I include the code. 
         * 
        System.out.println("What word would you like to exclude from the list?");
    	String Inputs = Input.nextLine();
    	while(!Input.equals("STOP"))
    	{
    	    textwords.add(Inputs);
    	    Inputs = Input.nextLine();
    	}
        */
       
        //This will open the file from user input
        try 
        {
            System.out.println(textFile);
            newfile = new Scanner(new File(textFile));
            readFile();
        }//end try
        //use an exception if a user enters an incorrect file or file path
        catch (Exception e) 
        {
            System.out.println("ERROR: Please enter an existing .txt file");
        }//end catch
       
        Input.close();
        newfile.close();
   


	
		
		
	
		MyScreen2 newScreen = new MyScreen2("My Assignment");
		newScreen.setLocation(500,100);
		newScreen.setSize(500,400);
		newScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}	
		    	
}	    	
		    	