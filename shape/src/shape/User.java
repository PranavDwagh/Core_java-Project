package shape;

public class User {
	
	static final double PER_SQFT_COST = 2000;
	public static void main(String[] args) {
		
		Shape c1  = new Circle(20);
		Shape r1 = new Rectangle(10, 20);
		Shape t1 = new Triangle(10, 15);
		
		double circle =getPlotCost(c1);
		double  rectangle = getPlotCost(r1);
		double triangle = getPlotCost(t1);
		System.out.println("Circle Area :"+circle);
		System.out.println("Rectangle Area:" +rectangle);
		System.out.println("Triangle Area :" +triangle);
	}
	
	
	public static double getPlotCost(Shape obj)
	{
			
		  return obj.area() * PER_SQFT_COST;
		
	}
	

}
