package abstraction;

public class AbDemo {
	
	
	
	
	
	

	public static void main(String[] args) {
		int x =Bank.X;
	
		Bank b ;
		//b = new Bank();
		
		//int roi= b.getROI();
		//System.out.println(roi);
		b = new SBI();
	int	roi= b.getROI();
		System.out.println(roi);
		b = new HDFC();
		roi= b.getROI();
		System.out.println(roi);
		
		b = new ICICI();
		roi= b.getROI();
		System.out.println(roi);
		
		
		// anonymous class
	
		
		Bank bank = new Bank() {

			@Override
			public int getROI() {
				
				return 7;
			}
			
			public void x()
			{
				
			}
		};
		
		
int x3 = bank.getROI();
System.out.println(x3);
	}

}
