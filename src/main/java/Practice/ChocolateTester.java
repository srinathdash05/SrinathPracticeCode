package Practice;

public class ChocolateTester {

	public static void main(String[] args) 
	{
		Chocolate cl = new Chocolate("Cadbury", 101, 12,10);
		Chocolate cl1 = new Chocolate("Hershey's", 102, 24,50);
		System.out.println("the chocolate name is : " +cl.getName());
		cl.setName("Fivestar");
		System.out.println("the chocolate modified name is : " +cl.getName());
		System.out.println("the chocolate name is : " +cl1.getName());
		cl1.setName("swing");
		System.out.println("the modified chocolate name is : " +cl1.getName());


	}

}
