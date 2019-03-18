package project1.java;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		System.out.println("enter a value");
		Scanner s=new Scanner(System.in);
		int days=s.nextInt();
	
switch(days)
{
case 0: 
	System.out.println("sunday");
	break;

case 1: 
	System.out.println("monday");
	break;

case 2: 
	System.out.println("tuesday");
	break;

}
s.close();
}

}
