import java.io.IOException;

public class MultiplicationTables {
	/*
	 * Challange for CodeEval. Print the multiplication tables up to 12x12.
	 * Full challange description: https://www.codeeval.com/open_challenges/23/
	 */
	
	public static void main(String[] args) throws IOException {
		//print multiplication table up to 12x12
		for(int i = 1; i <= 12; i++){
			String multi = "";
			for(int j = 1; j <= 12; j++){
				int temp = i*j;
				multi += (String.format("%1$" + 4 + "s", temp)); 
			}
			multi = multi.trim();
			System.out.println(multi);
		}
		}
	}