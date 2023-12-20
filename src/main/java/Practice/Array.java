package Practice;

public class Array {
	public  int[] twoSum(int[] nums, int target)
	{
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					return new int[] {i,j};
				}
					
			}
		}throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) 
	{
		//Array ar =new Array();
		int nums[] = {2,15,7,11};
		//System.out.println(ar.twoSum(nums, 9));
		int target =9;

		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println(nums[i] + "" +nums[j]);
				}
					
			}
		
	}

}}
