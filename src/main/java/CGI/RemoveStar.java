package CGI;

import java.util.ArrayList;

public class RemoveStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="ab*cd*e*f";
		int n = s.length();
		String s1 = "";
		ArrayList<Character> al= new ArrayList<Character>();
		
		
		for(int i =0;i<n;i++) {
			al.add(s.charAt(i));
				
		}
		for(int i =0;i<al.size();i++) {
			if(al.get(i)=='*') {
				al.remove(i);
				al.remove(i-1);
				
			}
				
		}
		
		System.out.println(al);
		
		
		

	

}
		
}
