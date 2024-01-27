/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int N = Integer.parseInt(args[0]);
		String s = "1";
		int sum = 1;
		for (int d = 2; d<N ; d++){
			if (N%d == 0)
			{
				s = s + " + " + d;
				sum = sum + d;
			}
		}
		if (sum == N)
		  {
			System.out.println(N + " is a perfect number since " + N + " = " + s);
		  } 
		else 
		  {
			System.out.println(N + " is not a perfect number");
		  }
		  

	}
}
