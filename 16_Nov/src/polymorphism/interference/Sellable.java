package polymorphism.interference;

public interface Sellable {
	
	public double  getSellingPrice();
	public void setDiscount(int discount);

}

class CD implements Sellable
{
	String name;
	String type;
	int cost;
	int duration;
	String artist;
	int discount;
	
	public CD()
	{
		System.out.println("Parameterless Constructor of CD ");
	}
	
	public CD(String name, String type, int cost, int duration, String artist) {
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "CD [name=" + name + ", type=" + type + ", cost=" + cost + ", duration=" + duration + ", artist="
				+ artist + "]";
	}
	
	@Override
	public double getSellingPrice() {
		return cost-discount;
	}

	@Override
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}

class Laptop implements Sellable

{
	
	String Brand;
	int ram;
	int hdd;
	String CPU;
	int  Cost;
	int discount;
	
	public  Laptop() {
		
		System.out.println("Parameterless Contructor of Laptop ");
	}
	
	
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}
	
   public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public Laptop(String brand, int ram, int hdd, String cPU, int cost) {
	
		Brand = brand;
		this.ram = ram;
		this.hdd = hdd;
		CPU = cPU;
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [Brand=" + Brand + ", ram=" + ram + ", hdd=" + hdd + ", CPU=" + CPU + ", Cost=" + Cost + "]";
	}

	@Override
	public double getSellingPrice() {
		
		return Cost-discount;
	}

	@Override
	public void setDiscount(int discount) {
		
		this.discount = discount;
	}
	
}








