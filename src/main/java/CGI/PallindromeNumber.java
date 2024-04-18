package CGI;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reverse = 0, num, rem;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		int temp;
		temp = num;

		while (num != 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		System.out.println(reverse);

		if (reverse == temp) {
			System.out.println("palindrome");
		} else
			System.out.println("no");
		sc.close();
	}

}
