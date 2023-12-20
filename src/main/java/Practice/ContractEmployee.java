package Practice;

public class ContractEmployee extends Employee
{
	double wages;
	int hours;
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public void calculateSalary()
	{
		salary = wages*hours;
		System.out.println("The salary of contract employee is: " +salary);
	}
	
}
