package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWritingExample {

	public static void main(String[] args) throws IOException {
	
		
		
		
		//Writer w = new FileWriter("emp.txt",true);
		//char[] data= {'v','e','n','k','a','t','a'};
		//w.write(data, 3, 3);
		//w.write(120);
		
		//w.write(" Java Trainer");
		//w.write("Sanketh");
		//w.append('t');
		//w.flush();
		
		//PrintWriter pw = new PrintWriter(w);
	//	w.close();
		
		
		//pw.println("Java Is object oriened");
		//pw.close();
		
		InputStream  is = new FileInputStream("emp.txt");
		
		byte[] imageData = new byte[is.available()];
		
		is.read(imageData);
		OutputStream os = new FileOutputStream("abc.txt");
		os.write(imageData);
		os.close();
		
		

	}

}
