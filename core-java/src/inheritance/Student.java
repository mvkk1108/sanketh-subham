package inheritance;

public class Student extends Person {
	
	
	private int marks;

	
	
	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public Student() {
		super();
	}



	public Student(int id, String name, int marks) {
		super(id, name);
		this.marks = marks;
	}
	
	
	// constructor

	
	//getter and setters
	@Override
	public void details()
	{
		System.out.println( "Id = "+id+" Name = "+name+" Marks = "+marks);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return false;
	}
}
