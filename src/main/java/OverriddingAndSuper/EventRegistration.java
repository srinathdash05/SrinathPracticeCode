package OverriddingAndSuper;

public class EventRegistration 
{
	String name, nameOfEvent;
	double registrationFee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public EventRegistration(String name, String nameOfEvent)
	{
		this.name=name;
		this.nameOfEvent=nameOfEvent;
	}
	public void registerEvent()
	{
		if(nameOfEvent=="ShakeALeg")
		{
			this.registrationFee = 100d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

			
		}else if(nameOfEvent == "Sing&Win")
		{
			this.registrationFee = 150d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

		}else if(nameOfEvent == "Actathon")
		{
			this.registrationFee = 70d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

		}else
		{
			this.registrationFee = 130d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

		}
	}
}
