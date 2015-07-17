import java.io.*;

/*
 * Details challenge for CodeEval
 * challange description can be found at: 
 * https://www.codeeval.com/open_challenges/183/
 */

public class Details {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			int len = Integer.MAX_VALUE;
			
			//cells do not need to be shifted.
			if (line.contains("XY")) {
				len = 0;
			}
			
			//remove all X and Y characters.
			line = line.replace("X", "");
			line = line.replace("Y", "");
			
			//count the remaining dots and get the shortest length.
			String[] str = line.split(",");
			if (len > 0) {
				for (int i = 0; i < str.length; i++) {
					if (str[i].length() < len) {
						len = str[i].length();
					}
				}
			}
			System.out.println(len);
		}
	}
}