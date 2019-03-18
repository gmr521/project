
package project1.java;
import java.util.*;


public class Voterid {
	static void checkAge(int age)

	{
	
		
		if(age>18)
		{
			System.out.println("voter id not generated");
		}
		else
		{
			System.out.println("voter id generated");
		}
}


		public static void main(String[] args) {
		
			Scanner s= new Scanner(System.in);
			
			int age=s.nextInt();
			
			checkAge(age);
			s.close();
			
		
		}
			
}



