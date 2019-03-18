package project1.java;

import java.util.Scanner;

public class name {
	public static void main(String args[])
	{
		String st;
		int i=0,j=1,m=0,n=0;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      st = sc.nextLine();
	      
	      if(st.charAt(i)==st.charAt(j))
	       
	      {
	    	  j++;
	    	  if(st.charAt(i)!=st.charAt(j)) 
	    	  {
	 	    	 
		    	  m=m+1;
		    	  
		    	  if(m>0)
		    	      {
		    		  System.out.println(st.charAt(j));
		    		 
		    	      }
		    	  j++;
		    	  
		    	
		      }
	      
	    	  else if(st.charAt(i)==st.charAt(j))
	    	  {
	    	  j++;
	      } 
	      }
	      else if(st.charAt(i)!=st.charAt(j)) {
	    	  i++;
	    	  
	    	    if(st.charAt(i)==st.charAt(j))
	    		       
	  	      {
	  	    	  j++;
	  	    	  if(st.charAt(i)!=st.charAt(j)) 
	  	    	  {
	  	 	    	 
	  		    	  m=m+1;
	  		    	  
	  		    	  if(m>0)
	  		    	      {
	  		    		  System.out.println(st.charAt(j));
	  		    		 
	  		    	      }
	  		    	  j++;
	  		    	  
	  		    	
	  		      }
	  	      
	    	  
	      }
	     
	      
	     
	}

}
}

