package Test;

public class PrintAlphabet {

	public static void main(String[] args) {
		
		String s = "Be12Posi%^$T*}}i2v#@e";
		String s1 = "Be12Posi%^$T*}}i2v#@e";
		String s3 = new String("Be12Posi%^$T*}}i2v#@e");
		System.out.println(s3==s1);
		System.out.println(s1.equals(s3));
		int n = s.length();
		
		for(int i =0;i<n;i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}
		

	}

}
