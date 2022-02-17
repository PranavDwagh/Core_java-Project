package study.polymorphism;

import study.MyDate;

public interface IWork {
	
	//abstract methods
	public void work();
	
	default public void takeoff()
	{
		System.out.println("take a paid leave ");
	}
}


interface IPlay
{
	//abstract method
	public void play();
	
	default public void takeoff(int x, MyDate d)
	{
		this.play();
		System.out.println("take rest");
	}
}


class ME implements IWork , IPlay
{

	@Override
	public void work() {
		System.out.println("Take core java sessions");
		
	}

	@Override
	public void takeoff() {
	
		System.out.println("I sleep a little and walk in the hills");
	}

	@Override
	public void play() {
	
		System.out.println(" I play anything");
		
	}
	
}

