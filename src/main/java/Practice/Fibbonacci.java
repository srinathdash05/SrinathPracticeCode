package Practice;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) 
	{
		int i, count, n1=0, n2=1, n3 ;
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.print(n1 +" " +n2);
		for(i=2; i<count; ++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
