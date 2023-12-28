package CGI;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		
		int n = arr.length;
		int temp[] = new int [n];
		
		for(int i =0;i<n;i++) {
			temp[n-i-1] =arr[i];
		}
		for(int i=0;i<n;i++) {
		System.out.println(temp[i]);
		}
	}

}
