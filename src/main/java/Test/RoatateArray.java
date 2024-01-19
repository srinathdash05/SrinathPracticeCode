package Test;

import java.util.ArrayList;

public class RoatateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int pos = 3;
		 
		 int arr[] = {1,2,3,4,5,6,7};
		 
		 int n = arr.length;
		 
		 for(int i =0 ;i<=pos;i++) {
			 
			 arr[i]=arr[i+1];
		 }
		 
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 
		 for(int i=0;i<=pos;i++) {
			 al.add(arr[i]);
		 }
		 
		 System.out.println(al);
		 
		 for(int i=pos+1;i<n;i++) {
			 al.add(arr[i]);
		 }
		 System.out.println("the nw array is "+al);
		 

	}

}
