package Practice;

public class BillAmount {
	
	int billId;
	int customerId;
	double discount;
	double billAmount;
	
	public BillAmount(int billId, int customerId, double discount, double billAmount)
	{
		this.billId=billId;
		this.customerId=customerId;
		this.discount=discount;
		this.billAmount=billAmount;
	}
	

	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public void discountBill()
	{
		double discountBillAmount = billAmount-(billAmount*(discount/100));
		System.out.println("The Discount Bill Amount is :" +discountBillAmount);
	}


	public static void main(String[] args) 
	{
		BillAmount b = new BillAmount(1001,101,2.0,199.99);
		System.out.println("The Bill Id is:" +b.getBillId());
		System.out.println("The customer Id is: " +b.getCustomerId());
		System.out.println("The discount is: " +b.getDiscount());
		System.out.println("The bill Amount is: " +b.getBillAmount());
		b.discountBill();
		
		BillAmount b1 = new BillAmount(1002,102,4.0,210.5);
		System.out.println("The Bill Id is:" +b1.getBillId());
		System.out.println("The customer Id is: " +b1.getCustomerId());
		System.out.println("The discount is: " +b1.getDiscount());
		System.out.println("The bill Amount is: " +b1.getBillAmount());
		b.discountBill();
		

	}

}
