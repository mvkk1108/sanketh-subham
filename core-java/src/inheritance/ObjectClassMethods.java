package inheritance;

import java.lang.reflect.Constructor;

public class ObjectClassMethods {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Demo d = new Demo();
		d.clone();
		
		Person p = new Person(101,"krishna");
Person p3 =	(Person) p.clone();
		Person p1 = new Person(101,"krishna");
		Person p2 = new Person(101,"Abhi");
		//Person p1 = p;
		// ==
		System.out.println(p.equals(d));
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		Person p4 = Demo.getPerson();
		//System.out.println(p);
		//System.out.println(p.hashCode());
		//System.out.println(p.hashCode());
		
	//Class c =	p.getClass();
	//  Constructor<Person>[] cns= c.getConstructors();
	  
	// System.out.println(cns[2]);
	  
	  
	//System.out.println(p.getClass().getName());
		
		Object obj = new Person();
		//System.out.println(obj instanceof Demo);
		Employee e = new Employee();
		e.clone();
	}

}
/*p.equals(p2)
 * p is this object
 * p2 some object
 * 
 * 1) p2 should not be null
 *   p.equals(null) - false
 *   
 *  2) p2 and p must be same class objects
 */
