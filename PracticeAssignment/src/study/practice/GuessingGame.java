package study.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num = random.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int x=0;
		
		while(x++<5)
		{
			System.out.println("Guess the number");
			int guess = sc.nextInt();
		if (guess>num)
		{
			System.out.println("Wrong Guess....Hint number is lesser than "+guess);
		}
		else if(guess<num)
		{
			
			System.out.println("Wrong Guess....Hint number is grater than "+guess);
		}
		else
		{
			System.out.println("Bingo!!!......Correct Guess");
			break;
		}
		
		}
		System.out.println("You ran out of the attempts");
		System.out.println("Correct number is "+num);
	}

}
