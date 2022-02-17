package polymorphism;

public class Circle {
		
	private int rad;
	Point center;
	
	
	public Circle()
	{
		rad = 0;
		center = new Point();
	}
	
	public Circle(int r, Point p)
	{
		rad = r;
		center = p;
	}
	
	public String toString()
	{
		String str;
		
		str = "Radius :"+ rad+" Center"+ center;
		return str;
	}
	@Override
	public boolean equals(Object obj)
	{
		Circle temp =(Circle)obj;
		 
		if((this.getRad()==temp.getRad()))
		{
			Point tmp = (Point)temp.getCenter();
			if(this.getCenter().getX()==tmp.getX() && (this.getCenter().getY()==tmp.getY()))
			{
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public void setCenter(Point p)
	{
		center = p;
	}
	public Point getCenter()
	{
		return center;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}
	
	
}
