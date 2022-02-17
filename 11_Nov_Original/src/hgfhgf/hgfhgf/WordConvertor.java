package hgfhgf;

//> two three four five
//>> two thousand three hundred and forty five....

public class WordConvertor {

	public String getNumbersInWords(String str) {

		// two three four five
		int input = Integer.parseInt(str);

		int unitPlace = input%10;
		System.out.println( "unitPlace:" + unitPlace );
		
		int tensPlace = (input%100)/10;
		System.out.println( "tensPlace:" + tensPlace );
		
		int hundPlace = (input%1000)/100;
		System.out.println( "hundPlace:" + hundPlace );
		
		int thousandPlace = (input)/1000;
		System.out.println( "thousandPlace:" + thousandPlace );

		String finalStr = "";
		finalStr += getWord(thousandPlace) + " ";
		finalStr += getWord(hundPlace) + " ";
		finalStr += getWord(tensPlace) + " ";
		finalStr += getWord(unitPlace) + " ";
		
		return finalStr;
	}

	private String getWord(int num) {
		
		switch (num) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";

		default:
			return "";
		}
	}

}
