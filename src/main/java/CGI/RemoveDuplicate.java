package CGI;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,6,5,8,2,3,2,6,8,9,0,3};
		String s = "Automation";
		RemoveDuplicate.removeDuplicateNum(arr);
		RemoveDuplicate.removeDuplicateChar(s);
		
		
}
	public static void removeDuplicateNum(int arr[]) {
		
		int n = arr.length;
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i =0;i<n;i++) {
			if(!al.contains(arr[i])) {
				al.add(arr[i]);
				System.out.println(arr[i]);
			}
			
		/*if(!map.containsKey(arr[i])) {
			
			map.put(arr[i], true);
			System.out.println(arr[i] + "");
		}*/

	}
		
	}
public static void removeDuplicateChar(String s) {
		s=s.toLowerCase();
		int n = s.length();
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Character> al= new ArrayList<Character>();
		
		for(int i =0;i<n;i++) {
			if(!al.contains(s.charAt(i))) {
				al.add(s.charAt(i));
				System.out.print(s.charAt(i));
			}
			
		/*if(!map.containsKey(arr[i])) {
			
			map.put(arr[i], true);
			System.out.println(arr[i] + "");
		}*/

	}
		
	}
}
