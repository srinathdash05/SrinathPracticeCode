package CGI;

import java.util.ArrayList;
import java.util.Scanner;

public class ListToArray {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>();		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		int lsize = al.size();
		//System.out.println(lsize);
		int arr[] = new int [lsize];
		for(int i =0;i<lsize;i++) {
			arr[i] = al.get(i);
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		//System.out.println(arr.length);
		arrayToArrayList(arr);

	}
	
	public static void arrayToArrayList(int arr[]) {
		ArrayList <Integer> al = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			al.add(arr[i]);
			System.out.println(al);
			
		}
	}

}
