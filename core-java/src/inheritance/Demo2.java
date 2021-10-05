package inheritance;

public class Demo2 {

	public static void main(String[] args) {
		Person p = new Person(101,"krishna");
		
		System.out.println(p);
		p = null;

		// call the gc
		System.gc();
	}

}
