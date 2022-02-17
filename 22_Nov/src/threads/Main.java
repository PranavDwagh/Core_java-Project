package threads;

public class Main {

	public static void main(String[] args) {

		Thread square = new SquareThread();
		square.setName("Square->");
		Thread factorial = new FactorialThread();
		factorial.setName("Factorial->");
		square.start();
		factorial.start();
	}

}
