package Practice;

public class Chocolate {
	private int barCode, weight, cost;
	private String name;
	
	public Chocolate(String name, int barCode, int weight, int cost)
	{
		this.name=name;
		this.barCode=barCode;
		this.weight=weight;
		this.cost=cost;
		
	}
		
	public int getBarCode() {
		return barCode;
	}


	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
