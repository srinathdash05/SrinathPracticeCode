package CGI;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxAvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,12,3,8,20,1,15};
		Integer b[]= {5,0,7,8,0,9,0,6};
		Arrays.sort(b, Collections.reverseOrder());
		for(int i =0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		Arrays.sort(a);
		int n = a.length;
		System.out.println(n);
		//int avg;
		float sum =0;
		for(int i = 1; i<n-1;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		float avg = sum/(n-2);
		System.out.println(avg);
	}

}
