package project1.java;
import java.util.*;
public class TestAccPer {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Person p=new Person();
Account a=new Account();
System.out.println("enter the name");
String name=s.next();
System.out.println("enter the age");
int age=s.nextInt();

p.setName( name);
p.setAge(age);

System.out.println(p.getName());
System.out.println(p.getAge());
s.close();
	}

}
