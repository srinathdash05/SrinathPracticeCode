package OverriddingAndSuper;

public class TalentRegistration {

	public static void main(String[] args) 
	{
		EventRegistration er = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		er.registerEvent();
		EventRegistration er1 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		er1.registerEvent();
		EventRegistration er2 = new TeamEventRegistration("Aura", "ShakeAleg", 1,5);
		er2.registerEvent();
	}

}
