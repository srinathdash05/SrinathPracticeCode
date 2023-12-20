package srinath.srinath;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		if(n%2==1) {
			long arr[]=new long[(int) n];
			for (int i =0 ;i<n;i++) {
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			long median = n/2;
			System.out.println(arr[(int) (median)]);
			
		}else {
			System.out.println("Even number");
		}
		
		
	}

}
