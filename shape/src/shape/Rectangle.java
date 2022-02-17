package shape;

public class Rectangle extends Shape
{
	double length,breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length =length; 
		this.breadth =breadth;
	}
	
	@Override
	public double area() {
	
		return length*breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
}
