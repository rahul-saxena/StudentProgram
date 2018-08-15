
public class EventRegistration {
	String name;
	String nameOfEvent;
	double registrationFees;
	
	EventRegistration()
	{
		
	}
	EventRegistration (String name, String nameOfEvent)
	{
		this.name=name;
		this.nameOfEvent=nameOfEvent;
	}
	
	String getName ()
	{
		return name;
	}
	
	void setName (String name)
	{
		
	}
	
	String getnameOfEvent ()
	{
		return nameOfEvent;
	}
	
	void setnameOfEvent (String nameOfEvent)
	{
		
	}
	
	double getregistrationFees ()
	{
		return registrationFees;
	}
	
	void setregistrationFees (double registrationFees)
	{
		
	}
	
	void registerEvent ()
	{
		switch (nameOfEvent)
		{
		case "ShakeALeg":
			registrationFees=100;
			break;
		case "Sing&Win":
			registrationFees=150;
			break;
		case "Actathon":
			registrationFees=70;
			break;
		case "PlayAway":
			registrationFees=130;
			break;
		default:
			registrationFees=0;
			System.out.println("You have entered wrong event name");
		}
		System.out.println("Your event name is:" + nameOfEvent + "and registration fees is:" + registrationFees);

	}

	
}
