package srinath.srinath;

import java.util.ArrayList;

public class NonRepeatedNumber {

	public static void main(String[] args) {

		int num[] = {1,2,3,1,2,3,4,3,2};
		System.out.println("The non repeating number");
		//findNonRepeatnumber(num);
		nonRepeatedNumber2(num);
	}
	public static void findNonRepeatnumber(int num[]) {
		
		//int count = 0;
		boolean check;
		for (int i = 0; i<num.length;i++) {
			check =false;
			for (int j =0;j<num.length;j++) {
				if(i!=j && num[i]==num[j]) {
					check = true;
				}
			}
			if(!check)System.out.println(num[i]);
		}
		
	}
	
	public static void nonRepeatedNumber2(int num[]){
		 
		int l =num.length;
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i= 0;i<l;i++) {
			int c =0;
			if(!al.contains(num[i])){
				al.add(num[i]);
				c++;
				for(int j=i+1;j<l;j++) {
					if(num[i]==num[j]) {
						c++;
					}
				}
			}
			
			if(c==1)System.out.println("The unique numbers are: " +num[i]);
		}
		
	}
}
