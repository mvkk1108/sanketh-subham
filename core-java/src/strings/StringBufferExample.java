package strings;

import java.util.StringTokenizer;

public class StringBufferExample {

	public static void main(String[] args) {


		
		//StringBuffer sb = new StringBuffer("madam");
		//sb.append(" is secure ");
		//sb.insert(0,"java full stack");
		//sb.delete(0, 5);
	//	sb.reverse();
		
		//System.out.println(sb);
		
		String fullname="maddela venkata krishna kumar";
		//fullname.spl
		StringTokenizer st = new StringTokenizer(fullname,"\n");
		
		while(st.hasMoreTokens())
		{
		System.out.println(st.nextToken());
		}
		//System.out.println(st.nextToken());
		

	}

}
