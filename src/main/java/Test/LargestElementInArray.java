package Test;

import java.util.Arrays;
import java.util.Collections;

public class LargestElementInArray {

	public static void main(String[] args) {

		int arr[] = {11, 9, 2, 65, 78, 34};
		// TODO Auto-generated method stub
		sortArray1(arr);
		sortArray2(arr);
		
		//Arrays.sort(arr, Collections.reverseOrder());
		
		//System.out.println(Arrays.toString(arr));

	}

	public static void sortArray1(int arr[]) {

		Arrays.sort(arr);
		
		
		int n = arr.length-1;
		System.out.println("The highest number in array is: " +arr[n]);		
	}
	public static void sortArray2(int arr[]) {

		int n = arr.length;
		int temp =arr[0];
		for(int i=0;i<n;i++) {

			if(arr[i]>temp) {
				temp=arr[i];

			}


		}
		System.out.println("The highest number is: " +temp);
	}

}
