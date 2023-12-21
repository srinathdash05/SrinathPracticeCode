package CGI;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Neat";
		String s2 = "A net";
		if(Anagram.anagramChar(s1, s2))
			System.out.println("The strings are Anagram");
		else
			System.out.println("Strings are not anagram");

	}

	public static void anagramWithoutRepeatingword(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceFirst(" ", "");
		// System.out.println(s1);

		int n1 = s1.length();
		int n2 = s2.length();
		//System.out.println(n1 + " " + n2);
		int c = 0;
		// ArrayList<Character> al = new ArrayList<Character>();
		if (n1 == n2) {
			for (int i = 0; i < n1; i++) {

				for (int j = 0; j < n2; j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						c++;
					}
				}

			}

		} else
			System.out.println("not anagram");
		System.out.println(c);
		if (c == n1)
			System.out.println("The strings are anagram");
		else
			System.out.println("Not anagram");

	}
	
	public static boolean anagramChar(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceFirst(" ", "");
		int n1 = s1.length();
		int n2 = s2.length();
		if(n1!=n2) {
			return false;
		}
		
		char[] ch1 = new char[n1];
		char []ch2= new char[n2];
		for(int i =0;i<n1;i++) {
			ch1[i] = s1.charAt(i);
		}
		for(int i =0;i<n2;i++) {
			ch2[i] = s2.charAt(i);
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i =0;i<n1; i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}else
				return true;
		}
		return true;
		
		
	}
}