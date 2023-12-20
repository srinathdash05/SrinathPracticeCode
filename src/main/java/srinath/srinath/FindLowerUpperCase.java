package srinath.srinath;

public class FindLowerUpperCase {

	public static void main(String[] args) {
	
		String s ="SrinathDash09";
		int l = s.length();
		System.out.println(l);
	    int lower = 0 ;  
	    int upper =0 ;
	    int count=0;
		for (int i=0; i<l; i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				upper++;
			}
			else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				lower++;
			} else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count ++;
			}
		}System.out.println(count);
		System.out.println(lower);
		System.out.println(upper);

	}

}
