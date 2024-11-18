package CGI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateThroughHashMap {

	public static void main(String[] args) {
		
		doubleHashMap();

	}

	public static void iterateHashMapusingEntrySet() {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Srinath", 1);
		m.put("Suj", 2);
		m.put("Jag", 3);
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println("The key is: " + entry.getKey() + " the value is " + entry.getValue());

		}

	}
	public static void iterateHashMapusingIterator() {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Srinath", 1);
		m.put("Suj", 2);
		m.put("Jag", 3);
		
		Iterator<Entry<String, Integer>> itr = m.entrySet().iterator();
		while(itr.hasNext()) {
			
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("the key is: " +entry.getKey() + " the value is: " +entry.getValue());
		}
		
		
	}
	
	public static void doubleHashMap() {
		
		Map<String, Integer> ed = new HashMap<String, Integer>();
		ed.put("Srinath", 123);
		ed.put("Suj", 453);
		Map<String, String> pd = new HashMap<String, String>();
		pd.put("GS", "G1");
		pd.put("Ms", "M1");
		Map<Map<String, Integer>, Map<String, String>> fed = new HashMap<Map<String, Integer>, Map<String, String>>();
		fed.put(ed, pd);
		Iterator<Entry<Map<String, Integer>, Map<String, String>>> ftr = fed.entrySet().iterator(); 
		
		while(ftr.hasNext()) {
			
			Map.Entry<Map<String, Integer>, Map<String, String>> entry = ftr.next();
			
			System.out.println("Print the content of (ed) map: ");
			Iterator<Entry<String, Integer>> keyItr = entry.getKey().entrySet().iterator();
			while(keyItr.hasNext()) {
				Map.Entry<String, Integer> key1 = keyItr.next();
				System.out.println("The key is: " +key1.getKey()+ " the value is: " +key1.getValue());
			}
			System.out.println("Print the content of (pd) map: ");
			Iterator<Entry<String, String>> valueItr = entry.getValue().entrySet().iterator();
			while(valueItr.hasNext()) {
				Map.Entry<String, String> val1 = valueItr.next();
				System.out.println("The key is: " +val1.getKey()+ " the value is: " +val1.getValue());
			}
			
		}
		
		
	}

}
