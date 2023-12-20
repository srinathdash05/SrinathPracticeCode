package srinath.srinath;

public class Matrix {

	public static void main(String[] args) {
		String str = "one does not simply walk into mordor";
		int row = 6 ,col =6;
		transpose(str, row,col);



	}
	
	public static void transpose(String str, int row, int col) {
		String arr[][]= new String[row][col];
		int l =str.length();
		String res ="";
		for(int i =0;i<l;i++) {
			for (int j=0;j<row;j++) {
				for (int k=0;k<col;k++) {
					
					arr[j][k] = String.valueOf(str.charAt(i));
					i++;
					
				}
			}
			for(int j =0; j<col;j++) {
				for(int k=0;k<row;k++) {
					res+=arr[k][j]; 
				}
			}
			System.out.println(res);
		}
		
	}
}
