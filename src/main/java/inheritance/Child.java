package inheritance;

public class Child extends Parent
{
	public int seatHieght;
	public Child (int gear, int speed, int seatHieght)
	{
		super(gear, speed);
		this.seatHieght=seatHieght;
	}
	public int getSeatHieght() {
		return seatHieght;
	}
	public void setSeatHieght(int seatHieght) {
		this.seatHieght = seatHieght;
	}
	
	
}
