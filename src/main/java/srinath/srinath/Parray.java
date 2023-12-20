package srinath.srinath;

public class Parray {
	
	private static final boolean[] A = null;


	@SuppressWarnings("null")
	public void init(int n) {
		boolean A[] = null;
		for(int i=1;i<=n;i++) {
			A[i]=false;
		}
	}
	public void insert(int n) {
		A[n] = true;
	}
	public void delete(int i) {
		A[i] = false;
	}
	

	public static void main(String[] args) 
	{
		System.out.println(A);

	}

}
