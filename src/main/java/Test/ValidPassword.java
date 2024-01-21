package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass ="Password@*24";
		if(validPassword(pass)) {
			System.out.println("Valid");
		}else
			System.out.println("invalid");
		

	}
	
	public static boolean validPassword(String s) {
		String regex = "^(?=.*[0-9])" + 
						"(?=.*[a-z])(?=.*[A-Z])" +
						"(?=.*[!@#$%^&*()+=])" +
						"(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		if(s==null) {
			return false;
		}
		
		Matcher m = p.matcher(s);
		return m.matches();
	}

}
