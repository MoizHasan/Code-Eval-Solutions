import java.io.*;
import java.math.*;
public class ArmStrongNumbers {
	/**
	* An Armstrong number is an n-digit number 
	* that is equal to the sum of the n'th powers of its digits. 
	* Determine if the input numbers are Armstrong numbers. 
	*/
	
	
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            int n = line.length();
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += Math.pow(Integer.parseInt(line.charAt(i)+""), n);
            }
            if(sum == Integer.parseInt(line)){
            	System.out.println("True");
            }
            else{
            	System.out.println("False");
            }
        }
    }
}