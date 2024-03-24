package CGI;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "I am an automation tester";
		
		ReverseSentence.reversreWord(s);
		ReverseSentence.reverseSentence(s);
	}
	
public static void reverseSentence(String s) {
	int n = s.length();
	String Rev = "";
	
	for(int i=s.length()-1; i>=0; i--) 
	{
		Rev = Rev +s.charAt(i);
		}
		System.out.println("The reversed sentence is: "+Rev);
	}

public static void reversreWord(String s) {
	
	int n = s.length();
	String Rev = "";
	String [] s1 = s.split(" ");
	
	for(int i = s1.length-1; i>=0;i--) {
		Rev+= s1[i]+" ";
	}
	System.out.println("The reversed word in sentence is: "+Rev);
}
}
	




