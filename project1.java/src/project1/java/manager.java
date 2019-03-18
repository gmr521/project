package project1.java;

import java.util.Scanner;

class manager extends employee {
private int NoEmployees; 
	
	
public int getNoEmployees() {
	return NoEmployees;
}
public void setNoEmployees(int noEmployees) {
	NoEmployees = noEmployees;
}



public String getEmployeedetails(String name,int salary,int age,int noEmployees)
{
	return("name"+name+"salary"+salary+"age"+age+"noemployee"+noEmployees);
}
public static void ain(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter employee name");
	String name=s.next();
	System.out.println("enter age");
	int age=s.nextInt();
	System.out.println("enter salary");
	int salary=s.nextInt();
	
	  
	manager m=new manager();
	m.setAge(age);
	m.setSalary(salary);
	m.setName(name);
	
	s.close();
}

}

