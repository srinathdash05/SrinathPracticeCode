package srinath.srinath;

import java.util.Scanner;
import java.io.*;

public class Palindrome {

	public static void main(String[] args) 
	{
		//checkPalindrome("radar");
		//checkPalindrome("101");
		String str, rev ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		str = sc.nextLine();
		
		int lg = str.length();
		
		for(int i = lg-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("No");

	}
	/*public static void checkPalindrome(String s)
	{
		String reverse = new StringBuffer(s).reverse().toString();
		if(s.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("no palindrome");
	}*/

}
