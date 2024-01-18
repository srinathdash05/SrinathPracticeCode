package Test;

import java.util.Stack;

public class ParanthesisProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[{()}]}";
		if(validParanthesis(s))
			System.out.println("Valid paranthesis");
		else
			System.out.println("Invalid");

	}
	
	public static boolean validParanthesis(String str) {
		Stack <Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			
			char x= str.charAt(i);
			if(x=='('||x=='{'|x=='[') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch(x){
			case ')':
				check = stack.pop();
				if(check=='{'||check=='[')
					return false;
				break;
			
				
			case '}':
				check = stack.pop();
				if(check=='('||check=='[')
					return false;
				break;
			case ']':
				check  =stack.pop();
				if(check=='{'||check=='(')
					return false;
				break;
				
				
			}
			
		}
		return (stack.isEmpty());
	}

}
