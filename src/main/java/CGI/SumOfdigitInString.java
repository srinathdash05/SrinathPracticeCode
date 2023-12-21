package CGI;

public class SumOfdigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "7sad9", "hgds99", "hfd78" };
		String a= "1abcd4hg6fd8";
		sumOfDigitsInString(a);
		

	}

	public static void sumOfdigitsInArrayofStrings(String s[]) {
		int sum = 0;
		// String s1 ="";
		for (String a : s) {
			String s1 = "";
			for (int i = 0; i < a.length(); i++) {
				if (Character.isDigit(a.charAt(i))) {
					s1 += a.charAt(i);
				}
			}
			System.out.println(s1);
			sum += Integer.parseInt(s1);
		}

		System.out.println(sum);

	}
	public static void sumOfDigitsInString(String s) {
		int sum =0;
		String s1="";
		for(int i=0;i<s.length();i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				s1 += s.charAt(i);
			}
			
		}
		//sum+=Integer.parseInt(s1);
		//
		//System.out.println(s1);
		for(int i=0;i<s1.length(); i++) {
			sum+= Integer.parseInt(s1.substring(i,i+1));
		}
		System.out.println(sum);
	}
	
}
