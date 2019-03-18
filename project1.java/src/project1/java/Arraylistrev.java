package project1.java;
import java.io.*; 
import java.util.*; 
public class Arraylistrev {
	
	  
	
	    public static void main(String[] args) 
	    { 
	  
	        ArrayList<Integer> mohan = new ArrayList<Integer>(); 
	  
	       
	        mohan.add(new Integer(9)); 
	        mohan.add(new Integer(145)); 
	       mohan.add(new Integer(878)); 
	       mohan.add(new Integer(343)); 
	       mohan.add(new Integer(5)); 
	        System.out.print("Elements before reversing: "); 
	        System.out.print(mohan); 
	  
	     
	        Collections.reverse(mohan); 
	        System.out.print("\nElements after reversing: "); 
	        System.out.print(mohan); 
	    } 
	  
	   
	    public static void printElements(ArrayList<Integer> alist) 
	    { 
	        for (int i = 0; i < alist.size(); i++) { 
	            System.out.print(alist.get(i) + " "); 
	        } 
	    } 
	} 

