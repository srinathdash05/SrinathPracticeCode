package Abstract;

public class CreditCardPayment extends RRPaymentServices
{
	private static int counter=1000;
	String paymentId;
	double cashBack;
	double balanceDue;
	public String getPaymentId() {
		paymentId = "C"+counter;
		counter = counter+1;
		return paymentId;
	}
	
	
	public double getCashBack() {
		return cashBack;
	}
	public void setCashBack(double cashBack) {
		this.cashBack = cashBack;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}
	CreditCardPayment(double balance, int cId)
	{
		super(balance, cId);
		
	}
	public void payBill(double amount)
	{
		System.out.println("Congratulations!!!, You have successgully made payment of " + amount + "Payment details are : ");
		if (amount > balance)
		{
			System.out.println(" Excess amount entered");
			System.out.println("Customer Id  :" +  cId);
			System.out.println("Payment Id : " + paymentId);
			System.out.println("Previous Due :"  + balance);
			cashBack = amount-balance;
			System.out.println("Remaining Due : " + balanceDue);
			System.out.println("CashBack wallet balance :" + cashBack);
		}else if (amount< balance)
		{
			System.out.println("Insufficunet amount entered");
			System.out.println("Customer Id  :" +  cId);
			System.out.println("Payment Id : " + paymentId);
			System.out.println("Previous Due :"  + balance);
			balanceDue = balance-amount;
			System.out.println("Remaining Due : " + balanceDue);
			System.out.println("CashBack wallet balance :" + cashBack);

		}
	}
	
}
