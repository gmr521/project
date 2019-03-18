package project1.java;

public class test1 {

	public static void main(String[] args) {
		
		
		String test[]= {"venkatesh","mohan","rohith","preetham"};
		for(int i=0;i<test.length;i++) {
			
			for(int j=i+1;j<test.length;j++) {
			    if((test[i]).compareTo(test[j])>0) {
			    	String temp=test[i];
			    	test[i]=test[j];
			    	test[j]=temp;		    	
			    }
			}
			
		}
		
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
	         }
	
	}

			    	
			    
			
			
	