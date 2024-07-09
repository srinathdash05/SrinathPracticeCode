package srinath.srinath;

public class ArrayAddition {

	public static void main(String[] args) {
		
		int arr1[] = {2,4,6,8,9,1};
		int arr2[] = {9,1,3,4,5};
		int n;
		if(arr1.length>arr2.length) {
			n = arr1.length;
		}else {
			n=arr2.length;
		}
		int arr3[] = new int[n];
		for(int i=0;i<n;i++) {
			if(i<arr1.length && i<arr2.length) {
			arr3[i] =arr1[i]+arr2[i];
			}else if(i<arr1.length) {
				arr3[i]=arr1[i];
			}else {
				arr3[i]=arr2[i];
			}
		}
		for(int i =0;i<n;i++) {
			System.out.println(arr3[i]);
		}

	}

}
