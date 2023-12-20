package srinath.srinath;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{2,4,5},{3,6,8},{1,9,0}};
		int c = a.length;
		//System.out.println(c);
		int m = a[0][0];
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]>m) {
					m=a[i][j];
				}
			}
		}
			System.out.println("maximum number is : " +m);
			
			int n = a[0][0];
			int minCol = 0;
			for(int i =0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(a[i][j]<n) {
						n=a[i][j];
						minCol =j;
					}
				}
			}
				System.out.println("minimum number is : " +n);
				
				int max = a[0][minCol];
				int k =0;
				while(k<3) {
					if(a[k][minCol]>max) {
						max = a[k][minCol];
					}
					k++;
				}
				System.out.println("Maximum number in min co is: " +max);
	}
	

}
