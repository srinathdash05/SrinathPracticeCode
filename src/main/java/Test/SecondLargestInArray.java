package Test;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 1, 2, 90, 67, 19 };
		int temp = arr[0];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		//System.out.println("The largest number is " + temp);
		sort(arr);
		
		
	}

	public static void sort(int arr[]) {

		int n = arr.length;

		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("The second largest element in array is " +arr[n-2]);
	}

}
