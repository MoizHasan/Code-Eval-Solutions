import java.io.*;
import java.util.Scanner;
public class RightMostChar {
	/*
	 * Challenge for Code Eval.
	 * Find the rightmost occurrence of a given character in a given string.
	 * Full Challenge Description: https://www.codeeval.com/open_challenges/31/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String str = "";
            String find = "";
            Scanner s = new Scanner(line).useDelimiter(",");
            if(s.hasNext()) {
                while(s.hasNext()){
            str = s.next();
            find = s.next();
                }
            System.out.println(str.lastIndexOf(find));
            }
        }
    }
}