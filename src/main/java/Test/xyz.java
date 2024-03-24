package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is srinath dash";


		int n = s.length();

		ArrayList<Character> al = new ArrayList<Character>();
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		for(int i=0;i<n;i++){
		int c=0;
		if(!al.contains(s.charAt(i)))
			{
			
			al.add(s.charAt(i));
			c++;

			for(int j =i+1; j<n;j++)
				{
				if(s.charAt(i)==s.charAt(j)){

					c++;
				}
			}
			map.put(c, s.charAt(i));
		//if(c>1)   System.out.println("The character is: " +s.charAt(i) + "The occurance of the character is: " +c);
		
		}
		
		for(Entry<Integer, Character> entry : map.entrySet()) {
			if(entry.getKey()>1)
			System.out.println("The key is " + entry.getKey() + " the value is " +entry.getValue());
		}
		}


	}

}
