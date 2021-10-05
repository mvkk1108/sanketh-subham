package poly;

public class Addition {
	// overloading
	public   int addition(int a, int b)
	{
		return a + b;
	}

	public double add(double a , double b)
	{
		return a + b;
	}
	
	public int add(String a, String b)
	{
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		return c;
	}
}
