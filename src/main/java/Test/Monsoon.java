package Test;

import java.util.*;

public class Monsoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "monsoon";
		int count = 0;
		ArrayList<Character> al = new ArrayList<Character>();
		for (char c : input.toCharArray()) {
			if (c == 'o') {

				al.add('$');
				count++;
				for (int j = 1; j < count; j++) {
					al.add('$');
				}

			} else {
				al.add(c);
			}

		}

		System.out.println(al);

	}

}
