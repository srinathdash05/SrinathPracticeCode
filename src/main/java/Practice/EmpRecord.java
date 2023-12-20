package Practice;

public class EmpRecord {

	public static void main(String[] args) 
	{
		PermanentEmployee pe = new PermanentEmployee();
		ContractEmployee ce = new ContractEmployee();
		pe.setBasicPay(10000);
		pe.setEmpId(101);
		pe.setExp(3);
		pe.setHra(1500);
		pe.setName("Anil");
		pe.calculateSalary();
		ce.setEmpId(102);
		ce.setHours(10);
		ce.setName("Ankit");
		ce.setWages(500);
		ce.calculateSalary();
		
	}

}
