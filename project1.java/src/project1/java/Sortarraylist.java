package project1.java;
import java.util.*;
public class Sortarraylist {
	
	

		public static void main(String args[]){
		   ArrayList<Integer> arraylist = new ArrayList<Integer>();
		   arraylist.add(11);
		   arraylist.add(2);
		   arraylist.add(7);
		   arraylist.add(3);
		
		   System.out.println("Before Sorting:");
		   for(int counter: arraylist){
				System.out.println(counter);
			}

		
		   Collections.sort(arraylist);

		   
		   System.out.println("After Sorting:");
		   for(int counter: arraylist){
				System.out.println(counter);
			}
		}
	}


