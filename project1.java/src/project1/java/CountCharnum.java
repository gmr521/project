package project1.java;

public class CountCharnum {
	
	    static void count(String str) 
	    { 
	    	
	        char[] ch = str.toCharArray();
	        int total=0; 
	        for (int i = 0; i < ch.length; i++) 
	        { 
	  
	        	
	            String s = ""; 
	  
	           
	            while (i < ch.length && ch[i] != ' ')
	            { 
	  
	               
	                s = s + ch[i]; 
	                i++; 
	                
	            } 
	  
	            if (s.length() > 0)  {
	                System.out.println(s + "->" + s.length());  
	              
	                total=total+s.length();
	            }
	           
	        } 
	        System.out.println("total no of chars are"+" "+ total);
	    } 
	    public static void main(String[] args) 
	    { 
	        String str = "geeks for geeks hi hello is t this"; 
	        count(str);  
	       
	    } 
	}


