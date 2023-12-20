package srinath.srinath;

import java.util.Scanner;

public class OracleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = OracleTest.countValidWord(s);
		System.out.println(count);
		sc.close();
		
			
		
		}
		
	
	public static int countValidWord(String s) {
		String splitString[] = s.split("\\s+");
		int c = 0;
		for (String a : splitString) {
			if(isValidWord(a)) {
				c++;
		}
		}
		return c;
	}
	public static boolean isValidWord(String a) {
		
		if (a.length() >= 3&& a.matches(".*[A-Za-z].*") && 
				
				a.matches(".*\\d.*")&& 
				!a.matches(".*[^A-Za-z0-9].*")) {
			return true;

		}else {
			return false;
		}
		
	}
}