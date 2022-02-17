package shape;

public class Circle extends Shape
{
	double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		 return 3.14*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}