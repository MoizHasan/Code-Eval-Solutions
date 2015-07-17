
import java.io.*;
public class HexToDecimal {
	/*
	 * Challange for CodeEval.
	 * Full challange description: https://www.codeeval.com/open_challenges/67/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            //convert hex input to decimal output.
           System.out.println(Integer.parseInt(line, 16));
        }
    }
}