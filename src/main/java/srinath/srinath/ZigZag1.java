package srinath.srinath;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n]; 
		for(int i =0;i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int mid = (n-1)/2;
		
		int temp = a[mid];
		a[mid] = a[n-1];
		a[n-1]= temp;
		for (int i=0;i<n;i++) {
			System.out.println(a[i]);}
		int temp1=  a[mid-1];
		a[mid-1] = a[mid+1];
		a[mid+1]= temp1;
		
		for (int i=0;i<n;i++) {
		System.out.println(a[i]);}
		
		int temp2 = a[n-2];
		a[n-2] = a[n-1];
		a[n-1]= temp2;
		
		for (int i=0;i<n;i++) {
			System.out.println(a[i]);}
		
		
		

	}

}
