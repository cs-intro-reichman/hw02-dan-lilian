/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String word = args[0];
		int m = word.length();
		String rword = "";
		for (int l=m; l>0 ;l--)
		{
			rword = rword + word.charAt(l-1);

		}
		System.out.println(rword);
		System.out.println("The middle character is " + word.charAt((m-1)/2));

	}
}
