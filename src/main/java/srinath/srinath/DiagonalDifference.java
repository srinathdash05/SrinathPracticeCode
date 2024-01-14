package srinath.srinath;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1=0;
		int sum2=0;
		int difference;
		int arr[][] = new int [n][n];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					sum1+=arr[i][j];
				}
				
				if(i+j==n-1) {
					sum2+=arr[i][j];
			}
		}
		
				
			}
		
		//System.out.println(sum2);
		
			System.out.println(difference=sum1-sum2);
		
			

	}
	

}
