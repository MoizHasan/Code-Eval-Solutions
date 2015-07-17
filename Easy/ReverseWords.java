import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWords {
	/*
	 * Challange for Code Eval. Reversing the words in an input sentence.
	 * Full Description available at: https://www.codeeval.com/open_challenges/8/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	String out = "";
            line = line.trim();
            Scanner s = new Scanner(line);
            ArrayList<String> list = new ArrayList<String>();
            if (s.hasNext()) {
            	while(s.hasNext()) {
            		list.add(s.next());
            	}
            	
            	//traverse the list backwards and add each word to the string.
            	for(int i = list.size() - 1; i  >= 0; i--){
            		out += list.get(i) + " ";
            	}
            	out.trim();
            	System.out.println(out);
            }
        }
    }
}

