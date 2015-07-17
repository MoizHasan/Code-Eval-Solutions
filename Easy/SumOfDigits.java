import java.util.Scanner;
import java.io.*;
public class SumOfDigits {
	/*
	 * Add up the digits that make up a single int.
	 * Challenge for Code Eval.
	 * Full Challenge Description: https://www.codeeval.com/open_challenges/21/
	 */
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line = "";
		line.trim();
		Scanner s = new Scanner(line);
		while ((line = buffer.readLine()) != null) {
		    int sum = 0;
			for (int i = 0; i < line.length(); i++) {
				sum += Integer.parseInt(line.charAt(i) + "");
			}
			System.out.println(sum);
		}
	}
}