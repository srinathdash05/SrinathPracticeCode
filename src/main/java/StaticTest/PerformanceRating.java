package StaticTest;

public class PerformanceRating 
{
	private static final int Outstanding =5;
	private static final int Good=4;
	private static final int Average =3;
	private static final int Poor=2;
	
	public static int calculatePerformance(EmployeeRating employee)
	{
		
		int rating = employee.getPoint()>=80 ? Outstanding: employee.getPoint()>=60 ? Good: employee.getPoint()>=50 ? Average:employee.getPoint()>=1 ? Poor:Poor;
	
		return rating;
		/*if(employee.getPoint()>=80)
		{
			System.out.println("The performance of the Employee is Outstanding");
			return rating;
		}else if(employee.getPoint()>=60)
		{
			System.out.println("The performance of the Employee is Good");
			return rating;	
		}else if(employee.getPoint()>=50)
		{
			System.out.println("The performance of the Employee is Average");
			return rating;
		}else
		{
			System.out.println("The performance of the Employee is Poor");
			return rating;
		}*/
	}
	
}
