package inheritance;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter class Name");
		
		String className = sc.next();
	Class c =	Class.forName(className);
		
		Object obj = c.newInstance() ;
	
		Person p = (Person) obj;
		p.details();
		
	}

}
