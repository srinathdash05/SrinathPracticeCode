package Abstract;

public class Tester {

	public static void main(String[] args) 
	{
	
			RRPaymentServices r =new CreditCardPayment(10000.23, 5001);
			r.payBill(15000);
			RRPaymentServices r1 =new CreditCardPayment(10000.23, 5001);
			r1.payBill(0);
			
	}

}
