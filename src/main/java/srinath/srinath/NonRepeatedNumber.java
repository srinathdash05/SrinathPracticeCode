package srinath.srinath;

public class NonRepeatedNumber {

	public static void main(String[] args) {

		int num[] = {1,2,3,1,2,3,4,3,2};
		System.out.println("The non repeating number");
		findNonRepeatnumber(num);
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
}
