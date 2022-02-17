package interafce;

public interface Iwork {
	
	public /*abstract*/ void work();       // all methods in interface are by default abstract

	default public void takeoff()
	{
		System.out.println("take rest--- in Iwork");
	}
}

 interface Iplay
{
	public void play();
	
	
	default public void takeoff()
	{
		this.play();
		System.out.println("take rest -- in Iplay ");
	}
	
}
 
 class ME implements Iwork, Iplay
 {
    
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	 public void takeoff()
	{
		System.out.println("take off---ME  ");
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	 
 }
