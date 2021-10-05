package poly;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		int x = 20, y = 40;
		Addition obj = new Addition();
	//int res  =	obj.add(x,y); // binding - connecting a method call to method definition - static binding or early binding
	
	//System.out.println(res);
	
	  double x1 = 8.0, y1=3.0;
	  
	  
	double res1 =   obj.add(x1,y1); // compile time poly
	
	System.out.println(res1);
	
	int res2 = obj.add("123", "234");
	System.out.println(res2);

	  
	}

}
