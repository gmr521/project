package project1.java;
import java.io.*;
public class Pattern {
	 
	  public static void Pattern(int n) 
	    { 
	        int i, j; 
	  
	        
	        for(i=0; i<n; i++) 
	        { 
	  
	           
	            for(j=0; j<=i; j++) 
	            { 
	               
	                System.out.print("* "); 
	            } 
	  
	        
	            System.out.println(); 
	        } 
	   } 
	  
	   
	    public static void main(String args[]) 
	    { 
	        int n = 3; 
	        Pattern(n); 
	    } 
	} 


