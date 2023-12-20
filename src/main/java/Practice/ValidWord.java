package Practice;

import java.util.Scanner;

public class ValidWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c = 0;
		String special ="[!@#$%^&*(),.?\":{}|<>]";
		//String Vowel ="aeiouAEIOU";
		String splitString[] = s.split(" ");
		for (String a : splitString) {
			if (a.length() >= 3&& a.matches(".*[A-Za-z].*") || 
					
					a.matches(".*\\d.*")&& 
					!a.matches(".*[^A-Za-z0-9].*")) {
				c++;
			}

	}
		System.out.println(c);

	}

}
