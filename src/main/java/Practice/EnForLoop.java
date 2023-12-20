package Practice;

public class EnForLoop {
	
	int arr[] = new int[5];
	
	public void store(int a, int b, int c, int d, int f)
	{
		arr[0]= a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=f;
		
	}
	public void display()
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		EnForLoop en = new EnForLoop();
	    en.store(1, 2, 3, 4,5);
		en.display();
		
	}

}
