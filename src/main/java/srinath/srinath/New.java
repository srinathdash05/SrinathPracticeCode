package srinath.srinath;

import java.util.ArrayList;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =10;
		while(k==10) {
			System.out.println("srinath");
			break;
		}
		
		String str = "srinathdAsh welcome";
		String arr[] = str.split(" ");
		for(String a : arr) {
			System.out.println(a);
		}
		ArrayList<Character> al = new ArrayList<Character> ();
		
		int n = str.length();
		for(int i = 0; i<n; i++) {
			int count =0;
			if(!al.contains(str.charAt(i))) {
				al.add(str.charAt(i));
				count++;
				
				for(int j =i+1; j<n;j++) {
					if(str.charAt(i)==str.charAt(j)) {
						count++;
					}
				}
			}
			if (count>1 && str.charAt(i)=='e')
				System.out.println("The character is: " +str.charAt(i) + " the count is " +count);
		}

	}

}
