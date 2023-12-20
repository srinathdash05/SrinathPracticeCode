package CGI;

import java.util.ArrayList;

public class RemoveStringToPalindrome {

	public static void main(String[] args) {
		String s = "abefwba";
		String s1 = "";
		int n = s.length();
	
		//ArrayList<Character> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!='f' && s.charAt(i)!='w') {
				s1+=s.charAt(i);
			}
		}
		if(s1.equals("abeba"))
		System.out.println("Palindrome");

	}

}
