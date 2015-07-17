import java.util.Scanner;
import java.io.*;

public class NumberOfOnes {
	/*
	 * Challange for Code Eval.
	 * Print the Number of 1's in the binary representation of a given integer.
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
                String str = Integer.toBinaryString(num);
               int count = str.length() - str.replace("1", "").length();
               System.out.println(count);
            }
        }
    }
}