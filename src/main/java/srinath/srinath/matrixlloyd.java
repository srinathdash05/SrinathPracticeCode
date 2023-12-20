package srinath.srinath;

public class matrixlloyd {
	public static void main(String[] args) 
	{
		String transactions_1[][] = {
				{"customer_4", "event_34", "7000"},
				{"customer_4", "event_37", "6000"},
				{"customer_6", "event_15", "3000"},
				{"customer_6", "event_36", "7000"},
				{"customer_6", "event_49", "4000"},
				{"customer_6", "event_67", "6000"},
				{"customer_6", "event_85", "6000"}};
		
		report_sales(transactions_1);
	}
	
	static void report_sales(String[][] trans){
		
		int count=1, res=0;
		
		for(int i=0;i<trans[0].length;i++)
		{
			for(int j=0;j<trans.length;j++)
			{
				String match = trans[j][0];
				System.out.println(match);
				
				if(trans[j][0].matches(match))
				{
					count++;
					res = Integer.parseInt(trans[j][2]) + Integer.parseInt(trans[0][2]);
				}
			}
			System.out.println("Again i loop");
		}
		System.out.println(trans[0][0]+": ("+count+", "+res+")");
	}
	

}
