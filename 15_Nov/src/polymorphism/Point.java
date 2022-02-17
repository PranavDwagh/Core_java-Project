package polymorphism;

public class Point {
	
	private int x;
	private int y;

	
	public Point()
	{
		x=0;
		y=0;
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		String str;
		str= "X= "+x+ " Y="+y;
		
		return str;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Point temp =(Point)obj;     // obj Downcasted to Point    as Object is parent class of Point...here need we need to downcast
		if(this.getX() == temp.getX() && this.getY() == temp.getY())
		   return true;
		else
			return false;
	}
	
	
	
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
