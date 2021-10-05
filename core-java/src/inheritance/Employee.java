package inheritance;

public class Employee extends Person { // isa
	
	private double salary;
private int m = 50;
	private Address address; // has a relation or aggrigation
	
	
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Employee() {
		//super();
	}



	public Employee(int id, String name, double salary) {
	super();
		this.salary = salary;
	}



	public Employee(int id, String name, double salary, Address address) {
		super(id, name);
		this.salary = salary;
		this.address = address;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void details()
	{
		super.details();
System.out.println( "Id = "+id+" Name = "+name+" Salary = "+salary+" m = "+super.m);
	}

	
	@Override
	public boolean equals(Object obj)
	{
		return false;
	}
}
// sub class construct
