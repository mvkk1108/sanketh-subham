package conditionalstatments;

import java.util.Scanner;
/*
 *  Tokens
 *    basic building blocks of java statements
 *    
 *    Identifiers : 
 *    
 *       names given to packages, classes, interfaces, variables
 *       
 *       valid identifiers : 
 *       a-zA-Z0-9$ _
 *       should start with digit
 *       
 *       Naming Convention
 *       
 *       Class :
 *       every word should start with capital case letter
 *       
 *       HelloWorld
 *       variables
 *       
 *       camel case
 *       sumOfNumbers
 *       get()
 *       getNumbers()
 *       package - all small case letter
 *       
 *       Literals : constants stored variables
 *       
 *       
 *       Numeric Literals
 *          a) Integers(byte,short, int , long)
 *            76
 *          b) Real(float, double) 
 *          90.9
 *          
 *        b) Character Literal(char)
 *              '*' ')' 'a' '9'
 *              
 *         c) boolean Literals(boolean)
 *                 true and false
 *                 
 *         d) String literals
 *         
 *            "krishna", "java"  "java123"
 *           
 *            "a"
 *            
 *            Key words : 
 *            
 *       Data Types
 *       1) primitive
 *            byte, short,int , long
 *            float, double
 *            char
 *            boolean
 *       2) non primitive     
 *       String 
 *       Arrays
 *       Any Class   
 */
public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		
		int abc;
		abc = 90;
		char x='a';
		abc = abc +10;
		boolean status = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("Enter choice\n1.ADD\n2.SUB\n3.DIV\n4.MUL");
		char p = sc.next().charAt(0); // + , - ,/ ,*
		
		/*
		 * if(n>m && n>p) { System.out.println(n+" is greater value"); }else if(m > n &&
		 * m > p) { System.out.println(m+" is greater value"); }else {
		 * System.out.println(p+" is greater value"); }
		 */
		/*
		 * if(p==1) { System.out.println(n+m); }else if(p==2) { System.out.println(n-m);
		 * }else if(p==3) { System.out.println(n/m); }else if(p==4) {
		 * System.out.println(n*m); }else { System.out.println("Invalid Choice"); }
		 */
		switch (p) {
		case '+':
			System.out.println(n+m);
			break;
		case '-':
			System.out.println(n-m);
			break;
		case '/':
			System.out.println(n/m);
			break;
		case '*':
			System.out.println(n*m);
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}
			
	}

}
