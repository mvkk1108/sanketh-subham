package abstraction;

public abstract class Bank {
	
	
	
	private int accountno;
	
	public final static int X=90;
	
	
	
	public Bank() {
		super();
	}
	public Bank(int accountno) {
		super();
		this.accountno = accountno;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	// withdraw
	public void withdraw() // accno, amount
	{
		System.out.println("Withdraw success");
	}
	// deposit
	public void deposit()
	{
		System.out.println("Deposit success");
	}
	// getRateOfInterest
	
	
	
	public abstract int getROI();
}

// SBI, HDFC , ICICI // 0-100