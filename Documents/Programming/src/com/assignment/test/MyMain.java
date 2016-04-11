package com.assignment.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyMain
{
	   
	//This declares that a file is going to be scanned in and creates two array lists, one
	//consisting of integers and the other strings 
    private static Scanner newfile;
    static ArrayList<String> textwords = new ArrayList<String>();
    static ArrayList<Integer> counter = new ArrayList<Integer>();
    
    
   
    public static void main(String args[]) throws IOException 
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
    }//end main
 
    
    //Read the file the user entered
    public static void readFile()
    {
        String keep;
        String words;
        int searches;
        boolean newWords;
       
        //Load just the first word from the file in to start
        keep = newfile.next();
        keep = keep.replaceAll("[^a-zA-Z]+", "");
        keep = keep.toLowerCase();
        textwords.add(keep);
        counter.add(1);
       
        //While the file still contains words the process will still run 
        while(newfile.hasNext()) 
        {
            //Reads in the words from the file and removes everything but the letters
        	//Converts the letters to lowercase
        	keep = newfile.next();
        	words = keep.replaceAll("[^a-zA-Z0-9]+", "");
        	words = words.toLowerCase();
           
            searches = 0;
            newWords = true;
           
            //Goes through the words ArrayList until finished
            for (String string : textwords)
            {
                //If a word was found in the ArrayList increment it and say it was found
                if (words.equals(string))
                {
                    Integer values = counter.get(searches);
                    values++; //a value that is added next to the words
                    counter.set(searches, values);
                    newWords = false;
                }//end if
                searches++;
            }//end for
           
            //If no word was found in the ArrayList
            if (newWords) 
            {
                textwords.add(words);
                counter.add(1);
            }//end if
        }//end while
       
        //sort the arrayList in reverse order and remove any unhelpful words 
        Collections.sort(counter);
        Collections.reverse(counter);
        textwords.remove("a");
        textwords.remove("this");
        textwords.remove("i");
        textwords.remove("to");
        textwords.remove("and");
        textwords.remove("or");
        textwords.remove("of");
        textwords.remove("in");
        textwords.remove("the");
        
        //Print the results of the array list using a for loop  
        for (int i = 0;i<10;i++)
        {
        	
            System.out.println(textwords.get(i) + ": " + counter.get(i));
        }//end for
        
    }//end readFile()
}//end MyMain
