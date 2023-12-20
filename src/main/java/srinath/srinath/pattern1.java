package srinath.srinath;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=1;
		for(int i=1;i<5;i++)
		{
		
		for(int j=1;j<=i;j++) 
		{
		System.out.print( j);
		System.out.print("\t");
		//k++;
		}
		System.out.println("");
		}
		System.out.println("");
		int k=1;
		for(int i=1;i<5;i++)
		{
		
		for(int j=1;j<=5-i;j++) 
		{
		System.out.print( k);
		System.out.print("\t");
		k++;
		}
		System.out.println("");
		}
		System.out.println("");
		int l=1;
		for(int i=1;i<5;i++)
		{
		
		for(int j=1;j<=i;j++) 
		{
		System.out.print( l);
		System.out.print("\t");
		l++;
		}
		System.out.println("");
		}
		
	}

}
