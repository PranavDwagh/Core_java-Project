package study.polymorphism;

public interface Playable {
	
	void startPlay(); // by default all methods are abstract
	void stopPlay();
	abstract void showResult();

}//end of interface


interface Viewable
{
	void viewOnTV();
}


//Football is a playable 
class Football implements Playable,Viewable
{


	@Override
	public void startPlay() {
		System.out.println("play started");
		
	}

	@Override
	public void stopPlay() {
		System.out.println("play stopped");
		
	}

	@Override
	public void showResult() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewOnTV() {
		System.out.println("Viewer rights given to star sports ");
		
	}
	
}

