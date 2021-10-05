package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class FileReadingExample {

	public static void main(String[] args) throws IOException {
		
	//	File f = new File("D:\\emp.txt");
		
	//	Reader r = new FileReader(f); // character input stream
		
	//int i =	r.read();
	
	/*while(i!=-1)
	{
	System.out.print((char)i);
i =	r.read();
	}
	
	*/
		
		
	/*
	 * char[] data = new char[(int)f.length()]; r.read(data); //r.read(data, 10,
	 * 10);
	 * 
	 * 
	 * for(char c : data) { System.out.print(c); }
	 */
		Employee[] employees = new Employee[12];
		int empIndex = 0;
		
		BufferedReader in = new BufferedReader(new FileReader(new File("D:\\emp.txt")));
		String line = in.readLine();
		while(line!=null)
		{
			//System.out.println(line);
		String[] empdata =	line.split(",");
			Employee emp =  new Employee(Integer.parseInt(empdata[0]), empdata[1], empdata[2], empdata[3], Double.parseDouble(empdata[4]), Integer.parseInt(empdata[5]));
			//System.out.println(emp);
			employees[empIndex] = emp;
			empIndex++;
			line = in.readLine();
		}
		
		double totalsal = 0.0;
		
		for(Employee e:employees)
		{
			totalsal+=e.getSalary();
		}
		
		System.out.println("Average Salary "+Math.round(totalsal/employees.length));
		/*
		 * Employee maxSalariedEmployee = employees[0];
		 * 
		 * for(int i = 1 ; i<employees.length;i++) {
		 * 
		 * if(maxSalariedEmployee.getSalary() < employees[i].getSalary()) {
		 * maxSalariedEmployee = employees[i]; } }
		 * 
		 * 
		 * System.out.println(maxSalariedEmployee);
		 */
		/*
		 * for(Employee e:employees) { System.out.println(e); }
		 */
	}

}
