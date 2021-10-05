package oop;
/*
 * 
 *  What is constructor is special method
 *  types
 *   default 
 *   parameterized
 *   
 *   
 * Constructor chaining in same 
 * 
 * this()
 */
public class EmployeeDemo {
	static
	{
		System.out.println("In static block1");
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(10110,"a",2000.00);
		emp.printDetails();
		Employee emp1 = new Employee(10111,"Kumar",1000.00);
		Employee emp2 = new Employee(10112,"sanketh",1500.00);
		Employee emp3 = new Employee(10113,"subham",1600.00);
	String c=	Employee.getCompany();
	Employee.setCompany("Cognizant");
	Employee emp4 = new Employee(10113,"subham",1600.00);
		
		emp1.printDetails();
		emp2.printDetails();
		emp3.printDetails();
		emp4.printDetails();
		

	}
	
	static
	{
		System.out.println("In static block2");
	}

}
