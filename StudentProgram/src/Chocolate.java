
public class Chocolate {
	int barcode;
	String name;
	int weight;
	int cost;
	
	Chocolate()
	{
		barcode=101;
		name="Cadbury";
		weight=12;
		cost=10;
	}
	
	int getBarCode ()
	{
		return barcode;
	}
	
	void setBarCode (int barcode)
	{
		this.barcode=barcode;
	}
	
	String getName ()
	{
		return name;
	}
	
	void setName (String name)
	{
		this.name=name;
	}
	
	int getWeight ()
	{
		return weight;
	}
	
	void setWeight (int weight)
	{
		this.weight=weight;
	}
	
	int getCost ()
	{
		return cost;
	}
	
	void setCost (int cost)
	{
		this.cost=cost;
	}
	
	
}
