package com.assignment.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyMain
{
	   
	   
    private static Scanner newfile;
    static ArrayList<String> textwords = new ArrayList<String>();
    static ArrayList<Integer> counter = new ArrayList<Integer>();
   
    public static void main(String args[]) throws IOException 
    {
        Scanner Input = new Scanner(System.in);
        String textFile;
        textFile = Input.nextLine();
       
        //Opens the file from user input
        try 
        {
            System.out.println(textFile);
            newfile = new Scanner(new File(textFile));
            readFile();
        }//end try
        catch (Exception e) 
        {
            //Error message stuff goes here
        }//end catch
       
        Input.close();
        newfile.close();
    }//end main
 
    public static void readFile()
    {
        String keep;
        String words;
        int searches;
        boolean newWords;
       
        //Load just the first word in to get started
        keep = newfile.next();
        keep = keep.replaceAll("[^a-zA-Z]+", "");
        keep = keep.toLowerCase();
        textwords.add(keep);
        counter.add(1);
       
        //While there are still words in the file
        while(newfile.hasNext()) 
        {
            //Reads in word, removes all but the letters and converts to lowercase
        	keep = newfile.next();
        	words = keep.replaceAll("[^a-zA-Z0-9]+", "");
        	words = words.toLowerCase();
           
            searches = 0;
            newWords = true;
           
            //Goes through the words ArrayList
            for (String string : textwords)
            {
                //If the word was found somewhere in the ArrayList, increment and say that it was found
                if (words.equals(string))
                {
                    Integer values = counter.get(searches);
                    values++;
                    counter.set(searches, values);
                    newWords = false;
                }//end if
                searches++;
            }//end for
           
            //If the word was not found in the ArrayList
            if (newWords) 
            {
                textwords.add(words);
                counter.add(1);
            }//end if
        }//end while
       
        Collections.sort(counter);
        Collections.reverse(counter);
        textwords.remove("a");
        //Print results
        for (int i = 0;i<10;i++)
        {
        	
            System.out.println(textwords.get(i) + ": " + counter.get(i));
        }//end for
        
        
        
        
    }//end readFile()
}//end MyMain
