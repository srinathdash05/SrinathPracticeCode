package CGI;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		//RightTriangle(n);
		invertedTriangle(n);
		//pyramidStarPattern(n);

	}

	public static void squarePattern(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void RightTriangle(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
	public static void invertedTriangle(int row ) {
		for (int i = row; i >0; i--) {
			for (int j =0; j <i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		
	}
	public static void pyramidStarPattern(int row) {
		
		for (int i = 0; i <row; i++) {
			for (int j =0; j <row-i-1; j++) {
				System.out.print("* ");

			}
			
			System.out.println();
		}
		
	}
}
