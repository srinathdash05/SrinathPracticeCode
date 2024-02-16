package HackerRank;

import java.util.Random;
import java.util.Scanner;

public class GridChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char[][] arr = new char[n][n];
		Random random = new Random();
		//String [][] a = {{"abc"},{"ghi"},{"klm"}};
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= (char)(random.nextInt(26)+'a');
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
