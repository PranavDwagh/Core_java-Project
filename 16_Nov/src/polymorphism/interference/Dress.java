package polymorphism.interference;

public class Dress extends Product {
	
	private String name;
	private String material;
	private char size;
	private int prize;
	
	public Dress()
	{
		System.out.println("Parameterless Constructor of Dress ");
	}

	public Dress(String name, String material, char size, int prize) 
	{
		this.name = name;
		this.material = material;
		this.size = size;
		this.prize = prize;
	}
	@Override
	public String toString()
	{
		String str = " Dress Name: "+name+ " material:"+material+ " size:"+size+" Prize : "+prize;
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String getdesc() {
		String str="";
		 str += " Dress Name: "+name+ " material:"+material+ " size:"+size+" Prize : "+prize;
		return str;
	}

	@Override
	public int getFinalCost() {
		return prize;
	}
	

}
