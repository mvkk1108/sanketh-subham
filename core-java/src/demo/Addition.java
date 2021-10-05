package demo;

import java.util.Scanner;

import modularapproach.Factorial;

public class Addition extends Factorial {
	
	public static void main(String[] args)
	{
		
		Factorial f = new Factorial();
	    Factorial.factorial(7);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1; // declaration
		num1= sc.nextInt(); // assignment
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		int res = num1 + num2 ; // expression
		
		System.out.println(res); //output statement
		
		
		sc.close();
		
		
		
		
	}

}
