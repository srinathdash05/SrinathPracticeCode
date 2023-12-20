package srinath.srinath;

public class Student {
	
	private int age;
	private String name;
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public String toString()
	{
		return("Student name is" +this.getName()+ ", Student age is:" +this.getAge());
	}

	public static void main(String[] args) 
	{
		Student Sri = new Student("Srinath", 25);
		System.out.println("The name of student is:" +Sri.getName());
		System.out.println("The age of the student is: " +Sri.getAge());

	}

}
