package srinath.srinath;

public class NumberSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Up to 36% off";
		if(s.contains("Up to"))
{
		String[] a = s.split(" ");
		String b [] = a[2].split("%");
		System.out.println(b[0]);
		}
		
		String s1 = "Boy";
		String s2 = "Biggie";
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		//System.out.println("S1 is : " +s1);
		//System.out.println("S2 is: " +s2);
		String s3 = "java code";
		
		//System.out.println(s3.substring(1,7));
		String a = "abc";
		String b = "cde";
		String c = new String("abc");//in case of new string the memory locations will change so a==c will return false but a.equals c will be true
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		
		
		

	}

}
