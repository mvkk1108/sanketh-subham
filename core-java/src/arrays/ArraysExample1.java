package arrays;

public class ArraysExample1 {

	public static void main(String[] args) {
		
		
		
		int arr[]= {3,6,8,7,5,2,1};
		
		
		
		
		
		for(int x:arr)
		{
			if(x%2!=0)
		System.out.println(x);
		}
		
int key = 6;

for(int i = 0;i<arr.length;i++)
{
	if(arr[i]==key)
	{
		System.out.println(key+" Found in the array at "+i);
	}
}
	}

}
