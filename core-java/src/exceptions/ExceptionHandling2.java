package exceptions;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {

   // Scanner sc=null;

		
		int arr[] = {10,20,30};
		String str = "abc";
		try(Scanner sc =new Scanner(System.in))
		{
			System.out.println("Enter two numbers");
			int a =sc.nextInt();
			int b = sc.nextInt();
			if(b ==0)
			{
				throw new ArithmeticException("Devide by zero");
			}
		int c  = a /b;
		
		//System.out.println(arr[3]);
		System.out.println(c);
		//int x = Integer.parseInt(str);
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		/*
		 * finally { System.out.println("Finally"); sc.close(); }
		 */
		/*catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println(e.getMessage());
		} *//*
			 * catch (ArrayIndexOutOfBoundsException e) {
			 * System.out.println("Index boundry exeeded"); }
			 */

	}

}
