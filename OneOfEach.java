
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean both= false;
		int boys=0;
		int girls = 0;
		while (both != true)
		{
			double birth = 1*Math.random();
			if (birth>=0.5)
			{
				boys++;
				System.out.print("b ");
			} else 
			  {
				girls++;
				System.out.print("g ");
			  }
			if (boys>=1 && girls>=1)
			    both = true;

		}
		System.out.println();
		System.out.println("You made it... and you now have "+ (boys + girls) + " children.");
		}
	}

