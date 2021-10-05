package modularapproach;

public class Demo {

	public static void main(String[] args) {
	
//	boolean status =	Methods.isEven(6);
	System.out.println(Methods.isEven(7));

	int arr[] = {10,2,3,4,17,9 ,8};
	int res = Methods.sum(arr);
	System.out.println(res);
	
int x[] =	Methods.minMax(arr);

for(int x1:x)
	System.out.println(x1);
	}

}
