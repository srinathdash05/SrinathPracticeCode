package Practice;

public class MainPlayerRating {

	public static void main(String[] args) 
	{
		PlayerRating pr = new PlayerRating("Beckham", 1);
		pr.calculateAverageRating(9.0f,9.9f);
		//pr.calculateAverageRating(criticOneRating, criticTwoRating);
		pr.calculateCategory();
		pr.display();
		PlayerRating pr1 = new PlayerRating("oscar", 1);

		pr1.calculateAverageRating(1f, 1f, 1f);
		pr1.calculateCategory();
			pr1.display();

	}

}
