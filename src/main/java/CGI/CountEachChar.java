package CGI;

import java.util.ArrayList;

public class CountEachChar {

	public static void main(String[] args) {
		
		String s = "Automation Testing";
		CountEachChar.CharOccur1(s);
		//charOccur(s);

	}


public static void charOccur(String s) {
	s= s.toLowerCase();
	s= s.replaceAll("\\s", "");
	int n = s.length();
	for(int i =0;i<n;i++) {
		int c =1;
		for(int j=0;j<n;j++) {
			if(i!=j && s.charAt(i)==s.charAt(j)) {
				 c++;
				 
			}
		}
		System.out.println("The character is " +s.charAt(i) + " count is " +c);
	}
	
}
public static void CharOccur1(String s) {
	s= s.toLowerCase();
	s= s.replaceAll("\\s", "");
	int n = s.length();
	ArrayList<Character> al= new ArrayList<Character>();
	
	
	for(int i =0;i<n;i++) {
		int c =0;
		if(!al.contains(s.charAt(i))) {
			al.add(s.charAt(i));
			c++;
			for(int j=i+1;j<n;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					 c++;
					 
				}
			}
			
			
		}
		if(c>=1)System.out.println("The character is " +s.charAt(i) + " count is " +c);
		
}
}
}