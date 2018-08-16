
public class PlayerRating {

	int playerPosition;
	String playerName;
	float criticOneRating;
	float criticTwoRating;
	float criticThreeRating;
	float averageRating;
	char category;
	
	PlayerRating(int playerPosition, String playerName)
	{
		this.playerPosition=playerPosition;
		this.playerName=playerName;
	}
	
	void calculateAverageRating (float criticOneRating, float criticTwoRating )
	{
		averageRating=(criticOneRating+criticTwoRating)/2;
		caculateCategory();
		display();
		
	}
	
	void calculateAverageRating (float criticOneRating, float criticTwoRating, float criticThreeRating )
	{
		averageRating=(criticOneRating+criticTwoRating+criticThreeRating)/3;
		caculateCategory();
		display();
	}
	
	void caculateCategory ()
	{
		if (averageRating > 8)
		{
			category='A';
		} else if (averageRating > 5 && averageRating <= 8)
		{
			category='B';
		} else
		{
			category='C';
		}
	}
	
	void display ()
	{
		System.out.println("The player name is:" + playerName);
		System.out.println("The player position is:" + playerPosition);
		System.out.println("The aveage rating is:" + averageRating);
		System.out.println("Rating of Player is:" + category);
	}
}
