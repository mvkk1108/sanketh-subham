package strings;

public class StringExample1 {

	public static void main(String[] args) {
	
		// read string which is mobile
		//read string which is vehicle reg number ts-09-hs-8209
		//read string which is email 
		
		String s1 = "java is object oriented and java is secure";
		
		String s2 = new String("java");
		String s3 = "java";
		String s4 = new String("java");
		// comparing == and equals method
		
  System.out.println(s1==s3);
  System.out.println(s2==s4);
  
  System.out.println(s1.equals(s2));
  System.out.println(s1.equalsIgnoreCase(s2));
  
  
  // finding length or size
  System.out.println(s1.length());
  
  // searching
  
  System.out.println(s1.contains("java"));
  System.out.println(s1.indexOf("java",5));
  System.out.println(s1.lastIndexOf("java"));
  
  // character extraction
  
 char c = s1.charAt(0);
 System.out.println(c);
 System.out.println(s1.codePointAt(0));
// s1.sub
 
 String[] str =s1.split(" ");
 
 for(String s:str)
	 System.out.println(s);
 
 // transforming
 String s6 =s1.toUpperCase();
 System.out.println(s1);
 
 
	}
	/*
	 *  How to create Strings in java
	 *  
	 *  1) String Literals
	 *  
	 *        String s1 = "java";
	 *        
	 *  2) Using String constructors
	 *  
	 *     String s2 = new String("java");
	 */

}
