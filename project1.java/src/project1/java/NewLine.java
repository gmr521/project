package project1.java;
import java.util.Scanner;
public class NewLine {
	

	

		public static void main(String[] args){
			
			Scanner s= new Scanner(System.in);
			
			System.out.println("Enter a String:");
			String u = s.nextLine();
			
			for(int i = 0; i <u.length(); i++)
			{
				char letter = u.charAt(i);
				
				System.out.println(letter);
				}
				
		}
	}


