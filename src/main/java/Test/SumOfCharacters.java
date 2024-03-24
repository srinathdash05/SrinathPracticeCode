package Test;

import java.util.Scanner;

public class SumOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int sum = 0;
		int newsum =0;
		String s1= "";
		for (int i = 0; i < n; i++) {
			

			if (Character.isDigit(s.charAt(i))) {
				s1 += s.charAt(i);
			}
			
		}

		System.out.println(s1);
		
		for(int i=0;i<s1.length(); i++) {
			sum+= Integer.parseInt(s1.substring(i,i+1));
		}
		if(sum>9) {
			
			newsum = x(sum);
			
		}
		
		System.out.println(newsum);
	}
public static int x(int n) {
	int sum=0 ;
	if(n!=0) {
		
		sum+=n%10;
		n=n/10;
	}
	return sum;
}
}
