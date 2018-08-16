
public class SingleEventRegistration extends EventRegistration{
	int participantNo;
	
	
	
	SingleEventRegistration (String name, String nameOfEvent, int participantNo)
	{
		super(name,nameOfEvent);
		this.participantNo=participantNo;
	}
	
	int getparticipantNo ()
	{
		return participantNo;
	}
	
	void setparticipantNo (int participantNo)
	{
		this.participantNo=participantNo;
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
		case "PlayAway":
			registrationFees=130;
			break;
		default:
			registrationFees=0;
			System.out.println("You have entered wrong event name");
		}
		System.out.println("Cusotmer name is:" + name);
		System.out.println("Your participant number is:" + participantNo + " and registration fees is:" + registrationFees);
	}
}
