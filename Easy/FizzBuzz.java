
import java.io.*;
import java.util.*;
public class FizzBuzz {
	/*
	 * Fizz Buzz challange for Code Eval.
	 * Print all numbers in a given range multiples of fizz number replace with F
	 * multiples of buzz replace with B
	 * multiples of fizz and buzz replace with FB.
	 * Full Challange Description: https://www.codeeval.com/open_challenges/1/
	 */
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String temp;
            int fizz;
            int buzz;
            int last;
            
            Scanner s = new Scanner(line);
            fizz = s.nextInt();
            buzz = s.nextInt();
            last = s.nextInt();
            String out = "";
            
            for(int i = 1; i < last+1; i++) {
                if(i % fizz == 0 && i % buzz == 0){
                    out += ("FB ");
                }
                else if (i % fizz == 0) {
                    out += ("F ");
                }
                else if (i % buzz == 0) {
                    out += ("B ");
                }
                else {
                    out += i + " ";
                }
                
            }
           System.out.println(out.trim());
            }
        }
    }