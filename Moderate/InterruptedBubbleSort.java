import java.io.*;

public class InterruptedBubbleSort {
	/*
	 * Challange for Code Eval.
	 * Bubble sort with specified number of iterations.
	 * Full Description: https://www.codeeval.com/open_challenges/158/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String nums = line.substring(0, line.lastIndexOf("|"));
            int itr = Integer.parseInt(line.charAt(line.length() - 1)+"");
            
            //populate array from string
            String[] strArray = nums.split(" ");
            int[] intArray = new int[strArray.length];
            for(int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            
            //bubble sort where our read in itr replaces the array size.
            for(int i = 0; i < itr; i++){ 
        		for(int j = 1; j < intArray.length - i; j++){
        			if ((intArray[j-1]) > (intArray[j])){
        				int temp = intArray[j-1];
        				intArray[j-1] = intArray[j];
        				intArray[j] = temp;
        			}
        		}
    		}
            
            //reform string of partially sorted ints.
            String out = "";
            for(int i = 0; i < intArray.length; i++){
            	out += intArray[i] + " ";
            }
            System.out.println(out.trim());
        }
    }
}