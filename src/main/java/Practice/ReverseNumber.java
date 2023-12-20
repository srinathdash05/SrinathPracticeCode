package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int number, reverse=0, remainder;
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		number = sc.nextInt();
		
		
		while(number!=0)
		{
			remainder = number%10;
			reverse = reverse*10+remainder;
			number=number/10;
			
		}
		
			System.out.println("The reverse number is :" +reverse);
			/*int n=45,rev=0,rem;
			for(n =n; n>0; n/=10)
			{
				rem =n%10;
				rev=rev*10+rem;
			}
			System.out.println("The reverse number is :" +rev);*/
	}

}
