package polymorphism.interference;

public class Toy extends Product{

	private String name;
	private String category;
	private int cost;
	
	
	public Toy()
	{
		System.out.println("Constructorless parameter of toy");
	}
	
	public Toy (String name, String category, int cost)
	{
		this.name = name;
		this.category  = category;
		this.cost = cost;	
	}
	@Override
	public String toString()
	{
		String str;
		str = " Toy Name :"+ name+ " Category :"+category+ " Cost :"+cost;
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String getdesc() {
		
		String str= "";
		str += "Product Name: "+ name+ " Category :"+category+ " Cost :"+cost;
		return str;
	}
	@Override
	public int getFinalCost() {
		return cost;
	}
	
	
	
}
