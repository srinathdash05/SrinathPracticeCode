package srinath.srinath;

import java.util.ArrayList;

public class Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "capgemini";
		//Occurrence or = new Occurrence();
		//Occurrence.occurr(str);
		Occurrence.Hoccurr(str);
		

	}
	
	public static void occurr (String str) {
		
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
			if (count>=1)
				System.out.println("The character is: " +str.charAt(i) + " the count is " +count);
		}
		

}
public static void Hoccurr (String str) {
		
		//ArrayList<Character> al = new ArrayList<Character> ();
		int n = str.length();
		int hcount =0;
		char hchar = str.charAt(0);
		for(int i = 0; i<n; i++) {
			int count =1;
					
				for(int j =i+1; j<n;j++) {
					if(str.charAt(i)==str.charAt(j)) {
						count++;
					}
					
			}
				if(count>hcount) {
					hcount = count;
					hchar = str.charAt(i);
			}
				
		}
		System.out.println("The character is: " +hchar + " the count is " +hcount);
		

}
}