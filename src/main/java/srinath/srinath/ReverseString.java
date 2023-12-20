package srinath.srinath;

public class ReverseString {

	public static void main(String[] args) {
		
		String str ="Srinath";
		int length, i;
		String rev ="";
		length = str.length();
		
		for(i =length-1; i>=0;i--) {
			rev = rev+str.charAt(i);
			
		}
		// TODO Auto-generated method stub
System.out.println(rev);
	}

}
