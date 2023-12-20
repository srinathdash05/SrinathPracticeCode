package inheritance;

public class Parent 
{
	protected int gear;
	protected int speed;
	public Parent(int gear, int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void applyBreak(int decreament)
	{
		speed -= decreament; 
	}
	public void speedUp(int increament)
	{
		speed += increament ;
		
	}
}
