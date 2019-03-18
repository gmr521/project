package project1.java;


import java.util.Scanner;

public class Searchstring {
	
	public static void main(String args[]){
		
		
		String[] str = new String[]{"one", "two", "three", "four", "five"};
		Scanner s =new Scanner(System.in);
    	System.out.println("enter a value");
    	String str1 =s.next();
    	boolean contains = false;
		for(int i=0; i < str.length; i++){
			
			 if(str[i].equalsIgnoreCase(str1)){
 
				contains = true;
				break;
				}
		}
		
		if(contains){
			System.out.println("String array contains String " + str1);
		}else{
			System.out.println("String array does not contain String " + str1);
		}
	
		System.out.println("Do we have the string" + str1 + "? " + contains);
		
	s.close();
 
	}
}
 

