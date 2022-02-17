package study.practice;

public class UserQ3 {
	public static void main(String[] args) {

		MonthlyExpense exp = new MonthlyExpense();
		
		ExpenseDetails d1 = new ExpenseDetails("Lunch", 500, new Date(25,11,2021));
		ExpenseDetails d2 = new ExpenseDetails("Dinner", 200, new Date(5,11,2021));
		ExpenseDetails d3 = new ExpenseDetails("Shopping", 100, new Date(20,11,2021));
		ExpenseDetails d4 = new ExpenseDetails("Treaking", 400, new Date(28,11,2021));
		ExpenseDetails d5 = new ExpenseDetails("Swimming", 600, new Date(18,1,2021));
		
		try
		{
		exp.addNewExpense(d1);
		exp.addNewExpense(d2);
		exp.addNewExpense(d3);
		exp.addNewExpense(d4);
		exp.addNewExpense(d5);
		}
		catch (NotCourrentMonthException e) {
			System.out.println(e.getMessage());
		}

		exp.showAll();
		double totalExpenditure = exp.getTotalExpenditure();
		
		System.out.println("Total Expendiure:"+totalExpenditure);
		
	}
}
