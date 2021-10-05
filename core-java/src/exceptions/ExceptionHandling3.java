package exceptions;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) throws InvalidAgeException  {
		
		
		
		Employee e = new Employee(101, "kk", 10, 200000);
		System.out.println(e);
		
		
		/*
		 * try(Scanner sc = new Scanner(System.in)) { System.out.println("Enter age");
		 * int age = sc.nextInt(); // if age is not between 18 to 45 then raise(throw)
		 * InvalidAge exception
		 * 
		 * if(age < 18 || age > 45) { InvalidAgeException ageException = new
		 * InvalidAgeException("Invalid Age");
		 * 
		 * throw ageException;
		 * 
		 * } }catch (Exception e) { System.out.println("Err"+e.getMessage()); }
		 */
		
	}

}
