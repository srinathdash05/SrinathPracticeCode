package StaticTest;

public class LoanTester {

	public static void main(String[] args) 
	{
		Loan ln = new Loan();
		Loan ln1 = new Loan(1234, 786, 50000f,2,2.5f);
		System.out.println(ln1.getAccountNo());
		ln.getLoanCounter();
		ln1.getLoanCounter();


	}

}
