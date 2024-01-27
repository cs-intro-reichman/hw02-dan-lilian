/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		for (int rows = 1; rows<= n; rows++)
		{
			if (rows%2 != 0)
			{
			for (int columns = 1; columns<=n; columns++)
		      {
				System.out.print("* ");
		      }
			}else 
			  {
				if (rows%2 == 0)
				{
					for (int columns = 1; columns<=n; columns++)
					{
					  System.out.print(" *");
					}	
				}
		      }
			System.out.println();
	    }
    }
}