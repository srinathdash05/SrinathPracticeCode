package OverriddingAndSuper;

public class SingleEventRegistration extends EventRegistration 
{
	int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	 public SingleEventRegistration(String name, String nameOfEvent, int participantNo)
	 {
		 super(name,nameOfEvent);
		 this.participantNo =participantNo;
	 }
	 
	public void registerEvent()
	 {
		if(nameOfEvent=="ShakeALeg")
		{
			this.registrationFee = 100d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee + "\nyou are partcicipant number: " +this.getParticipantNo());
			
		}else if(nameOfEvent == "Sing&Win")
		{
			this.registrationFee = 150d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee + "\nyou are partcicipant number: " +this.getParticipantNo());

		}else 
		{
			this.registrationFee = 130d;
			System.out.println("Thank you " + this.getName() + " for your participation. Your registartion fee is:"  +this.registrationFee + "\nyou are partcicipant number: " +this.getParticipantNo());

		}
	 }
}
