package hgfhgf;


public class Main {

	public static void main(String[] args) {

		System.out.println("Input:" + args[0]);
		WordConvertor wordConvertor = new WordConvertor();
		String word = wordConvertor.getNumbersInWords(args[0]);
		
		System.out.println(word);
		
	}

}
