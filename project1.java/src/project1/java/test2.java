package project1.java;
 

import java.util.ArrayList;
import java.util.List;

public class test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> a=new ArrayList();
        
		a.add("sunday");
		a.add("monday");
		a.add("tuesday");
		a.add("wednesday");
		
		String temp="";
		for(int i=0;i<a.size()/2;i++) {
			temp= a.get(i);
			a.set(i,a.get(a.size()-1-i));
			a.set(a.size()-1-i, temp);			
				
				}
		System.out.println(a);
	}

}

