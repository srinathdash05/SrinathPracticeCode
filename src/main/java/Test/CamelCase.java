package Test;

public class CamelCase {

	public static void main(String[] args) {
		
		String s = "IWantToFlyHigh";
		String word [] = splitCamelCase(s);
		for(String s1 : word) {
			System.out.println(s1);
		}
		
	}
  public static String[] splitCamelCase(String s) {
	  return s.split("(?=[A-Z])");
  }
}
