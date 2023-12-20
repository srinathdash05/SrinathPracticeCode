package Practice;

import java.util.Scanner;

public class oracleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c = 0;
		String special ="[!@#$%^&*(),.?\":{}|<>]";
		String splitString[] = s.split(" ");
		for (String a : splitString) {
			if(a.length()>=3 && !a.matches(".*"+special+".*") && a.matches(".*\\d.*")) {
				boolean count;
				for(int i=0;i<a.length();i++) {
					
					char ch = a.charAt(i);
					if(ch>='A' && ch<='Z') {
						count =true;
					}else if(ch>='a' && ch<='z') {
						count =true;
					}else if(ch>='0' && ch<='9') {
						count =true;
				}else {
					count = false;
				}
			}
				if(count=true)c++;

			
		}

	}
		System.out.println(c);
}
}