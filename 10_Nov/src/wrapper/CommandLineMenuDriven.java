package wrapper;

public class CommandLineMenuDriven {
	public static void main(String[] args) {
		
		for (String n:args)
		{
			if(n.equals("1"))
			{
				int mul=1;
				for(int i=2; i<=10; i++)
				{
					for (int j=1; j<=10;j++)
					{
						System.out.print(" " +i*j + " ");
					}
					System.out.println();
				}
			}
			else if(n.equals("2"))
			{
				System.out.println("Poem");
				
				System.out.println("Johney Johney Yes Pappa.....Rest I dont Remember..lol");
			}
			else if (n.equals("3"))
			{
				System.out.println("Your Life is message to people...Make sure it's Inspiring");
			}
			
			else if(!n.equals("1") || !n.equals("2") ||!n.equals("3"))
			{
				System.out.println("Please Enter Valid Input");
			}
				
		}
		
		
	}
}
