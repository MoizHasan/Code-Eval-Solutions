import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SimpleSort {
	/*
	 * Simple Sort Challange for Code Eval.
	 * Sort a list of numbers and display 3 trailing decimals.
	 * full challange description available at:
	 * https://www.codeeval.com/open_challenges/91/
	 */
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			String sorted = "";
			String[] temp = line.split(" ");
			double[] array = new double[temp.length];

			for (int i = 0; i < array.length; i++) {
				array[i] = Double.parseDouble(temp[i]);
			}
				
			Arrays.sort(array);
			
			//format the sorted array and form a String.
			for (int i = 0; i < array.length; i++){
				
				sorted += String.format("%.3f", array[i]) + " ";
			}
			System.out.println(sorted);
				
		}
	}
}