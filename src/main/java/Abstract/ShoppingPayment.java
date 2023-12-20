package Abstract;

public class ShoppingPayment extends RRPaymentServices
{
	private static int counter=1000;
	private String paymentId;
	public String getPaymentId() {
		paymentId = "S"+counter;
		counter = counter+1;
		return paymentId;
	}
	
	
	ShoppingPayment(double balance, int cId)
	{
		super(balance, cId);
		//this.counter=counter;
		//this.paymentId =paymentId;
	}
	public void payBill(double amount)
	{
		System.out.println("Congratulations!!!, You have successgully made payment of " + amount + "Payment details are : ");
		if (amount > balance)
		{
			System.out.println(" Excess amount entered");
		}else if (amount< balance)
		{
			System.out.println("Insufficunet amount entered");
		}
	}
}
