package StaticTest;

public class Loan 
{
	int loanNo;
	int accountNo;
	int customerNo,loanDuration;
	float loanAmount, interest;
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public Loan()
	{
		System.out.println(loanCounter++);
	}
	public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest)
	{
		this.accountNo = accountNo;
		this.customerNo=customerNo;
		this.loanAmount=loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		System.out.println(loanCounter++);

	}
	private static int loanCounter;
	public static int getLoanCounter() {
		return loanCounter;
	}
	public static void setLoanCounter(int loanCounter) {
		Loan.loanCounter = loanCounter;
	}
	
	
}
