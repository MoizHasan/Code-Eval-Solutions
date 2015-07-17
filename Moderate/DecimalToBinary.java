import java.util.Scanner;
import java.io.*;
public class DecimalToBinary {
	
	/*
	 * Challange for CodeEval.
	 * Converting a read in decimal number to it's binary representation.
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int num = 0;
        while ((line = buffer.readLine()) != null) {
                num = Integer.parseInt(line);
               System.out.println(Integer.toBinaryString(num));
            }
        }
    }