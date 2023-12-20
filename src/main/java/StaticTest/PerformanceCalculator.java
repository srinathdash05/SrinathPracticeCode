package StaticTest;

public class PerformanceCalculator {

	public static void main(String[] args) 
	{
		EmployeeRating er1 = new EmployeeRating(88);
		EmployeeRating er2 = new EmployeeRating(65);
		EmployeeRating er3 = new EmployeeRating(35);
		//er1.setPoint(80);
		//er2.setPoint(60);
		//er3.setPoint(35);
		System.out.println("The performance Rating of the employee 1 is: " +PerformanceRating.calculatePerformance(er1));
		System.out.println("The performance Rating of the employee 2 is: " +PerformanceRating.calculatePerformance(er2));
		System.out.println("The performance Rating of the employee 3 is: " +PerformanceRating.calculatePerformance(er3));

	}

}
