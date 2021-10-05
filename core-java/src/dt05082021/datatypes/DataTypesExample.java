package dt05082021.datatypes;

import java.util.Scanner;

/*
 *   1) Primitive / primary / pre defined 
 *   
 *   java.lang
 *        a) Numeric :
 *        
 *            1) Integer (byte(1 byte)-Byte, short(2 byte)-Short, int(4 byte) -Integer, long(8 byte)-Long)
 *            
 *            
 *            2) Real(float(4 bytes)-Float, double(8bytes)-Double)
 *            
 *          b) Character (char(2 byes))
 *            
 *          c) Boolean - (boolean 1 - bit) 
 *   2) Non- Primitive /  secondary / derived types
 *   
 *       String 
 *       
 *       Scanner sc;
 */

public class DataTypesExample {

	public static void main(String[] args) {
		
		Scanner sc;
		// p-p
		int num;// declaration
		  num = 123;  
		num =(int) 23.0;
		double num1 =90;//implicit type casting
		
		System.out.println(num);
		System.out.println(num1);
		
		char c =(char) num;
		
		System.out.println(c);
	//	int x = 'c';
	//	System.out.println(x);
		
		  String s1="123.0" ;
		  double x1 = Double.parseDouble(s1);
		  //int x1  =Integer.parseInt(s1);
		 
		  String s2 = "123";
		  int y1 = Integer.parseInt(s2);
		  System.out.println(x1+y1);
		  
		  // p-p
		  //s -p
		  // s-s 
		  
		  // p-Secondary

	}

}
