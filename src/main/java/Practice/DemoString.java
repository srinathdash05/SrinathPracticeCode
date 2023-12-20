package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABC DEF_123";
		String arr[] = s.split("_");
		for (String a : arr) {
			System.out.println(a);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("10");
		list.add("20");
		list.add("30");
		//System.out.println(list);
		System.out.println(Collections.max(list));
		Iterator it = list.iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next() +"");
		}
		//String b = null;
		//String c = new String();
		//System.out.println(s);

	}

}
