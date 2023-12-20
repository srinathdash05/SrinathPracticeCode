package VariableArguments;

import java.util.ArrayList;
import java.util.Collections;

public class VarargsE1 {
	
	public void displayList(int... input)
	{
		int index = 0;
		for(int i:input)
		{
			System.out.println("The element at " + index + " index is :" +i);
			index++;
		}
	}
	public void maxOfList(int... input)
	{
		int max=0;
		for(int j: input)
		{
			if(j>max)
			{
				max=j;
			}
		}System.out.println("The maximum of list is :" +max);
	}
	public void sortList(int... input)
	{
		ArrayList sortedList = new ArrayList();
		for(int k: input)
		{
			sortedList.add(k);
			
		}
		Collections.sort(sortedList);
		System.out.println("The sorted List is:" +sortedList);
	}
	public void averageList(int... input)
	{
		int avg=0, sum=0;
		for(int l :input)
		{
			sum = sum+l;
		}
		avg = sum/input.length;
		System.out.println("The average is :" + avg);
	}

	public static void main(String[] args) 
	{
		VarargsE1 v1 =new VarargsE1();
		v1.displayList(1,2,3,4,5);
		v1.averageList(1,2,3,4,5);
		v1.maxOfList(1,2,3,4,5);
		v1.sortList(9,7,6,1,3);

	}

}
