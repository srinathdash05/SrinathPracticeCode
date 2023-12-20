package Abstract;

 abstract class RRPaymentServices 
{
	double balance;
	int cId;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public 
RRPaymentServices(double balance, int cId)
{
	this.balance=balance;
	this.cId=cId;
}
	public abstract void payBill(double amount);
	
}
