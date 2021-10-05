package modularapproach;

public class Methods {
	
	/*
	 *   which will an integer as argument and should return boolean true if the arg if even false if arg odd
	 */

	public static boolean isEven(int n)
	{
		/*
		 * boolean isEven = false;
		 * 
		 * if(n % 2== 0) isEven = true; return isEven;
		 */
		
		return (n%2==0)?true :false;
	}
	
	
	/*
	 *   write a method sum 
	 *   take an array of integers as argument
	 *   and the sum of all element of the array
	 */
	
	public static int sum(int arr[])
	{
		int sum = 0;
		
		for(int x:arr)
			sum+=x;
		return sum ;
	}
	
	/*
	 *   write a method sum 
	 *   take an array of integers as argument
	 *   and should result an array of two elements which max and min elements array
	 */
	
	public static int[] minMax(int arr[])
	{
		int arr1[] = new int[2];
		
		int minIndex = -1;
		int maxIndex =-1;
		
		int max = arr[0];
		
		for(int i =1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				maxIndex =i;
			}
		
			
		}
		
		int min = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(min<arr[i])
		{
			minIndex = i;
		}
	}	
		
		arr1[0] = arr[minIndex];
		arr1[1] = arr[maxIndex];
		return arr1;
	}
}
