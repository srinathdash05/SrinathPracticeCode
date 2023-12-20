package Practice;

public class Rectangle {
	private int length;
	private int breadth;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void calculatePerimeter()
	{
		double perimeter = 2*(length+breadth);
		System.out.println("The perimeter is: " +perimeter);
	}

	

}
