package CGI;

public class PrintTriangle {

	public static void main(String[] args) {

		int n =7;
		
		for(int i =1;i<n;i++) {
			//System.out.println(" ");
			for(int j =1;j<=i*2;j+=2) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
