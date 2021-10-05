package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import inheritance.Employee;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		//File file  = new File("g://abc.txt");
	//	file.createNewFile();
		System.out.println(10/0);
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter two number");
		 * 
		 * int num1 = sc.nextInt(); int num2 = sc.nextInt();
		 * 
		 * int num3 = num1 / num2;
		 * 
		 * System.out.println(num3); sc.close();
		 */
		
		//int arr[] = {12,13};
		//System.out.println(arr[2]);
	/*	String str = "123a";
		int x = Integer.parseInt(str);
		System.out.println(x);
	*/
		
		//String str=null;
		//System.out.println(str.toUpperCase());
		Employee e = new Employee();
		System.out.println(e.getName().toUpperCase());
	}
}
