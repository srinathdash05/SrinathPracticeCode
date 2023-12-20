package Interface;

public class Intern implements DataProvider
{
	int markSecured;
	int graceMarks;
	
	public int getMarkSecured() {
		return markSecured;
	}
	public void setMarkSecured(int markSecured) {
		this.markSecured = markSecured;
	}
	public int getGraceMarks() {
		return graceMarks;
	}
	public void setGraceMarks(int graceMarks) {
		this.graceMarks = graceMarks;
	}
	Intern(int markSecured, int graceMarks)
	{
		this.markSecured=markSecured;
		this.graceMarks = graceMarks;
		
	}
	public void calcPercentage()
	{
		double percentage = (double)(markSecured+graceMarks)/totalMarks*100;
		System.out.println("The percentage of intern is :  "  + percentage);
	}
}
