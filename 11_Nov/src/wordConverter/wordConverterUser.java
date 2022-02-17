package wordConverter;

public class wordConverterUser {
	public static void main(String[] args) {

		wordConverter input = new wordConverter();
		
		String str =input.getWordtoString(args[0]);
		
		System.out.println(str);
		
	}
}
