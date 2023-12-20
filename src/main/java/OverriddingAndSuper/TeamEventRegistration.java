package OverriddingAndSuper;

public class TeamEventRegistration extends EventRegistration
{
	int noOfParticipants, teamNo;

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public TeamEventRegistration(String name,String nameOfEvent,int noOfParticipants,int teamNo)
	{
		super(name,nameOfEvent);
		this.noOfParticipants=noOfParticipants;
		this.teamNo=teamNo;
		
	}
	public void registerEvent()
	{
		if(nameOfEvent=="ShakeALeg")
		{
			this.registrationFee = 50d*this.noOfParticipants;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

			
		}else if(nameOfEvent == "Sing&Win")
		{
			this.registrationFee = 60d*this.noOfParticipants;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

		}else if(nameOfEvent == "Actathon")
		{
			this.registrationFee = 80d*this.noOfParticipants;
			System.out.println("Thank you "  + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

		}else
		{
			this.registrationFee = 100d*this.noOfParticipants;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee);

		}
	}
}
