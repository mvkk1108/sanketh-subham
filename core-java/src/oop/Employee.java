package oop;

public class Employee {
	
private	int id;
private	String name;
private	double salary;

private static String company="Wipro"; // class level variables

static
{
	System.out.println("static block in employee ");
}

{
	System.out.println("IIB");
}
// constructor
public Employee()
{
	System.out.println("No Arg constructor");
}




public Employee(int id) {

	this.id = id;
	System.out.println("one arg constructor");
}




public Employee(int id, String name) {
this(id);
	//this.id = id; // this is key word
	this.name = name;
	
	System.out.println("two arg constructor");
}



public Employee(int id, String name, double salary) {//
	this(id,name); // this constrcuctor
	// Employee(id);
	//this.id = id;
	//this.name = name;
	this.salary = salary;
	System.out.println("Three arg constructor");
	  
}










public static String getCompany() {
	return company;
}




public static void setCompany(String company) {
	

	Employee.company = company;
}




public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}


public void printDetails()
{
	System.out.println("Id = "+id+" Name = "+name+" Salary = "+salary+" Company = "+company);
}
// setter and setter


}
