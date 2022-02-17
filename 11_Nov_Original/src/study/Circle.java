package study;

public class Circle {
	
	private double radius;
	private Point center;
	
	public Circle()
	{
		radius = 1;
		center = new Point();
	}

	
	public Circle(int r, Point p)
	{
		radius = r; 
		center = p;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	
	
	
	
	
	
	
	
	
}
