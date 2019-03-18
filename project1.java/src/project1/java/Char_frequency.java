package project1.java;

import java.util.Scanner;

public class Char_frequency { 
	      
	    static final int SIZE = 26; 
	        static void printCharWithFreq(String str) 
	    { 
	        
	        int n = str.length(); 
	        int[] freq = new int[SIZE]; 
	        for (int i = 0; i < n; i++) 
	        freq[str.charAt(i) - 'a' ]++; 
	         for (int i = 0; i < n; i++) 
	         { 
                  if (freq[str.charAt(i) - 'a' ] != 0) 
                   { 
                	   		 System.out.print(str.charAt(i)); 
                	   		 System.out.println(freq[str.charAt(i) - 'a' ] + " ");  
                	   		 freq[str.charAt(i) - 'a'] = 0; 
                   } 
	        } 
	    } 

	        public static void main(String args[]) 
	    { 
	    	Scanner s =new Scanner(System.in);
	    	System.out.println("enter a value");
	    	String str =s.next();
	    	printCharWithFreq(str); 
	        s.close();
	    } 
							} 

