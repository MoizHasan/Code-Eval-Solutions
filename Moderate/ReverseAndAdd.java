
import java.io.*;

public class ReverseAndAdd {
	/*
	 * Challange for CodeEval
	 * Full challange description:
	 * https://www.codeeval.com/open_challenges/45/
	 */

	public static boolean isPalindrome(String a) {
		return (a.compareTo(reverse(a)) == 0);
	}

	public static String reverse(String a) {
		return new StringBuilder(a).reverse().toString();
	}

	public static void main(String[] args) throws IOException {
		// take a number and reverse the digits.
		// add to orig. number
		// repeat until the number is a palindrome
		// Print number and iterations
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int count = 0;
			
			//Need to use long here to avoid possible int overflow.
			long num = Long.parseLong(line);
			while (!(isPalindrome(num + ""))) {

				num += Long.parseLong(reverse(num + ""));
				count++;
			}
			System.out.println(count + " " + num);
		}

	}
}