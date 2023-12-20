package srinath.srinath;

import java.util.Arrays;
import java.util.Scanner;

public class minMaxArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highestsum =0;
		int lowestsum=0;
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int arr[] = new int[N];
		for(int i =0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		
		for(int j = 0;j<N-1;j++) {
			
			
			lowestsum+=arr[j];
				
				
				
			}
		for(int j = 1;j<N;j++) {
			
			
			highestsum+=arr[j];
				
				
				
			}
			
			System.out.println(lowestsum +" " +highestsum);
			
		}
		
	

}
