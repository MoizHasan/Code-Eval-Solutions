import java.io.*;
import java.util.Scanner;

public class Multiples {
	/*
	 * Challange for Code Eval.
	 * Find the smallest multiple of n that is greater than or equal to x.
	 * Full Challange Description: https://www.codeeval.com/open_challenges/18/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int x = 0;
            int n = 0;
            Scanner s = new Scanner(line).useDelimiter(",");
            if(s.hasNext()){
            	x = s.nextInt();
            	n = s.nextInt();
            }
            int temp  = n;
            while(n < x)
            	n += temp;
            System.out.println(n);
        }
    }
}