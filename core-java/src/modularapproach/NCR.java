package modularapproach;

public class NCR {// n!/r!* (n-r)!

	public static void main(String[] args) {
		
		int n = 5;
		int r = 3;
		int nFact =1, rFact = 1,nmrFact = 1, result;
		Factorial f = new Factorial();
	nFact =	f.factorial(n);
	rFact = f.factorial(r);
	nmrFact =f.factorial(n-r);
	result = nFact/ (rFact * nmrFact);
	System.out.println(result);
	

	}

}
