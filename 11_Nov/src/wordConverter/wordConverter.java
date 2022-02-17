package wordConverter;

public class wordConverter {
	
	public String getWordtoString(String str)
	{
		int input = Integer.parseInt(str);
		if(input<10000 && input>1000)
		{
		int unitPlace = input%10;
		
		int tensplace = (input%100)/10;
		
		int thousandplace = (input%1000)/100;
		
		int thousand = input/1000;
		
		String retstr="";
		retstr += getNumInWord(thousand)+" thousand"+" ";
		retstr+= getNumInWord(thousandplace)+" hundred"+ " ";
		retstr+= getNumInWord(tensplace)+" ";
		retstr+= getNumInWord(unitPlace);
		
		return retstr;
		}
		else if(input <1000)
		{
			int unitPlace = input%10;
			
			int tensplace = (input%100)/10;
			
			int thousandplace = (input%1000)/100;
			
			String retstr="";
			
			retstr+= getNumInWord(thousandplace)+" hundred"+ " ";
			retstr+= getNumInWord(tensplace)+" ";
			retstr+= getNumInWord(unitPlace);
			
			return retstr;
		}
		else
			return ("Error : invalid input....Enter Value inbetween 100 to 10000 ");
	}
	
	private String getNumInWord(int num) {
		
		switch (num)
		{
		//case 0: return "zero";
		case 1: return "one";
	
		case 2: return "two";
		
		case 3: return "three";
	
		case 4: return "four";
		
		case 5: return "five";
		
		case 6 : return "six";
		case 7 : return "seven";
		case 8 : return "eight";
		case 9 : return "nine";
		default : return "";
		}
	}

}
