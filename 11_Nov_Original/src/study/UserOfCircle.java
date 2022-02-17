package study;

public class UserOfCircle {

	public static void main(String[] args) {
		
		Circle obj = new Circle(5,new Point(12,10));
		
		Circle[] arr = new Circle[4];
		
		arr[0] = obj;
		arr[1]=new Circle(7,new Point(100,10));
		arr[2]=new Circle(6,new Point(110,10));
		arr[3]=new Circle(9,new Point(67,10));
		
		
//see all the radii and centers that have x coordinate greater
		//than 90
		
		for(int i=0;i<arr.length;i++)
		{
			
			//System.out.println(arr[i].getCenter().getX()+" , "+arr[i].getCenter().getY());
			Point temp = arr[i].getCenter();
			if(temp.getX() > 90) {
			System.out.print(arr[i].getRadius()+"   ");
			System.out.println(temp.getX()+","+temp.getY());
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
