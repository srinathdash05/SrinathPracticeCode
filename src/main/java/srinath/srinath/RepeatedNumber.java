package srinath.srinath;

import java.util.ArrayList;

public class RepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,2,3,4};
		String str = "Sujata";
		repeatedNumber(arr);
		repeatedCharacter(str);
	}
		public static void repeatedNumber(int arr[]) {
			int l = arr.length;
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i =0;i<l;i++) {
				int count =0;
				if(!al.contains(arr[i])) {
					al.add(arr[i]);
					count++;
					for(int j =i+1;j<l;j++) {
						if(arr[i]==arr[j]) {
							count++;
						}
					}
				}
				if(count>=1)
					System.out.println("The number is " +arr[i] + " and the count is " +count);
			}
			
		}
		public static void repeatedCharacter(String str) {
			int l = str.length();
			char res = str.charAt(0);
			int count=0;
			for(int i =0;i<l;i++) {
				int Ccount=1;
				for(int j=i+1;j<l;j++) {
					if(str.charAt(i)==str.charAt(j)) {
						Ccount++;
						
					}
					if(Ccount>count) {
						count =Ccount;
						res=str.charAt(i);
					}
				}
				
			}System.out.println("Charcater is " +res + " count is " +count);
		}
}
