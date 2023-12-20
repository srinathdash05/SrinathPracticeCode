package srinath.srinath;

import org.apache.commons.math3.geometry.spherical.oned.ArcsSet.Split;

public class SplitProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "This is a good work@srin";
		
		String arr[] = s.split("@");
		
		for(String a:arr) {
			System.out.println(a);
		}

	}

}
