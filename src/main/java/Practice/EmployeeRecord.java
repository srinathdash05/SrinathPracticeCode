package Practice;

public class EmployeeRecord {
	


	public static void main(String[] args) 
	{
		double salary[] = {23500.00, 25080.0,22340.0,28760.0,19890.0};
		double average=0, sum=0;
		int l = salary.length;
		int gcount =0, lcount =0;
		System.out.println(l);
		for(int i=0;i<l;i++)
		{
			sum  = sum+salary[i];
			
		}
		average = sum/l;
		System.out.println("The average salary is :" +average);
		for(int i=0;i<l;i++)
		{
			if(salary[i]>average)
			{
				gcount++;
			}
			
			if(salary[i]<average)
			{
				lcount++;
			}
			
		}System.out.println("The number of employee getting salary more than average is :" +gcount);
		
		System.out.println("The number of employee getting salary less than average is :" +lcount);
		
		
		
	}

}
