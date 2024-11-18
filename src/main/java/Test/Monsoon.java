package Test;

import java.util.*;

public class Monsoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Arrow";
		char c ='r';
		replaceOccurance1(input,c);
		

	}
	
	public static void replaceOccurance(String str, char c) {
		
		int count = 0;
		ArrayList<Character> al = new ArrayList<Character>();
		for (char c1 : str.toCharArray()) {
			if (c1 == c) {

				al.add('$');
				count++;
				for (int j = 1; j < count; j++) {
					al.add('$');
				}

			} else {
				al.add(c1);
			}

		}

		System.out.println(al);
		
	}
public static void replaceOccurance1(String str, char c) {
		
		int count = 0;
		//ArrayList<Character> al = new ArrayList<Character>();
		StringBuilder sb = new StringBuilder();
		
		for (char c1 : str.toCharArray()) {
			if (c1 == c) {

				sb.append("$");
				count++;
				for (int j = 1; j < count; j++) {
					sb.append("$");
				}

			} else {
				sb.append(c1);
			}

		}

		System.out.println(sb);
		
	}


}
