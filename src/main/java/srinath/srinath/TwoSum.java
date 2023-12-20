package srinath.srinath;

public class TwoSum {

	public static void main(String[] args) {
	int arr[]= {5,3,2,8};
	int n= arr.length;
	int i, j;
	//int result[] = new int [2];
	int target =7;
	
	for(i =0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			
			if(arr[i]+arr[j]==target) {
				
				System.out.println(i);
				System.out.println(j);
			}
		}
	}
	

	}

}
