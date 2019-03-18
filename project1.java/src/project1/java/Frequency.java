package project1.java;

public class Frequency {
	

	    public static void main(String[] args) {
	        String str = "THIS website is awesome.";
	     str=str.toLowerCase();
	      
	        for(int i= 0; i < str.length(); i++) {
	        	  int frequency = 0;int count=0;
		        for(int j= 0; j < str.length(); j++) {
	            if(str.charAt(i) == str.charAt(j)) {
	            	 for(int k= 0; k < str.length(); k++) {
	            		 if(str.charAt(i) == str.charAt(i+1))	 {
	            			 count=count++;
	            		 }
	            	 }
	            	
	               
	                frequency++;
	            }
	        }

	       if(str.charAt(i)!=' ') {
	    	   
	    	   System.out.println("Frequency of " + str.charAt(i) + " = " + frequency);
	    	   System.out.println("count " + str.charAt(i) + " = " + count);
	    	   
	       }
	    }
	}

}