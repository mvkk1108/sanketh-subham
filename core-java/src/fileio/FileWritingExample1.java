package fileio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileWritingExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

        //  Employee emp = new Employee(101, "krishna", "krishna", "1234567", 200000.00, 29);

          
        // Writer w  = new FileWriter("emp1.txt");
         
        // String empString = emp.getId()+","+emp.getName()+","+emp.getEmail()+","+emp.getMobile()+","+emp.getSalary()+","+emp.getAge();
         
        // w.write(empString);
         
        // w.close();
		
	//	Reader r = new FileReader("emp1.txt");
	//	BufferedReader br = new BufferedReader(r);
//String	line = 	br.readLine();
	//System.out.println(line);	
       // OutputStream os  = new FileOutputStream("emp2.txt");
         
        
      // ObjectOutputStream oos = new ObjectOutputStream(os);
       // os.write(empString.getBytes());
       
      // oos.writeObject(emp);
     //  oos.close();
      
        //os.close();
		
		InputStream is = new FileInputStream("emp2.txt");
		ObjectInputStream ois = new ObjectInputStream(is);
	Employee e =	(Employee) ois.readObject();
	
	System.out.println(e);
	}

}
