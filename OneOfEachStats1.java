/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int familiesOf2 = 0;
		int familiesOf3 = 0;
		int familiesOf4OrMore = 0;
		double average = 0;
		for(int tests = 1; tests <= T;tests++ )
		{
			boolean both= false;
		    int boys=0;
		    int girls = 0;
		    while (both != true)
		    {
			   double birth = 1*Math.random();
			   if (birth>=0.5)
			     {
			  	    boys++;
			     } else 
			        {
				      girls++;
			        }
			   if (boys>=1 && girls>=1)
			        both = true;

			}
			if ((boys+girls)==2)
			{
				familiesOf2++;
			} else if ((boys+girls) == 3)
			{
				familiesOf3++;
			} else
			 {
				familiesOf4OrMore ++;
			 }
			average = average + (boys+girls);
	    }
		System.out.println("Average: " + (average/T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesOf2);
		System.out.println("Number of families with 3 children: " + familiesOf3);
		System.out.println("Number of families with 4 or more children: " + familiesOf4OrMore);
		int mostCommom =Math.max(familiesOf2,(Math.max(familiesOf3, familiesOf4OrMore)));
		if (mostCommom==familiesOf2)
		{
			System.out.println("The most common number of children is 2.");
		} else 
		{
			if (mostCommom==familiesOf3)
			{
				System.out.println("The most common number of children is 3.");
			} else
		       {
			   System.out.println("The most common number of children is 4 or more.");
		       }
		 } 

    }
}
