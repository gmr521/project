package project1.java;
import java.util.*;
public class Stringcount {
	public static void main(String args[])
	{
		int count=0,i=0,j=0;
		
		String[] a= new String[6];
		a[6] = "1a2b3c";
		String[] b= new String[2];
		b[2] ="09";
	
		if(a[i]>=b[j] && a[i]<=b[j+1])
{
	count++;
	System.out.println(count);
	i++;
	j--;
}
		else
		{
			count++;
			System.out.println(count);
			i++;
			j--;
		}
	}

}
