package srinath.srinath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class List1 {

	public static void main(String[] args) 
	{
		List <String> str = new ArrayList<String>();
		str.add("A");
		str.add("s");
		str.add("Hummiltae");
		str.remove(0);
		
		
		ListIterator<String> itr = str.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//List-------------------------------------------------------
		
		List <Integer> list = new ArrayList<Integer>(5);
		
		for(int i= 0;i<=5;i++)
		{
			list.add(i);
			
		}System.out.println(list);
		
		list.remove(2);
		
		for(int i:list)
		{
			System.out.print(i + "");
		}
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("C");
		
	
		System.out.println(ll);
		ll.add(2, "F");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

//---------------Hashset---------------------------------------
		Set<String> s = new HashSet<String>();
		s.add("A");
		s.add("B");
		boolean r1 = s.add("C");
		System.out.println(r1);
		boolean r2=s.add("C");
		System.out.println(r2);
		
		System.out.println(s);
		
//********************************Hashmap******************************************	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Srinath", 25);
		map.put("Srikant", 30);
		System.out.println("The size of map is " +map.size());
		System.out.println(map);
		
		for(String key : map.keySet())
		{
			System.out.println("key:" +key+ ", Value:" +map.get(key));
		}
		
	} 

}
