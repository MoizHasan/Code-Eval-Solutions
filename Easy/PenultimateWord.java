import java.io.*;

public class PenultimateWord {
	/*
	 * Challange for Code Eval
	 * print the second to last word in a String.
	 * Full Challange Description: https://www.codeeval.com/open_challenges/92/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] str = line.split(" ");
            System.out.println(str[str.length-2]);
        }
    }
}