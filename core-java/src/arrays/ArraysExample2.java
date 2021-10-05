package arrays;

public class ArraysExample2 {
// args is command line arguments array
	/*
	 *  1 2 3
	 *  4 5 6
	 *  7 8 8
	 */
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int sum  =0;
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 0; j < arr.length; j++) {
				
				if(i==j)
				{
					sum+=arr[i][j];
				}
			}
		}
		
		System.out.println(sum);
	}

}
// 'a' "a"