package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling1 {
	private static int div(int a, int b) throws IOException
	{
		
		File file = new File("f://abc.txt");
		file.createNewFile();// throws keyword
		
		 IOException ioe = new IOException();
		
		
		if(b==0)
		{
			ArithmeticException ae  = new ArithmeticException("Divide by zero");
		throw ioe;
		}
		return a / b;
	}

	
	private void createFile() 
	{
		File file = new File("abc.txt");
		//file.createNewFile();// throws keyword
	}
	
	public static void main(String[] args)  throws IOException {


		
		int a = 90;
		int b = 0;
		int c = div(a,b);
		System.out.println(c);
	}
// try,catch, finally blocks and throw and throws key words
}
