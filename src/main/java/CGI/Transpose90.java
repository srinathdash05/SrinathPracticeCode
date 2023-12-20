package CGI;

public class Transpose90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = {{1,2,3,4},{3,4,5,6},{5,6,7,8},{7,8,8,9}};
		 int row = arr.length;
		 int col = arr[0].length;
		 
		 tansoseto90(arr, row, col);
			
		 

	}
	public static void tansoseto90(int arr[][], int row, int col) {
		
		for(int j=0;j<col;j++) {
			System.out.println(" ");
			for(int i =row-1;i>=0;i--) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
