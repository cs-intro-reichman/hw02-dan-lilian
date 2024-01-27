/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int current = (int)(10*Math.random());
		int previous = current;
		do {
			previous = current;
			System.out.print(current + " ");
			 current = (int)(10*Math.random());
		} while (current >= previous);
			
	}
}
