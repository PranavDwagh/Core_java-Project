package generics;

public class MyGeneric2 {
	public static void main(String[] args) {
		
		Generics<Date> date = new Generics<Date>(new Date[3]);
		
		date.push(new Date(10, 10, 2020));
		date.push(new Date(10, 8, 2021));
		date.push(new Date(12, 10, 2022));
		date.push(new Date(10, 10, 2123));
		for(int i=0;i<3;i++)
		{
		System.out.println(date.pop().getYear());
		}
		
	}

}
