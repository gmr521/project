package project1.java;
import java.util.*;
public class Palindrome {
	
	public static void main(String args[])
	   {
	      String st, re = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      st = sc.nextLine();
	 
	      int length = st.length();
	 
	      for ( int i = length-1 ; i >= 0; i-- )
	      {
	         re = re + st.charAt(i);
	      }
	      if (st.equals(re))
	         System.out.println(st+" is a palindrome");
	      else
	         System.out.println(st+" is not a palindrome");
	 
	   }
	}


