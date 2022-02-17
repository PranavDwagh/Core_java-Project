package HasA;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Circles to be Created");
		int n = sc.nextInt();
		
		Circle []c = new Circle [n];
		
		populateCircle(c);
		
		showradius(c);
		
		range(c);
		
		showYCordinate(c);
		
		
	}
	private static void showYCordinate(Circle[] c) {
		
		for (int i=0; i<c.length; i++)
		{
			System.out.print("Y Cordinates of circle "+(i+1)+" "+c[i].getCenter().getY()+" ");
		}
		System.out.println("");
		
	}
	/*how the centers and radii of all circles whose y coordinate is between 10 and 90*/

	private static void range(Circle[] c) {
		
		boolean flag =true;
		System.out.println("Circle with Y cordinate in between 10 and 90"); 
		for(int i=0; i<c.length; i++)
		{
			if (c[i].getCenter().getY()<90 && c[i].getCenter().getY()>10 )
			{
				flag=false;
				System.out.println(c[i].getCenter().getY());
			}
		}
		if(flag == true)
			System.out.println("There is no circle whose Y cordinate in between 10 and 90");
	}

	private static void showradius(Circle[] c) {
		
		for (int i=0; i<c.length;i++)
		{
			System.out.print("Radius of Circle "+(i+1)+"-->"+c[i].getRad()+" ");
		}
		System.out.println("");
	}
	
	
	private static void populateCircle(Circle[] c) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<c.length; i++)
		{
			System.out.println("Enter Radius of cirlce ");
			int rad = sc.nextInt();
			System.out.println("Enter X Cordinate ");
			int x= sc.nextInt();
			System.out.println("Enter Y Cordinate");
			int y = sc.nextInt();
			
			c[i] = new Circle(rad, new Point(x,y));
		}
		
	}
}
