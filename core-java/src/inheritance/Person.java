package inheritance;

public  class Person implements Cloneable {

	protected int id;
	protected String name;
	
	protected int m = 70;
	static final int X=90;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	

	public Person(int id) {
		
		this.id = id;
		
	}



	public Person() {
		super();
		
		
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
	
	
	
	public static Person getPerson()
	{
		return new Person();
	}
	
	
	public  void details()
	{
		System.out.println( "Id = "+id+" Name = "+name);
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}



	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called");
		super.finalize();
	}
	
	
	
	
	
	
	/*
	 * @Override public boolean equals(Object obj) { if(obj!=null && obj instanceof
	 * Person) { Person p = (Person) obj; if(this.id == p.id &&
	 * this.name.equals(p.name)) { return true; } } return false; }
	 */
}