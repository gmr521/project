package project1.java;
import java.util.*;
public class Exception_age {

	


		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your age");
			int age=s.nextInt();
			try {
				AgeValidation(age);
			} catch (AgeInvalidException e) {
			
				System.out.println(e.getMessage());
			}

		}
		public static void AgeValidation(int age) throws AgeInvalidException {
			if(age>=18) {
				System.out.println("you can cast your vote");
			}
			else {
				throw new AgeInvalidException("You shld be above 18 to cast your vote");
			}
		}

	}



