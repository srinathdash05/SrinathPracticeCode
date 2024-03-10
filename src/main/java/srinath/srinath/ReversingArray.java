package srinath.srinath;

public class ReversingArray {
	

	public static void main(String[] args) 
	{
		String str = "reverse me";
		str = rev(str);
		System.out.println("The reverse string using char array is "  + str);
	}

	/*static void reverse(String a[])
	{
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}*/
	
	public static String rev(String s)
	{
		if(s==null || s.equals(""))
		{
			return s;
		}
		
		int n = s.length();
		
		char[] temp = new char[n];
		//fill character array backward with characters in the string
		for(int i = 0; i<n; i++)
		{
			temp[n-i-1] = s.charAt(i);
		}
		//converting char to String
		return String.copyValueOf(temp);
	}
}
