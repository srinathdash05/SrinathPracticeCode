package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ListInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Srinath");
		al.add("Interview");
		
		HashMap<Integer, List<String>> ml = new HashMap<>();
		
		ml.put(1, al);
		
		for(Entry<Integer, List<String>> entry : ml.entrySet()) {
			System.out.println("The key is: " +entry.getKey() + " the value is: " +entry.getValue());
		}
		
		ml.forEach((key,value) -> System.out.println("Key: " +key + " value: " +value));
		

	}

}
