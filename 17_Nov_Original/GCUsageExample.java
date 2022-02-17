package study.gc;

public class GCUsageExample {
	public static void main(String[] args) {
		
		//MyBigData[] bigarr = new MyBigData[1000000];
		for(int i= 0;i<10;i++)
		{
			MyBigData obj = new MyBigData(); 
			System.out.println(i);
			System.gc();  //programmer request to JVM
		}
	}//end of main
}//end of GCUsageExample class
class MyBigData
{	long[] arr = new long[100000];	
	@Override
	public void finalize() throws Throwable {
		System.out.println(" GC will SWEEP this "+this +" ");
		
	}
}





