package study.polymorphism;

public class UserOFPlayable {

	public static void main(String[] args) {
		//Playable obj = new Playable();
		
		Playable obj = new Football();
		obj.startPlay();
		((Viewable)obj).viewOnTV();
		
		Viewable v1 = new Football();
		v1.viewOnTV();
	}

}

