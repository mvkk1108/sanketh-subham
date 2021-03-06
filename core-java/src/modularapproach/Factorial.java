package modularapproach;

public class Factorial {
/*
 *  Method Definition
 *  
 *   1) Method Header
 *   
 *   
 *   <access-modifier> <non-access-modifier> returntype methodname(<parameterList>)
 *   
 *   2) Method Body
 *    <access-modifier> <non-access-modifier> returntype methodname(<parameterList>)
 *    {
 *    // logical sequence of  instructions
 *    }
 *    
 *    
 *   1 )
 *    <access-modifier>
 *    
 *      a) public - any where
 *      b) private - in same class
 *      c) protected - in any class of same package and sub class of other packages
 *      d) no modifier (package) - in same package
 *    2) <non-access-modifier>
 *    
 *       static, final, abstract, default , synchronized
 *       
 *     3) returntype - the type data should return when method is called
 *     
 *        a) any primitive(byte, short, int long. float, double, char , boolean)
 *        b ) String
 *        c) any class type
 *        
 *        d) any primitive array
 *        
 *        e) nothing(void)
 *       
 *     4) methodname - valid identifier
 *     
 *      naminConvention:
 *        get()
 *        
 *        getNumber()
 *        
 *        5) <parameterList>
 *        
 *         parameters are used receive input from calling enfv
 *         
 *         any number of parameters including zero
 */
	// method definition
	
	public  static int factorial(int n)
	{
		// body
		
		int fact = 1;
		for(int i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		Factorial f = new Factorial();
	int nfact =	f.factorial(n); // calling method
	System.out.println(nfact);
	}
	
	// NCR 
	
	
	
	

}
