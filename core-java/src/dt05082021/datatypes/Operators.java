package dt05082021.datatypes;

import java.util.Scanner;

public class Operators {
	/*
	 *  Arithmetic
	 *  +,-, * ,/, %, ++, -- /// binary
	 *  +=,-=,*=,/=(short hand)
	 *  a - 3
	 *  b =4
	 *   a + b = 7
	 *  
	 *  
	 *  relational
	 *  > < <= , >= , == !=
	 *   a > b boolean 
	 *   true / false
	 *  logical
	 *  
	 *  && , ||  !
	 *  
	 *  int a = 9;
	 *  int b = 17
	 *  int c = 8;
	 *  a > b  &&  a > c logical expression , boolean
	 *   t   && t  = t
	 *   t && f = f
	 *   f && t = f
	 *   f && f = f
	 *   
	 *   
	 *    a > b  ||  a > c 
	 *    
	 *     t || t = t
	 *     t || f = t
	 *     f || t = t
	 *     f || f = f
	 *     
	 *   !(a>b) = 
	 *   t f
	 *   f t
	 *     
	 */

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();  // 5 5, -5 5
		if( !(number > 0))
		{
		number = -number;
		}
		System.out.println(number);
		
		
	}
}
// 10 11