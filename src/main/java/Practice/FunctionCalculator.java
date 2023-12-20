package Practice;

public class FunctionCalculator {

	public static void main(String[] args) 
	{

		int choice =3;
		switch(choice)
		{
			case 1: System.out.println("Calculate Armstrong number");
			break;
			case 2: System.out.println("Calculate Lucky number");
			break;
			default: System.out.println("Invalid entry");
		}
		
		if (choice==1)
		{
			int num =153, result=0, rem, originalNumber;
			originalNumber =num;
			while(originalNumber!=0)
			{
				rem= originalNumber%10;
				result=result+rem*rem*rem;
				originalNumber/=10;
			}
			System.out.println("The number is an Armstrong number");
		}else if(choice==2)
		{
			int num =1623, result=0, rem=0, originalNumber;
			originalNumber =num;
			while(originalNumber!=0)
			{
				if(result%2==0) 
				{
					int value = originalNumber%10;
					rem=rem+value*value;
					
				}
				originalNumber/=10;
				++result;
			}if(originalNumber%9==0)
			{
				System.out.println(num+ "is a lucky number");
			}
		}
	}


	}


