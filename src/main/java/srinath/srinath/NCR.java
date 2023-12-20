package srinath.srinath;

public class NCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";
		int sum =0;
		
		try{
			
			for (int i =0;i<s.length();i++) {
				Character ch = s.charAt(i);
				if (Character.isDigit(ch)) {
	                // Convert the character to its integer value and add it to the sum
	                sum += Character.getNumericValue(ch);
	                if(sum==16) {
	                	System.out.println("true");
	                }
	            }

			}
			
			
			
		
		
		
	}
		catch(Exception e) {
			
			System.out.println(e);
		}
System.out.println(sum);
}
	
}

