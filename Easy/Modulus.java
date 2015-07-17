import java.io.*;
import java.util.Scanner;
public class Modulus {
	/*
	 * Challange for Code Eval.
	 * Write a program that finds n mod m without using the operator itself.
	 * Full Description: https://www.codeeval.com/open_challenges/62/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int n = 0;
        int m = 0;
        while ((line = buffer.readLine()) != null) {
            Scanner s = new Scanner(line).useDelimiter(",");
            if (s.hasNext()){
            	n = s.nextInt();
            	m = s.nextInt();
            }
            
            int rem = (int) Math.floor((n/m));
             System.out.println(n - rem * m);
        }
    }
}