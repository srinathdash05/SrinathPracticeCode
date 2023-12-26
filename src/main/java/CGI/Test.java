package CGI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
	}
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
