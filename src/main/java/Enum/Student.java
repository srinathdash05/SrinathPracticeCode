package Enum;

public class Student 
{
	enum GRAD
	{
		A,B,C,D,E;
	}
	int studentId;
	String name;
	GRAD grade;
	int scholarshipAmount;
	int totalMarks;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GRAD getGrade() {
		return grade;
	}
	public void setGrade(GRAD grade) {
		this.grade = grade;
	}
	public int getScholarshipAmount() {
		return scholarshipAmount;
	}
	public void setScholarshipAmount(int scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public void calculateGrade()
	{
		if(totalMarks>=250)
		{
			grade = GRAD.A;}
		else if (totalMarks>=200 && totalMarks<250)
		{
			grade = GRAD.B;
		}
		else if(totalMarks>=175 && totalMarks<200)
		{
			grade =GRAD.C;
		}
		else if(totalMarks>=150 && totalMarks<175)
		{
			grade =GRAD.D;
		}else
			grade = GRAD.E;
	}
	public void caclulateScholarshipAmount()
	{
		switch(grade)
		{
		case A: scholarshipAmount =5000;
		break;
		case B: scholarshipAmount =4000;
		break;
		case C: scholarshipAmount =3000;
		break;
		case D: scholarshipAmount =2000;
		break;
		case E: scholarshipAmount =0;
		break;
		default: System.out.println("No scholarship");
		}
	}

}
