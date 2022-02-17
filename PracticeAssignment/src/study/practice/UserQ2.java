package study.practice;

public class UserQ2 {
	public static void main(String[] args) {

		
		ExpenseDetails expence2 = new ExpenseDetails("Lunch", 500, new Date(25, 11, 2021));
		ExpenseDetails expence = new ExpenseDetails("Lunch", 500, new Date(25, 11, 2021));
		ExpenseDetails expence1 = new ExpenseDetails("dinner", 100, new Date(26, 12, 2022));
		
		System.out.println(expence);
		System.out.println(expence1);
		System.out.println(expence2);
		
		if (expence.equals(expence1))
			System.out.println("Duplicate bill.....Exp1 and Exp2 aer same");
		else if(expence1.equals(expence2))
			System.out.println("Duplicate bill....Exp2 and Exp1 are same");
		else if(expence.equals(expence2))
			System.out.println("Duplicate bill....Exp and Exp2 are same");
		else
		System.out.println("No two bills are same");
	}
}
