package Interface;

public class Tester {

	public static void main(String[] args) 
	{
		Intern i = new Intern(5000,500);
		i.calcPercentage();
		//System.out.println(i.getMarkSecured());
		Trainee t = new Trainee(6000);
		t.calcPercentage();
		//System.out.println(t.getMarkSecured());
		

	}

}
