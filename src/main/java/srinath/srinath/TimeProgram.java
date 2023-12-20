package srinath.srinath;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Date date = new Date();
		SimpleDateFormat simpledate ;
		simpledate = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(simpledate.format(s));
	}

}
