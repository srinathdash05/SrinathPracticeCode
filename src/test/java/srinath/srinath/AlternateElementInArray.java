package srinath.srinath;

public class AlternateElementInArray {

	public static void main(String[] args) {
		
		int arr [] = {9,2,4,5,6,1,7,8,2,4,3,8};
		
		for(int i=0;i<arr.length;i+=2) {
			System.out.println("The alterante elements are: " +arr[i] );
		}

	}

}
