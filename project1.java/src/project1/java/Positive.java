package project1.java;

import java.util.Scanner;

public class Positive {
	
	static void myName(int sum)
	{

   if( sum%2==0)
	{
		System.out.println("even"); 
		
		
	}
   else
   {
	   System.out.println("odd");
   }
	
	}
	
	
	public static void main(String args[])
	{
	
		System.out.println("enter a value");
		Scanner s=new Scanner(System.in);
		int sum=s.nextInt();
			myName(sum);
			s.close();
	}
	
}
