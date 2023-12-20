package srinath.srinath;

public class InfiniteArraySum {

	public static void main(String[] args) {
		
		int arr[]= {5,2,6,9};
		int l=106065489;
		int r=134523547;
		int sum =0;
		int n = arr.length;
		
		int i ;
		for (i =l;i<=r;i++) {
			sum+= arr[i%n];
		}
System.out.println(sum);
	}

}
