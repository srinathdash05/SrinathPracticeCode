package Test;

public class Scenario1TryCatch {
	

	public static void main(String[] args) {
		
		test();
		int a=8;
		long b = a;
		long c = 0;
		int s = (int) c;
		

	}
	@SuppressWarnings("finally")
	public static int test()
    {
        try {
            System.out.println("try");
            System.exit(1);
        } catch(Exception e) {
            System.out.println("catch");
        } finally { 
            System.out.println("finally");
            return 1;
        }
    }

}
