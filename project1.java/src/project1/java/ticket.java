package project1.java;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of tickets:");;
		Scanner sc= new Scanner(System.in);
		 int ticket=sc.nextInt();
			int counter=100;
			
		for(int i=1;ticket>=1;)
		 {
		     counter=counter-ticket;
			 System.out.println("you have booked" + ticket + "tickets");
			 System.out.println("Available tickets:"+counter);
		 }
		
		
			}
	

}
