package project1.java;

public class Calculator {
	int first, second;
	 
	/*constructor*/
	Calculator(int first,int second){
		 this.first=first;
		 this.second=second;
		 
	 }
	
	int addition()
	{
		return first+second;
	}
	int subtraction()
	{
		return first-second;
	}
	int multiplication()
	{
		return first*second;
	}
	int division()
	{
		
			if(this.second==0) {
				System.out.println("second value cant be zero");
				return 0;
			}else {
				return first/second;
		}
		
	}

}
