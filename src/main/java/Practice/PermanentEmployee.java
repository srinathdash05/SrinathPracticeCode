package Practice;

public class PermanentEmployee extends Employee
{
	double basicPay;
	double hra;
	int exp;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	public void calculateSalary()
	{
		double vp;
		if(exp<3)
		{
			salary=basicPay+hra;
			System.out.println("The salary of permanent  employee with less than 3 year exp is: " +salary);

		}else if(exp>=3 && exp<5)
		{
			vp= (basicPay*5)/100;
			salary = vp+basicPay+hra;
			System.out.println("The salary of permanent  employee with exp between 3 to 5 year is: " +salary);

		}else if(exp>=5 && exp<10)
		{
			vp= (basicPay*7)/100;
			salary = vp+basicPay+hra;
			System.out.println("The salary of permanent  employee with exp between 5 to 7 year is: " +salary);

		}else
		{
			vp= (basicPay*12)/100;
			salary = vp+basicPay+hra;
			System.out.println("The salary of permanent  employee with exp above 12 year is: " +salary);

		}
	}
}
