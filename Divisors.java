/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		for (int d = 1 ; x >= d ; d++ )
		{
			if ((x%d)==0)
			System.out.println(d);
		}
		
	}
}
