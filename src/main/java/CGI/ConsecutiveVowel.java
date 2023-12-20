package CGI;

import java.util.ArrayList;

public class ConsecutiveVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am a alien";
		
		for(int i=1;i<=s.length()-1;i++) {
			if(!is_vow(s.charAt(i-1))||!is_vow(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
			
		}
		
	}
	public static boolean is_vow(char c) {
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}

}
