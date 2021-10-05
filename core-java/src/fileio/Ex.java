package fileio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//d:\emp.txt
public class Ex {
// \n \t \e
	public static void main(String[] args) throws IOException {
		
	// logical file object over the physical file
		//File f = new File("E:\\Online Trainings\\sanket-shubham\\io\\emp.txt");
		File f = new File("employeedata");
		if(!f.exists())
		{
			f.mkdir();
		}
		
		
		File f1 = new File(f, "emp.txt");
		if(!f1.exists())
		{
			f1.createNewFile();
		}
		
		
		File f2 = new File("D:\\IIHT");
		
	String[] filenames =	f2.list();
	
	for(String s:filenames)
	{
		System.out.println(s);
	}
	}

}
