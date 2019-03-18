package project1.java;
import java.util.Arrays; 
public class Reverse {
	
	
	public static void main(String[] args){   
	    int[] array1 = {10,20,50,17,20,21};
	  System.out.println("Original : "+Arrays.toString(array1));  
	   for(int i = 0; i < array1.length / 2; i++)
	  {
	    int temp = array1[i];
	    array1[i] = array1[array1.length - i - 1];
	    array1[array1.length - i - 1] = temp;
	  }
	    System.out.println("Reverse : "+Arrays.toString(array1));
	 }
	}

