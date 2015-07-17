import java.io.*;
public class Lowercase {
	/*
	 * Code Eval Challenge
	 * Take a give String and print it in lowercase.
	 * Full Description: https://www.codeeval.com/open_challenges/20/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(line.toLowerCase());
        }
    }
}