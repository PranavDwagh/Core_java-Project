package study.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class MonthlyExpense {

	List<ExpenseDetails> list = new ArrayList<ExpenseDetails>();
	
	GregorianCalendar calObj = new GregorianCalendar();
	
	public MonthlyExpense()
	{
		//default Constructor
	}
	
	public void addNewExpense(ExpenseDetails obj) throws NotCourrentMonthException
	{
		//if (obj.getExpDate().getYear() == calObj.get(Calendar.YEAR) && obj.getExpDate().getMonth() == calObj.get(Calendar.MONTH+1))
			if (obj.getExpDate().getYear() == 2021 && obj.getExpDate().getMonth() == 11)
		list.add(obj);
		else
		{
			//System.out.println("Current Month :"+obj.getExpDate().getMonth());
			//System.out.println("Current Month :"+calObj.get(Calendar.MONTH+1));
//			System.out.println("Bill "+obj.getDesc()+ " not added to list as its not belongs to current month");
		
			throw new NotCourrentMonthException();
		
		}
	}
	
	public void  showAll()
	{
		for(int i=0 ;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	public  double getTotalExpenditure()
	{
		double sum =0;
		for(int i=0; i<list.size();i++)
		{
			sum = sum + list.get(i).getAmount();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "MonthlyExpense [list=" + list + "]";
	}
	
	
	
	
}
