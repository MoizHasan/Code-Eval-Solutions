import java.io.*;
import java.util.Scanner;
public class ReadMore {
	/*
	 * Challange for Code Eval.
	 * Shorten a line of text and add read more to the end.
	 * Full Description: https://www.codeeval.com/open_challenges/167/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = buffer.readLine()) != null) {
            Scanner s = new Scanner(line);
           if (line.length() > 55){
        	   line = line.substring(0, 40);
        	   
        	   //Need to shorten to last complete word inside of 40 characters.
        	   if (line.contains(" ")){
        	   line = line.substring(0, line.lastIndexOf(' '));
        	   }
        	   line += "... <Read More>";
           }
            System.out.println(line.trim()); 
        }
    }
}