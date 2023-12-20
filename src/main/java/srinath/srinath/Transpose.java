package srinath.srinath;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,4},{7,8}};
		
	
		int row = arr.length;
		int col = arr[0].length;
		int t[][]=new int[row][col];
		transpose(arr, row, col, t);
		System.out.println("result is :");
		for(int i=0;i<row;i++) {
			System.out.println(" ");
			for(int j=0;j<col;j++) {
				System.out.print(t[i][j] +" ");
				//System.out.print(" ");
			}
		}

	}
	public static void  transpose(int arr[][], int row, int col, int t[][]) {
		
		
		for(int i =0; i<row;i++) {
			for(int j=0;j<col;j++) {
				
				t[i][j]=arr[j][i];
			}
		}
	}

}
