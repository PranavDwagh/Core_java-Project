package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListOfMyDates {

	public static void main(String[] args) {
		
		List<MyDate3> dates = new ArrayList<MyDate3>();
		dates.add(new MyDate3(19,11,2021));
		dates.add(new MyDate3(31,12,2021));
		dates.add(new MyDate3(15,8,1947));
		dates.add(new MyDate3(26,1,1950));
		dates.add(new MyDate3(1,1,2000)); 	
		
		
		/*
		 * for(int i=0;i<dates.size();i++) { for(int j=i+1;j<dates.size();j++) {
		 * if(dates.get(i).compareTo(dates.get(j)) > 0) { //SWAP } } }
		 */
		
		//sorted list
		
		Iterator<MyDate3> iter = dates.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
		
		Collections.sort(dates);
		
		System.out.println(" after sorting ....");
		
		iter = dates.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		

	}

}
