import java.io.*;
public class FileSize {
	//Challenge for CodeEval.
	//https://www.codeeval.com/open_challenges/26/
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        System.out.println(file.length());
        }
    }