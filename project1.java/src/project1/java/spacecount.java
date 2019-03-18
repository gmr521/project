package project1.java;

public class spacecount {
	public static void main(String args[]) {
		 int m=1 ,x,y;
		  String str="my name is      pavan    kalyan  ";
		  x=str.length();
		  for(int i=0;i<str.length();i++)
		  {
			 /* if ((str.charAt(i+' ') >= 'a' && str.charAt(i+' ') <= 'z') ||
					  ((str.charAt(i+' ') >= 'A' && str.charAt(i+' ') <= 'Z')))
			  {
		    m++;
			  }
		  
		  }
		  y=x-m;
		 
		  System.out.println("Number of words="+y);
		 
		 }*/
			  if(str.charAt(i)==' ' && str.charAt(i-1)!=' ')
			  {
				m++;  
			  }
		
}
		  System.out.println(m);}}
