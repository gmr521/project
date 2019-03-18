package project1.java;
import java.util.Scanner;
import java.io.*;
class EvenString{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String test=s.nextLine();
		System.out.println("altered string");
		for(int i=0;i<test.length();i++)
		{
			if(i%2!=0);
			System.out.println(test.charAt(i));
		}
		s.close();
	}
}
 
