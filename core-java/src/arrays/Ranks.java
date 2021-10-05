package arrays;

import java.util.Scanner;

public class Ranks {
	

	public static void main(String[] args) {
		double arr[] = new double[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i =0; i<arr.length;i++)
		{
		arr[i] = sc.nextDouble();
		}
		
		
		
	}

}
/* 
 *  byte - nextByte()
 *  short -nextShort()
 *  int -nextInt()
 *  long - nextLong()
 *  float - nextFloat()
 *  double - nextDouble()
 *  char - no method
 *  boolean - nextBoolean()
 *  
 *  String - next(), nextLine()
 */
