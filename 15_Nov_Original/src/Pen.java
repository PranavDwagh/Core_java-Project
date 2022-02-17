package study.polymorphism;

public class Pen {

	String color;
	double cost;
	public Pen(String color, double cost) {
		super();
		this.color = color;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if ( obj instanceof Pen)
		{
		Pen temp =(Pen)obj;
		if( this.color.equals(temp.color) && (this.cost==temp.cost))
		return true;
		else
			return false;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		String peninfo = "color of pen is "+color+" and its cost is  "+cost;
		return peninfo;
	}
	
}
