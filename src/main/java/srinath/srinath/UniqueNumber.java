package srinath.srinath;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,3,2,1,4,3,2,6,7,8};
		
		int l = a.length;
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		for(int i = 0;i<l;i++) {
			int c=0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				c++;
			
			for(int j=i+1;j<l;j++) {
				if(a[i]==a[j]) 
				{
					c++;
				}
			}
			}
			if (c==1)System.out.println( a[i] +" is unique number");
		}//System.out.println("The count is: " +c);
		

	}

}
