package project1.java;

public class employee {
	
	
private int noEmployees;
private int age;
private String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

private String address;
private int salary;


public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


public int getNoEmployees() {
	return noEmployees;
}

public void setNoEmployees(int noEmployees) {
	this.noEmployees = noEmployees;
}

	public void getEmployeedetails() {
		System.out.println("Name"+getName()+"Age"+getAge()+"Address"+getAddress()+"salary"+getSalary()+"no.of.employees"+getNoEmployees());
	}
}

