package srinath.srinath;

public class Singleton 
{
	private static Singleton Instance;
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(Instance == null)
		{
			synchronized(Singleton.class)
			{
				if(Instance == null)
				{
					Instance = new Singleton();
				}
			}
		}
		return Instance;
	}
}
