package Practice;

public class PlayerRating 
{
	int playerPosition;
	String playerName;
	float criticOneRating;
	float criticTwoRating;
	float criticThreeRating;
	float averageRating;
	char category;
	
	public PlayerRating(String playerName, int playerPosition)
	{
		this.playerPosition = playerPosition;
		this.playerName=playerName;
	}
	
	public void calculateAverageRating(float criticOneRating,float criticTwoRating )
	{
		this.criticOneRating=criticOneRating;
		this.criticTwoRating=criticTwoRating;
		 this.averageRating = (criticOneRating+criticTwoRating)/2; 
	}
	public void calculateAverageRating(float criticOneRating,float criticTwoRating, float criticThreeRating )
	{
		this.criticOneRating=criticOneRating;
		this.criticTwoRating=criticTwoRating;
		this.criticThreeRating=criticThreeRating;
		this.averageRating = (criticOneRating+criticTwoRating+criticThreeRating)/3;
		
	}
	
	public void calculateCategory()
	{
		if(averageRating>8)
		{
			category = 'A';
			//System.out.println("The category of player is: " +category);
			
		}else if(averageRating>5 && averageRating<=8)
		{
			category = 'B';
			//System.out.println("The category of player is: " +category);
		}else
		{
			category = 'C';
			//System.out.println("The category of player is: " +category);
		}
	}
	public void display()
	{
		System.out.println("The player name is: " +playerName);
		System.out.println("The player position is: " +playerPosition);
		System.out.println("The average rating is: " +averageRating);
		System.out.println("The category of player is: " +category);
	}
	
}
