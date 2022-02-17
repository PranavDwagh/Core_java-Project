package study.polymorphism;

public abstract class Shape {

	public abstract  double area(); //generalized
	/*{
		//WHAT IS THE FORMULA to calculate area of SHAPE ? 
	}*/
	
} //end of Shape


class Circle extends Shape
{
	double radius;
	
	public Circle(double r)
	{
		radius = r;
	}
	public double areaofcircle()
	{
		return 3.14*radius*radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		 return 3.14*radius*radius;
	}
	
}


