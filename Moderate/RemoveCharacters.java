import java.io.*;
import java.util.Scanner;

public class RemoveCharacters {
	/*
	 * Challange for CodeEval.com
	 * Remove certain characters from a given string.
	 * 
	 * Full Challange Description: https://www.codeeval.com/open_challenges/13/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        //our given string.
        String text = "";
        
        //characters to remove.
        String scrub = "";
        
        while ((line = buffer.readLine()) != null) {
            Scanner s = new Scanner(line).useDelimiter(", ");
            if (s.hasNext()){
            	text = s.next();
            	scrub = s.next();
            }
            for(char c : scrub.toCharArray()){
            	text = text.replace(c+"","");
            }
            System.out.println(text);
        }
    }
}