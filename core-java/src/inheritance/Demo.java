package inheritance;

public class Demo implements Cloneable {

	
	
	public static Person getPerson()
	{
		return new Person();
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) {
		
		Address address = new Address("Hyd", "Telangana", "Country");
		Employee e   = new Employee(101,"krishna",30000.00,address); // sub
		//e.setAddress(address);
	   Address ad = e.getAddress();
	   
	   System.out.println(ad);

	   e.details();
	}

}
