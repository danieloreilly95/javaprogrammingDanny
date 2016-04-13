package com.assignment.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AssignmentMyMain
{
	   
	//This declares that a file is going to be scanned in and creates two array lists, one
	//consisting of integers and the other strings 
    protected static Scanner newfile;
    static ArrayList<String> textwords = new ArrayList();
    static ArrayList<Integer> counter = new ArrayList();
    
 
    
    //Read the file the user entered
    public static void readFile()
    {
        String keep;
        String words;
        int searches;
        boolean newWords;
       
        //Load just the first word from the file in to start
        //Stores the file and reads it in 
        keep = newfile.next();
        keep = keep.replaceAll("[^a-zA-Z]+", ""); 
        keep = keep.toLowerCase();//converts to lowercase 
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
                    int values = counter.get(searches);
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
        textwords.remove("an");
        
        //Print the results of the array list using a for loop  
        for (int i = 0;i<10;i++)
        {
        	
            System.out.println(textwords.get(i) + ": " + counter.get(i));
        }//end for
        
    }//end readFile()
    
    
}//end MyMain
