package inheritance;

public class Emain {

	public static void main(String[] args) 
	{
		Child c = new Child(1,10,20);
		System.out.println("The gear number is :" +c.getGear());
		System.out.println("The speed is :" +c.getSpeed());
		System.out.println("The seat height is  " +c.getSeatHieght());
		c.applyBreak(6);
		System.out.println("The speed after applying braek is:" +c.getSpeed());
		c.speedUp(2);
		System.out.println("The speed after incresing gear is:" +c.getSpeed());
	}

}
