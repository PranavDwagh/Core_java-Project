package polymorphism;

public class Product {
	
	String productName;
	
	String desc;
	int cost;
	Date doe;
	
	public Product(String n, String des, int c, Date d)
	{
		productName = n;
		desc = des;
		cost = c;
		doe = d;
	}
	
	public String toString()
	{
		String str;
		str = "Product Name :"+productName+ "\nDescription : "+desc+ "\nCost :"+cost+"\nDate of Expiry"+doe;
		return str;
	}
	@Override
	public boolean equals(Object obj)
	{
		Product p = (Product)obj;
		if (this.getProductName().equals(p.getProductName()) && this.getDesc().equals(p.getDesc()) && this.getCost() ==(p.getCost()))
		{
			Date d = (Date)p.getDoe();
			if(this.getDoe().getYear() == d.getYear() && this.getDoe().getMonth() == d.getMonth() && this.getDoe().getDay()==d.getDay()) 
			return true;
			else
				return false;
		}
		else
		return false;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}
	
	
	

}
