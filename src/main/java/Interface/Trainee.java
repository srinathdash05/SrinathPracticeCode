package Interface;

public class Trainee implements DataProvider
{
	int markSecured;
	
	public int getMarkSecured() {
		return markSecured;
	}

	public void setMarkSecured(int markSecured) {
		this.markSecured = markSecured;
	}

	Trainee(int markSecured)
	{
		this.markSecured = markSecured;
	}
	
	public void calcPercentage()
	{
		double percentage = (double)markSecured/totalMarks*100;
		System.out.println("The perecntage of trainee is : " + percentage);
	}
}
