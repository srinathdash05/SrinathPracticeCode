package Practice;

public class ArmstrongLucky {

	public static void main(String[] args) 
	{
		int num = 153, result=0, rem, originalNumber;
		originalNumber =num;
		
		
		while(originalNumber!=0)
		{
			rem= originalNumber%10;
			result=result+rem*rem*rem;
			originalNumber/=10;
		}
		if(result==num) {
		System.out.println(num+ " Armstrong number");
	}else {
		System.out.println("No");
	}
}}