import java.io.*;
import java.util.*;

public class SpiralPrinting {
	/*
	 * Hard Challange for CodeEval. Full challange description: 
	 * https://www.codeeval.com/open_challenges/57/
	 * 
	 * array spiral take line of text from file and create array from it e.g.
	 * 3;3;1 2 3 4 5 6 7 8 9 print out the arrays content's in clockwise
	 * 'spiral' order.   [1][2][3] 
	 * 1 2 3 6 9 8 7 4 5 [4][5][6] 
	 * 					 [7][8][9]
	 */
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[][] array;
		while ((line = buffer.readLine()) != null) {
			Scanner s = new Scanner(line).useDelimiter(";");
			int row = s.nextInt();
			int col = s.nextInt();
			array = new String[row][col];
			line = line.substring(line.lastIndexOf(";") + 1, line.length());

			// get out remaining chars.
			String[] strArray = line.split(" ");

			// populate array.
			int itr = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					array[i][j] = strArray[itr];
					itr++;

				}
			}
			String spiral = "";
			int rightBound = col - 1;
			int lowerBound = row - 1;
			int leftBound = 0;
			int upperBound = 0;
			int total = 0;

			while (total < row * col) {
				// right
				// depletes top row
				for (int i = leftBound; i <= rightBound && total < row * col; i++) {
					spiral += array[upperBound][i] + " ";
					total++;
				}
				upperBound++;

				// down
				// depletes rightmost column
				for (int i = upperBound; i <= lowerBound && total < row * col; i++) {
					spiral += array[i][rightBound] + " ";
					total++;
				}
				rightBound--;
				// left
				// depletes lowest row
				for (int i = rightBound; i >= leftBound && total < row * col; i--) {
					spiral += array[lowerBound][i] + " ";
					total++;
				}
				lowerBound--;
				// up
				// depletes leftmost column
				for (int i = lowerBound; i >= upperBound && total < row * col; i--) {
					spiral += array[i][leftBound] + " ";
					total++;
				}
				leftBound++;
			}

			System.out.println(spiral);
		}
	}
}
