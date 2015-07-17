import java.util.Scanner;
import java.io.*;
public class EvenNumbers {
	/*
	 * Challenge for CodeEval.
	 * Determine if a number is even or odd and print a corresponding 0 or 1.
	 * Full Challenge Description: https://www.codeeval.com/open_challenges/100/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int num = 0;
        while ((line = buffer.readLine()) != null) {
            Scanner s = new Scanner(line);
            if (s.hasNextInt())
            {
            num = s.nextInt();
            System.out.println(((num % 2) + 1) % 2);
            }
        }
    }
}