package Test;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double sum = (n*(n+1))/2;
		
		System.out.println("The sum of 1 to " +n+ " is : " +sum);
		
		int n1= sc.nextInt();
		
		int term = (n1-n)+1;
		
		int d = (n+1)-n;
		double sum1 = term/2*(2*n+(term-1)*d);
		
		System.out.println("The sum of "+n+ " to " +n1+ " is : " +sum1);


	}

}
