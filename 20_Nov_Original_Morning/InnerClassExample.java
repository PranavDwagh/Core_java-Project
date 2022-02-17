package study.lambda;

import study.lambda.TheOuter.TheInner;

public class InnerClassExample {

	public static void main(String[] args) {
		TheOuter.TheInner obj = new TheOuter().new TheInner();
		
		TheInner obj2;
		obj.show();
		
	}//end of main
}//end of InnerCLassExample

class TheOuter
{
	private int x=100;
	private int p = 500;
	private static int z=300;
	
	public void display()
	{
		TheInner ti = new TheInner();
		System.out.println(x+" "+p+" "+z+" "+ti.y+" "+ti.x);
	}
	
	class TheInner implements Comparable<TheInner>
	{
		private int y=200;
		private int x = 1000;
		
		public void show()
		{
//the inner class can access the private fields and all fields and methods of outer class
			System.out.println(TheOuter.this.x+"  "+x+" "+y+" "+z+" "+p);
		}

		@Override
		public int compareTo(TheInner arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
	}//end of Inner	
	
}//end of Outer