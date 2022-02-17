package study.polymorphism;

public class EstateAgent {
	
	static final double PER_SQFT_COST = 2000;
	public static void main(String[] args) {
		
		double plotcost =getPlotCost(new Circle(20));
		double pc = getPlotCost(new Rectangle(20, 30));
		System.out.println(plotcost);
	}
	
	//OCP = Open for new shapes in hierarchy 
	//Closed for modification
	public static double getPlotCost(Shape obj)
	{
			
		  return obj.area() * PER_SQFT_COST;
		
		  
		/*
			if( obj instanceof Circle)
			    c = ((Circle)obj).areaofcircle() * PER_SQFT_COST;
			
			if( obj instanceof Rectangle)
			    c = ((Rectangle)obj).areaOfRectangle() * PER_SQFT_COST;
			
			if( obj instanceof Triangle)
			    c = ((Triangle)obj).areaoftriangle() * PER_SQFT_COST;
			    
	*/
			
			
			
			
	}
	

}
