package CGI;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateThroughHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Srinath", 1);
		m.put("Suj", 2);
		m.put("Jag", 3);
		for(Map.Entry<String, Integer> entry: m.entrySet()) {
			System.out.println("The key is: " +entry.getKey()+ " the value is " +entry.getValue());
			
		}

	}

}
