package srinath.srinath;

public class ReversingArraytoM {

	public static void main(String[] args) {
		int arr[] = {3,2,5,6,7,9,1,0};
		int n = arr.length;
		int M=4;
		int i, j;
		int loop = 0;
		for(i=0;i<n;i++)
		{
			loop+=1;
			for(j=M;j>=i;j--)
			{
				if (loop>1) 
					break;
				System.out.println(arr[j]);
				
			}
			if(i>M)
				System.out.println(arr[i]);
		}
		
	}

}
