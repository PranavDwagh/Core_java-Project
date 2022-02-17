package product;

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
		str = "Product Name :"+productName+ "\nDescription : \n"+desc+ "\nCost :"+cost+"\n Date of Expiry"+doe;
		return str;
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
