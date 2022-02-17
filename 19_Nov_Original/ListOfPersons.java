package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfPersons {

	public static void main(String[] args) {
		
		List<Person2> persons = new ArrayList<Person2>();
		
		persons.add(new Person2("Raghuveer", new MyDate3(19,11,2021)));
		persons.add(new Person2("Leena" ,new MyDate3(31,12,2021)));
		persons.add(new Person2("Zubin", new MyDate3(15,8,1947)));
		persons.add(new Person2("Asma" , new MyDate3(26,1,1950)));
		persons.add(new Person2("Sonu",new MyDate3(1,1,2000)));
		
		
		for(Person2 p: persons)
			System.out.println(p);
		
		//Collections.sort(persons);  //natural ordering basis
		Collections.sort(persons, new SortOnNameLength()); //other basis
		
		System.out.println("\nafter ...\n");
		for(Person2 p: persons)
			System.out.println(p);	
	}//end of main
}//end of class

class SortOnDOBBasis implements Comparator<Person2>
{
	@Override
	public int compare(Person2 o1, Person2 o2) {
		
		return o1.getDob().compareTo(o2.getDob());
	}	
}

class SortOnNameLength implements Comparator<Person2>
{
	@Override
	public int compare(Person2 o1, Person2 o2) {
		if(o1.getName().length() >  o2.getName().length()) return 1;
		if(o1.getName().length() <  o2.getName().length()) return -1;
		else
		return 0 ; 
		
	}
	
}



